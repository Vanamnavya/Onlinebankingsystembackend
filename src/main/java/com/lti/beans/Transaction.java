package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction {

	@Id
	@Column(name="Trans_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(name = "CUST_SEQ", sequenceName = "cust_seq", allocationSize = 1)
	private int TransId;
	
	@Column(name="Account_No")
	private long accNo;
	
	@Column(name="Benificiary_Id")
	private int benId;
	
	@Column(name="Amount")
	private double balanceamount;
	
	@Column(name="Trans_type")
	private String transType;

	public int getTransId() {
		return TransId;
	}

	public long getAccNo() {
		return accNo;
	}

	public int getBenId() {
		return benId;
	}

	
	public String getTransType() {
		return transType;
	}

	public void setTransId(int transId) {
		TransId = transId;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public void setBenId(int benId) {
		this.benId = benId;
	}


	public void setTransType(String transType) {
		this.transType = transType;
	}

	

	public Transaction() {
		super();
	}

	public double getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(double balanceamount) {
		this.balanceamount = balanceamount;
	}

	public Transaction(double balanceamount) {
		super();
		this.balanceamount = balanceamount;
	}

	@Override
	public String toString() {
		return "Transaction [ accNo=" + accNo + ", benId=" + benId + ", balanceamount="
				+ balanceamount + ", transType=" + transType + "]";
	}

	
	
	
	

}


