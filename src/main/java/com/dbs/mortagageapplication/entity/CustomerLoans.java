package com.dbs.mortagageapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name="Customer_Loans")
public class CustomerLoans {
	@Id
	@Column(name="transaction_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transacionId;
	@Column(name="customer_id")
	private int customerId;
	@Column(name="loan_id")
	private int loanId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	
	public Integer getTransacionId() {
		return transacionId;
	}
	public void setTransacionId(Integer transacionId) {
		this.transacionId = transacionId;
	}
	@Override
	public String toString() {
		return "CustomerLoans [customerId=" + customerId + ", loanId=" + loanId + "]";
	}

}
