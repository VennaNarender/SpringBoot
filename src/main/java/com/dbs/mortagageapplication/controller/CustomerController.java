package com.dbs.mortagageapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.mortagageapplication.dto.CustomerDto;
import com.dbs.mortagageapplication.dto.CustomerLoansDto;
import com.dbs.mortagageapplication.dto.CustomerResponseDto;
import com.dbs.mortagageapplication.dto.LoansDto;
import com.dbs.mortagageapplication.service.CustomerService;



@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("save")
	public CustomerResponseDto saveCustomer(@RequestBody CustomerDto customer){
				return customerService.saveCustomer(customer);
	}
	
	@PostMapping("selectLoan")
	public ResponseEntity<String> submitLoan(@RequestBody CustomerLoansDto customerLoansDto) {
		String response=customerService.submitLoan(customerLoansDto);
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	
	@GetMapping("loanDetails/{phone}")
	public List<LoansDto> getLoanDetails(@PathVariable("phone")long  phone) {
		return customerService.getLoanDetails(phone);
		
	}
	

}
