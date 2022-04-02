package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lti.Dao.setpassdao;
import com.lti.beans.setpass;


	@Service("setpassservice")
	public class setpassImplService implements setpassService {
		@Autowired
		setpassdao dao;
		
		public setpassdao getdao() {
			return dao;
		}

		public void setDao(setpassdao dao) {
			this.dao = dao;
		}

		
		public String addsetpass(setpass s) {
			
			System.out.println("Inside Service layer : Add Employee Method called");
			return dao.addsetpass(s);
			
			
		}


	}
