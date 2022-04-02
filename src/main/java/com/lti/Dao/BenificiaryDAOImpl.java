package com.lti.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Benificiary;




@Repository
public class BenificiaryDAOImpl implements BenificiaryDAO{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addBen(Benificiary ben) {
		em.persist(ben);
		return ben.getBenId();
	}

	@Override
	public Benificiary searchBenbyId(int id) {
		
		Benificiary b=em.find(Benificiary.class, id);
		
		return b;
	}

	@Override
	public List<Benificiary> EmpList() {
		Query qry=em.createQuery("select b from Benificiary b");
		List<Benificiary> l=qry.getResultList();
		
		return l;
	}
	

}


