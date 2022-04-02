package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.AccountServiceImpl;
import com.lti.beans.Account;



@CrossOrigin("*")
@RestController
@RequestMapping("/Account")
public class AccountController {

	
	@Autowired
	AccountServiceImpl accSer;
	
	@PostMapping(value="/addacc",consumes="application/json")
	public void addAccount(@RequestBody Account acc) {
		
		accSer.addacc(acc);
	}
	
	
}


