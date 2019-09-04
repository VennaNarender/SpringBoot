package com.dbs.mortagageapplication.dto;

public class CustomerLoansDto {
	
	private int customerId;
	private int loanId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	@Override
	public String toString() {
		return "CustomerLoansDto [customerId=" + customerId + ", loanId=" + loanId + "]";
	}
	
}
