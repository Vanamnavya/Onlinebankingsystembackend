package com.lti.Dao;

import java.util.List;

import com.lti.beans.Benificiary;

public interface BenificiaryDAO {
	public int addBen(Benificiary ben);

	public Benificiary searchBenbyId(int id);
	
	public List<Benificiary> EmpList() ;
	
}
