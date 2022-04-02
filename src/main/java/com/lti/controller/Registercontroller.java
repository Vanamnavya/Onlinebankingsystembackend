package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.RegisterServiceImpl;
import com.lti.beans.Register;

@CrossOrigin(origins = "http://localhost:8282")
@RestController
@RequestMapping("/Register")
public class Registercontroller {
	
		@Autowired
		 RegisterServiceImpl registerService;
		
//http://localhost:8282/Register/addRegister
		

@PostMapping(path = "/addRegister", consumes = "application/json")
public int addRegister(@RequestBody Register R) {
return registerService.addRegister(R);
}


}



