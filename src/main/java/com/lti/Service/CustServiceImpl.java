package com.lti.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.CustDao;
import com.lti.beans.CustomerAccount;

@Service("custService")  
public class CustServiceImpl implements CustService {
	
	@Autowired  // By Type injection.
	private CustDao custDao;
	
	public CustDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustDao custDao) {
		this.custDao = custDao;
	}

	
//	  public Customer saveCustomer(CustomerAccount cust) { custDao.saveCustomer(cust);
//	  return cust; }
	 
	  public List<CustomerAccount> getCustList(){ 
		  return custDao.getCustList(); }
	  
	  public CustomerAccount getCustById(int custno) {
	  
	  return custDao.getCustById(custno); }
	  
//	  @Override public String updateCustomer(CustomerAccount cust) {  
//	  String msg=custDao.updateCustomer(cust); return msg; }
	 
	@Override
	public int addCustomer(CustomerAccount c) {
		System.out.println("service method called");
		int custid = custDao.addCustomer(c);
		return custid;
	}


	
}


