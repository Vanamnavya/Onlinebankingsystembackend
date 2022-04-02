package com.lti.Service;

import java.util.List;

import com.lti.beans.Benificiary;

public interface BenificiaryService {
	public int addBen(Benificiary ben);
	public Benificiary searchBenbyId(int id);
	public List<Benificiary> EmpList() ;
}
