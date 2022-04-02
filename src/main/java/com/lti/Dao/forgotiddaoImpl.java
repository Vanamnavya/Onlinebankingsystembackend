package com.lti.Dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.forgotid;



@Repository("forgotiddao")
public class forgotiddaoImpl implements forgotiddao {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public long addforgotid(forgotid f) {
		System.out.println("Inside dao layer");
		
		em.persist(f);
		
		return f.getAccountNumber();		
	}

}


