package com.lti.Dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Login;

@Repository("loginDao")
public class LoginDaoImpl implements LoginDao{
		@PersistenceContext
		private EntityManager em;
       
		@Override
		@Transactional
		public String addLogin(Login L) {
			
			em.persist(L);
			return L.getUserid();
		}

		

}
