package com.lti.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.forgotpass;


@Repository("forgotpassdao")
public class forgotpassdaoImpl implements forgotpassdao{
	@PersistenceContext
	EntityManager em;
    
	@Override
	@Transactional
	public String addforgotpass(forgotpass f) {
		System.out.println("Inside dao layer");
		
		em.persist(f);
		
		return f.getUID();

}
}


