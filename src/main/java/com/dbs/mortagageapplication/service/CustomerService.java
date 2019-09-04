package com.dbs.mortagageapplication.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.dbs.mortagageapplication.dto.CustomerDto;
import com.dbs.mortagageapplication.dto.CustomerLoansDto;
import com.dbs.mortagageapplication.dto.CustomerResponseDto;
import com.dbs.mortagageapplication.dto.LoansDto;
import com.dbs.mortagageapplication.entity.Customer;
import com.dbs.mortagageapplication.entity.CustomerLoans;
import com.dbs.mortagageapplication.entity.Loans;
import com.dbs.mortagageapplication.entity.Property;
import com.dbs.mortagageapplication.repository.CustomerLoansRepository;
import com.dbs.mortagageapplication.repository.CustomerRepository;
import com.dbs.mortagageapplication.repository.LoansRepository;

import com.dbs.mortagageapplication.common.Converter;

@Service
public class CustomerService {

	public static final Logger logger = LogManager.getLogger(CustomerService.class);

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	LoansRepository loansRepository;

	@Autowired
	Converter converter;
	@Autowired
	CustomerLoansRepository customerLoansRepository;

	public CustomerResponseDto saveCustomer(CustomerDto customerDto) {
		CustomerResponseDto customerResponseDto=new CustomerResponseDto();
		customerResponseDto.setStatusCode(HttpStatus.CREATED);
		if (!checkLoanEligibility(customerDto,customerResponseDto)) {
			 return customerResponseDto;
		}
		Customer customer=new Customer();
		Property property=new Property();
		logger.info("CustomerService<>customerDTO<>" + customerDto, customer);
		converter.customerDtoToEntity(customerDto, customer);
		converter.propertyDtoToEntity(customerDto, property);
		logger.info("CustomerService<>property<>" + property);

		customer.setProperty(property);
		logger.info("CustomerService<>customer<>" + customer);
		customerRepository.save(customer);
				List<Loans> list = loansRepository.findAllByLoanAmountLessThanAndEmiLessThan(property.getValue() * 80 / 100,
				customer.getSalary());
				if(!list.isEmpty()) {
		customerResponseDto.setStatus("you are eligible for applying Loans");
		logger.info("CustomerService<>in service list <>" + list);
		List<LoansDto> loansDtoList = new ArrayList<>();
		LoansDto loansDto;
		for (Loans loan : list) {

			loansDto = converter.loanEntityToDto(loan);
			loansDtoList.add(loansDto);
		}
		customerResponseDto.setListLoansDto(loansDtoList);
				}
				else
					customerResponseDto.setStatus("No loans found in the system for your property value and salary");	
		return customerResponseDto;
	}

	private boolean checkLoanEligibility(CustomerDto customerDto,CustomerResponseDto customerResponseDto) {

		int age = getAge(customerDto.getDateOfBirth());
		logger.info("CustomerService<>Age<>" + age);

		if(age < 20 || age > 60 ) {
			customerResponseDto.setStatus("your age should be in between 20 and 60 to apply for loan");
			customerResponseDto.setStatusCode(HttpStatus.BAD_REQUEST);
			return false;
		}else if(customerDto.getSalary() < 10000){
			customerResponseDto.setStatus("your salary should be more than 10000 to apply for loan");
			customerResponseDto.setStatusCode(HttpStatus.BAD_REQUEST);
			return false;
			
		}
		return true;
		

	}

	private int getAge(LocalDate dob) {
		LocalDate curDate = LocalDate.now();
		return Period.between(dob, curDate).getYears();

	}

	public String submitLoan(CustomerLoansDto customerLoansDto) {
		CustomerLoans customerLoans=new CustomerLoans();
		logger.info("CustomerService<>submitLoan<>customerLoansDto<>" + customerLoansDto);
		BeanUtils.copyProperties(customerLoansDto, customerLoans);
		logger.info("CustomerService<>customerLoansDto<>" + customerLoans);
		customerLoansRepository.save(customerLoans);
		return "You have successfully selected your loan";
	}

	public List<LoansDto> getLoanDetails(long phone) {
		List<LoansDto> listDto = new ArrayList<>();
		List<Loans> loansList = loansRepository.findByPhone(phone);
		logger.info("CustomerService<>Loan details<>" + loansList);
		for (Loans loans : loansList) {
			LoansDto loanDto = new LoansDto();
			BeanUtils.copyProperties(loans, loanDto);
			listDto.add(loanDto);
		}
		return listDto;
	}

}
