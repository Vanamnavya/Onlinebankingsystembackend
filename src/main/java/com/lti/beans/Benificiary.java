package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Benificiary")
public class Benificiary {

	@Id
	@Column(name="Ben_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(name = "CUST_SEQ", sequenceName = "cust_seq", allocationSize = 1)
	private int benId;
	
	@Column(name="Ben_Name")
	private String benName;

	@Column(name="Ben_Acc_No")
	private long benAccNo;
	
	@Column(name="Ben_Nick_Name")
	private String benNickName;

	
	public Benificiary(String benName, long benAccNo, String benNickName) {
		super();
		this.benName = benName;
		this.benAccNo = benAccNo;
		this.benNickName = benNickName;
	}
	
	public int getBenId() {
		return benId;
	}

	public void setBenId(int benId) {
		this.benId = benId;
	}

	public String getBenName() {
		return benName;
	}

	public void setBenName(String benName) {
		this.benName = benName;
	}

	public long getBenAccNo() {
		return benAccNo;
	}

	public void setBenAccNo(long benAccNo) {
		this.benAccNo = benAccNo;
	}

	public String getBenNickName() {
		return benNickName;
	}

	public void setBenNickName(String benNickName) {
		this.benNickName = benNickName;
	}

	public Benificiary(int benId, String benName, long benAccNo, String benNickName) {
		super();
		this.benId = benId;
		this.benName = benName;
		this.benAccNo = benAccNo;
		this.benNickName = benNickName;
	}

	public Benificiary() {
		super();
	}

	@Override
	public String toString() {
		return "Benificiary [benId=" + benId + ", benName=" + benName + ", benAccNo=" + benAccNo + ", benNickName="
				+ benNickName + "]";
	}
	
	

}


