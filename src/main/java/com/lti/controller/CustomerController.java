package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.CustomerServiceImpl;
import com.lti.beans.Customer;



@CrossOrigin("*")
@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	CustomerServiceImpl cusService;
	
	@PostMapping("/addcus")
	public void addCustomer(@RequestBody Customer cus) {
		 cusService.addCustomer(cus);
	}
	@GetMapping("/{cusId}")
	public Customer getCustomerById(@PathVariable(value = "cusId") int cusId) {
		return cusService.searchById(cusId);
	}
}


