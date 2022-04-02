package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.forgotpassdao;
import com.lti.beans.forgotpass;




@Service("forgotpassservice")
public class forgotpassImplService implements forgotpassService {
	@Autowired
	forgotpassdao dao;
	
	public forgotpassdao getdao() {
		return dao;
	}

	public void setDao(forgotpassdao dao) {
		this.dao = dao;
	}

	
	public String addforgotpass(forgotpass f) {
		
		System.out.println("Inside Service layer : Add Employee Method called");
		return dao.addforgotpass(f);
		
		
	}


}


