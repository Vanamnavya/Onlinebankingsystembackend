package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.forgotiddao;
import com.lti.beans.forgotid;


@Service("forgotidservice")
public class forgotidImplService implements forgotidService{
	@Autowired
	forgotiddao dao;
	
	public forgotiddao getdao() {
		return dao;
	}

	public void setDao(forgotiddao dao) {
		this.dao = dao;
	}

	
	public long addforgotid(forgotid f) {
		
		System.out.println("Inside Service layer : Add forgot id called");
		return dao.addforgotid(f);
		
		
	}

	



}


