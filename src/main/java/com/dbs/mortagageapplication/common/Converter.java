package com.dbs.mortagageapplication.common;


import org.springframework.stereotype.Component;

import com.dbs.mortagageapplication.dto.CustomerDto;
import com.dbs.mortagageapplication.dto.LoansDto;
import com.dbs.mortagageapplication.entity.Customer;
import com.dbs.mortagageapplication.entity.Loans;
import com.dbs.mortagageapplication.entity.Property;

@Component
public class Converter {
	
	
	public Customer customerDtoToEntity(CustomerDto customerDto,Customer customer) {
		
		customer.setDateOfBirth(customerDto.getDateOfBirth());
		customer.setEmailId(customerDto.getEmailId());
		customer.setFirstName(customerDto.getFirstName());
		customer.setLastName(customerDto.getLastName());
		customer.setGender(customerDto.getGender());
		customer.setPan(customerDto.getPan());
		customer.setPhone(customerDto.getPhone());
		customer.setSalary(customerDto.getSalary());
				return customer;
	}
	
	public Property propertyDtoToEntity(CustomerDto customerDto,Property property) {
		property.setPropertyAddress(customerDto.getPropertyAddress());
		property.setPropertyType(customerDto.getPropertyType());
		property.setValue(customerDto.getValue());
		return property;
		
	}

	public LoansDto loanEntityToDto(Loans loan) {
		LoansDto loansDto=new LoansDto();
		loansDto.setLoanId(loan.getLoanId());
		loansDto.setEmi(loan.getEmi());
		loansDto.setLoanAmount(loan.getLoanAmount());
		loansDto.setRateOfInterest(loan.getRateOfInterest());
		loansDto.setTenure(loan.getTenure());
		return loansDto;
		
	}

}
