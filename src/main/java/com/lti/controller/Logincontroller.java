package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.LoginServiceImpl;
import com.lti.beans.Login;

@CrossOrigin(origins = "http://localhost:8282")
@RestController
@RequestMapping("/Login")
public class Logincontroller {
	
		@Autowired
		private LoginServiceImpl loginService;
		
//http://localhost:8282/Login/addLogin
	
@PostMapping(path = "/addLogin", consumes = "application/json")
public String addLogin(@RequestBody Login L) {
	return loginService.addLogin(L);
}

}


