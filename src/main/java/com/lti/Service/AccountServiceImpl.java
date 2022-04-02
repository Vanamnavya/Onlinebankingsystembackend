package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.AccountDAO;
import com.lti.beans.Account;



@Service("accSer")
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDAO dao;
	
	public AccountDAO getDao() {
		return dao;
	}

	public void setDao(AccountDAO dao) {
		this.dao = dao;
	}

	@Override
	public long addacc(Account acc) {
		
		return dao.addacc(acc);
	}

}

