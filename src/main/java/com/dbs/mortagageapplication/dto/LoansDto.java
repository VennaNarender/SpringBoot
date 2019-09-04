package com.dbs.mortagageapplication.dto;


public class LoansDto {
	private Integer loanId;
	private double loanAmount;
	private String tenure;
	private double emi;
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
		return "LoansDto [loanId=" + loanId + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", emi=" + emi
				+ ", rateOfInterest=" + rateOfInterest + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loanId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoansDto other = (LoansDto) obj;
		if (loanId != other.loanId)
			return false;
		return true;
	}
	
}
