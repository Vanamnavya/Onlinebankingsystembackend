package com.lti.beans;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTER")
public class Register {
	@Id
	@Column(name="acc_no")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REG_SEQ")
	private int accno;
	
	
	@Column(name="login_psw")
	private String loginpsw;
	
	@Column(name=" confirmlogin_psw")
	private String confirmloginpsw;
	
	@Column(name="trans_psw")
	private String transpsw;
	
	@Column(name="confirmtrans_psw")
	private String confirmtranspsw;
	
	@Column(name="otp")
	private int otp;

	
	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getLoginpsw() {
		return loginpsw;
	}

	public void setLoginpsw(String loginpsw) {
		this.loginpsw = loginpsw;
	}

	public String getConfirmloginpsw() {
		return confirmloginpsw;
	}

	public void setConfirmloginpsw(String confirmloginpsw) {
		this.confirmloginpsw = confirmloginpsw;
	}

	public String getTranspsw() {
		return transpsw;
	}

	public void setTranspsw(String transpsw) {
		this.transpsw = transpsw;
	}

	public String getConfirmtranspsw() {
		return confirmtranspsw;
	}

	public void setConfirmtranspsw(String confirmtranspsw) {
		this.confirmtranspsw = confirmtranspsw;
	}

	
	public Register(int accno, String loginpsw, String confirmloginpsw, String transpsw, String confirmtranspsw,
			int otp) {
		super();
		this.accno = accno;
		this.loginpsw = loginpsw;
		this.confirmloginpsw = confirmloginpsw;
		this.transpsw = transpsw;
		this.confirmtranspsw = confirmtranspsw;
		this.otp = otp;
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Register [accno=" + accno + ", loginpsw=" + loginpsw + ", confirmloginpsw=" + confirmloginpsw
				+ ", transpsw=" + transpsw + ", confirmtranspsw=" + confirmtranspsw + ", otp=" + otp + "]";
	}

}



