package com.lti.beans;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

	@Entity
	@Table(name = "CUSTOMERS")
	public class CustomerAccount {

		@Id
		@Column(name = "CUST_NO")
			@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
			@SequenceGenerator(name = "CUST_SEQ", sequenceName = "cust_seq", allocationSize = 1)
		private int customerid;
		@Column(name = "CUST_FNAME")
		private String firstname;
//			@Column(name = "CUST_MNAME")
//			private String middle_name;
		@Column(name = "CUST_LNAME")
		private String lastname;
//			@Column(name = "CUST_FFNAME")
//			private String father_name;
		@Column(name = "CUST_MOB")
		private long mobileno;
		@Column(name = "CUST_EMAIL")
		private String emailid;
		@Column(name = "CUST_AADHAR")
		private long aadharno;
		@JsonFormat(pattern = "dd-MM-yyyy", shape = Shape.STRING)
		@Column(name = "Date_of_birth")
		private String dob;
		@Column(name = "CUST_ADDRESS")
		private String address;
		@Column(name = "CUST_LMARK")
		private String landmark;
		@Column(name = "CUST_STATE")
		private String state;
		@Column(name = "CUST_CITY")
		private String city;
		@Column(name = "CUST_PINCODE")
		private long pincode;

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public long getMobileno() {
			return mobileno;
		}

		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public long getAadharno() {
			return aadharno;
		}

		public void setAadharno(long aadharno) {
			this.aadharno = aadharno;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getLandmark() {
			return landmark;
		}

		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public long getPincode() {
			return pincode;
		}

		public void setPincode(long pincode) {
			this.pincode = pincode;
		}

		public CustomerAccount(int customerid, String firstname, String lastname, long mobileno, String emailid, long aadharno,
				String dob, String address, String landmark, String state, String city, long pincode) {
			super();
			this.customerid = customerid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.mobileno = mobileno;
			this.emailid = emailid;
			this.aadharno = aadharno;
			this.dob = dob;
			this.address = address;
			this.landmark = landmark;
			this.state = state;
			this.city = city;
			this.pincode = pincode;
		}

		public CustomerAccount() {
			super();
		}

		@Override
		public String toString() {
			return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", mobileno=" + mobileno + ", emailid=" + emailid + ", aadharno=" + aadharno + ", dob=" + dob
					+ ", address=" + address + ", landmark=" + landmark + ", state=" + state + ", city=" + city
					+ ", pincode=" + pincode + "]";
		}

	}

