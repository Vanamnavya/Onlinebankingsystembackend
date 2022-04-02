package com.lti.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.CustServiceImpl;
import com.lti.beans.CustomerAccount;



@CrossOrigin(origins = "http://localhost:8282") // any url, any, port no, any server
@RestController
@RequestMapping("/cust")
public class CustomerAccountcontroller {
	@Autowired
	private CustServiceImpl custService;

	
	 //http://localhost:8282/cust/customers
	  
	  @GetMapping("/customers")
	  public List<CustomerAccount> getEmpList() {
	  System.out.println("inside controller");
	  
	  return custService.getCustList(); }
	  //http://localhost:8282/cust/customers/102
	  
	  @GetMapping("/customers/{id}") 
	  public CustomerAccount getCustDetails(@PathVariable(value = "id") int id) {
	  System.out.println("controller "+id);
	  System.out.println(custService.getCustById(id)); return
	  custService.getCustById(id); }
	  
//	  //http://localhost:8282/cust/updateCust
//	  
//	  @PutMapping("/updateCust") public String updateProduct(@RequestBody Customer
//	  cust) { String msg=custService.updateCustomer(cust); return msg; }
//	 

	// http://localhost:8282/cust/addCustomer

	@PostMapping(path = "/addCustomer", consumes = "application/json")
	public int addCustomer(@RequestBody CustomerAccount c) {
		return custService.addCustomer(c);
	}

}


