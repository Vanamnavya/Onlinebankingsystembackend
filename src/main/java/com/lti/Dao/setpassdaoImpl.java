package com.lti.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.setpass;



@Repository("setpassdao")
public class setpassdaoImpl implements setpassdao {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public String addsetpass(setpass s) {
		System.out.println("Inside dao layer");
		
		em.persist(s);
		
	   return s.getLoginpass();
	}

}


