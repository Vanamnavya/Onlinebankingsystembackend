package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="forgot_pass")
public class forgotpass {
	@Id
	@Column(name="User_ID")
	private String uid;
	@Column(name="OTP")
	private int otp;
	public String getUID() {
		return uid;
	}
	public void setUID(String uID) {
		uid = uID;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public forgotpass(String uID, int otp) {
		super();
		uid = uID;
		this.otp = otp;
	}
	public forgotpass() {
		super();
	}
	@Override
	public String toString() {
		return "\n forgotpass [UID=" + uid + ", otp=" + otp + "]";
	}
	
	
	

}


