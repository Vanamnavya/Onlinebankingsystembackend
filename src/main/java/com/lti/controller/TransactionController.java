package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.TransactionServiceImpl;
import com.lti.beans.Transaction;




@CrossOrigin("*")
@RestController
@RequestMapping("/Transaction")
public class TransactionController {
	
	@Autowired
	TransactionServiceImpl transService;

	@PostMapping("/addtrans")
	public void addTransaction(@RequestBody Transaction trans) {
		System.out.println("add Method is called");
		transService.addTransaction(trans);
		 
	}
}


