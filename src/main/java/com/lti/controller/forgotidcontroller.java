package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.forgotidImplService;
import com.lti.beans.forgotid;


@CrossOrigin(origins = "http://localhost:8282") // any url, any, port no, any server
@RestController
@RequestMapping("/forgotid")
public class forgotidcontroller {
	@Autowired
	private forgotidImplService forgotidService;
	//http://localhost:8282/forgotid/addforgotid
	@PostMapping(path = "/addforgotid", consumes = "application/json")
	public long addsetpass(@RequestBody forgotid f) {
		return forgotidService.addforgotid(f);
	}
}