package com.lti.Dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Transaction;



@Repository
public class TransactionDAOImpl implements TransactionDAO{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public long addTransaction(Transaction trans) {
		
		em.persist(trans);
		
		return trans.getAccNo();
		
		
		
	}

	
}


