package com.lti.Service;

import com.lti.beans.Customer;

public interface CustomerService {
	public long addCustomer(Customer cus);
	public Customer searchById(int id);
}
