package com.lti.Service;

import java.util.List;

import com.lti.beans.CustomerAccount;

public interface CustService {
	public List<CustomerAccount> getCustList() ;
	public int addCustomer(CustomerAccount c);
	public CustomerAccount getCustById(int custno) ;
//	public Customer saveCustomer(CustomerAccount cust) ;
//	public String updateCustomer(CustomerAccount cust);
	
}


