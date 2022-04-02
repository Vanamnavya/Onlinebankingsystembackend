package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="forgot_id")
public class forgotid {
	@Id
	@Column(name="Account_Number")
	//@GeneratedValue(strategy= GenerationType.SEQUENCE,generator="id")


	private long accountNumber;
	@Column(name="OTP")
	private int otp;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getOTP() {
		return otp;
	}
	public void setOTP(int oTP) {
		otp = oTP;
	}
	public forgotid() {
		super();
	}
	public forgotid(long accountNumber, int oTP) {
		super();
		this.accountNumber = accountNumber;
		otp = oTP;
	}

	@Override
	public String toString() {
		return "\n forgotid [AccountNumber=" + accountNumber + ", OTP=" + otp + "]";
	}
	
}


