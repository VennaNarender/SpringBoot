package com.dbs.mortagageapplication.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="property_id",updatable = false)
	private Integer propertyId;
	@Column(name="property_type")
	private String propertyType;
	@Column(name="property_address")
	private String propertyAddress;
	private double value;
	@OneToOne(mappedBy = "property")
	private Customer customer;
	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", propertyType=" + propertyType + ", propertyAddress="
				+ propertyAddress + ", value=" + value + ", customer=" + customer + "]";
	}
	
	


}
