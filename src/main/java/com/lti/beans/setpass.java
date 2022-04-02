package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="password")
public class setpass {
	@Id
	@Column(name="login_pass")
	private String loginpass;
	@Column(name="confirm_pass")
	private String confirmpass;
	public String getLoginpass() {
		return loginpass;
	}
	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}
	public String getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}
	public setpass(String loginpass, String confirmpass) {
		super();
		this.loginpass = loginpass;
		this.confirmpass = confirmpass;
	}
	public setpass() {
		super();
	}
	@Override
	public String toString() {
		return "\n setpass [loginpass=" + loginpass + ", confirmpass=" + confirmpass + "]";
	}
	
    
}



