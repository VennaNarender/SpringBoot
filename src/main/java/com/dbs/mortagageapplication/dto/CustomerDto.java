package com.dbs.mortagageapplication.dto;

import java.time.LocalDate;
public class CustomerDto {

		
		private String firstName;
		private String lastName;
		private LocalDate dateOfBirth;
		private String gender;
		private double salary;
		private String pan;
		private long phone;
		private String emailId;
		private String propertyType;
		private String propertyAddress;
		private double value;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getPan() {
			return pan;
		}
		public void setPan(String pan) {
			this.pan = pan;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
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
		@Override
		public String toString() {
			return "CustomerDto [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
					+ ", gender=" + gender + ", salary=" + salary + ", pan=" + pan + ", phone=" + phone + ", emailId="
					+ emailId + ", propertyType=" + propertyType + ", propertyAddress=" + propertyAddress + ", value="
					+ value + "]";
		}
		
		
		

	}


