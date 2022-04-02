package com.lti.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.BenificiaryDAO;
import com.lti.beans.Benificiary;



@Service("benService")
public class BenificiaryServiceImpl implements BenificiaryService{

	@Autowired
	private BenificiaryDAO dao;
	
	public BenificiaryDAO getDao() {
		return dao;
	}

	public void setDao(BenificiaryDAO dao) {
		this.dao = dao;
	}

	@Override
	public int addBen(Benificiary ben) {
		
		return dao.addBen(ben);
	}

	@Override
	public Benificiary searchBenbyId(int id) {
	
		return dao.searchBenbyId(id);
	}

	@Override
	public List<Benificiary> EmpList() {
		
		return dao.EmpList();
	}

	
	
}

