package com.lti.Dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Account;
import com.lti.beans.Customer;


@Repository
public class AccountDAOImpl implements AccountDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public long addacc(Account acc) {
	  
	   int id=4;
	   
	   Customer cus=em.find(Customer.class, id);
		
	   if(cus!=null) {
		   Account cls = new Account();
		   cls.setCustomerId(id);
		   cls.setAccType(acc.getAccType());
		   cls.setAmount(acc.getAmount());
		   em.persist(cls);
	   }
	   else {
		   System.out.println("Account not found");
	   }
		
		return acc.getAccNo();
	}

}


