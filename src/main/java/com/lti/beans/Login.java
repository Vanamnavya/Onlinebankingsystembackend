package com.lti.beans;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOGIN")
public class Login {
	@Id
	@Column(name="user_id")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_SEQ")
	private String userid;
	
	@Column(name="password")
	private String password;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Login(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	

	public Login() {
		super();
	}

	@Override
	public String toString() {
		return "Login [userid=" + userid + ", password=" + password + "]";
	}
	
	
}



