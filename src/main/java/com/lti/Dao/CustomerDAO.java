package com.lti.Dao;

import com.lti.beans.Customer;

public interface CustomerDAO {
	public long addCustomer(Customer cus);
	public Customer searchById(int id);
}
