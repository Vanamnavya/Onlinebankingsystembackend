package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.TransactionDAO;
import com.lti.beans.Transaction;



@Service("transService")
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionDAO dao;
	
	@Override
	public long addTransaction(Transaction trans) {
		return dao.addTransaction(trans);

	}

}


