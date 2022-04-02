package com.lti.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Customer;



@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public long addCustomer(Customer cus) {
		
         em.persist(cus);
		
		return cus.getCustomerId();
	}

	@Override
	public Customer searchById(int id) {
	   
		Customer c=em.find(Customer.class,id);
		 
		return c;
	}

}


