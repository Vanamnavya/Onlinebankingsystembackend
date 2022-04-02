package com.lti.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
    @Id
	@Column(name="Customer_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(name = "CUST_SEQ", sequenceName = "cust_seq", allocationSize = 1)
    private int customerId;

	@Column(name="First_Name")
	private String firstName;
	
	public Customer(String firstName, String lastName, long mobileNumber, String emailId, long aadharNo, String address,
			String date) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.aadharNo = aadharNo;
		this.address = address;
		this.date = date;
	}

	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Mobile_Number")
	private long mobileNumber;
	
	@Column(name="Email_Id")
	private String emailId;
	
	@Column(name="Aadhar_No")
	private long aadharNo;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Cus_date")
	private String date;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", aadharNo=" + aadharNo + ", address="
				+ address + ", date=" + date + "]";
	}
	
}


