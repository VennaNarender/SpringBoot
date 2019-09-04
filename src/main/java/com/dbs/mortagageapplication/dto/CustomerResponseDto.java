package com.dbs.mortagageapplication.dto;

import java.util.List;

import org.springframework.http.HttpStatus;
public class CustomerResponseDto {
	private HttpStatus statusCode;
	private String status;
	private List<LoansDto> listLoansDto;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<LoansDto> getListLoansDto() {
		return listLoansDto;
	}
	public void setListLoansDto(List<LoansDto> listLoansDto) {
		this.listLoansDto = listLoansDto;
	}
	
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}
	@Override
	public String toString() {
		return "CustomerResponseDto [statusCode=" + statusCode + ", status=" + status + ", listLoansDto=" + listLoansDto
				+ "]";
	}
	
	

}
