package com.lti.Dao;

import javax.persistence.EntityManager;


import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Register;

@Repository("registerDao")
public class RegisterDaoImpl  implements RegisterDao  {
	@PersistenceContext
	private EntityManager em;

	
	@Transactional
	public int addRegister(Register R) {
		System.out.println("Inside dao layer");
		
		em.persist(R);
		
		return R.getAccno();
		
	}


}
