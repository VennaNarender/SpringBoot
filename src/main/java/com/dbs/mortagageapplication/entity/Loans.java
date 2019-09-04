package com.dbs.mortagageapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Loans {
	@Id
	@Column(name="loan_id")
	private Integer loanId;
	@Column(name="laon_amount")
	private double loanAmount;
	private String tenure;
	private double emi;
	@Column(name="rate_of_interest")
	private String rateOfInterest;
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	public String toString() {
		return "Loans [loanId=" + loanId + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", emi=" + emi
				+ ", rateOfInterest=" + rateOfInterest + "]";
	}
	
	}
