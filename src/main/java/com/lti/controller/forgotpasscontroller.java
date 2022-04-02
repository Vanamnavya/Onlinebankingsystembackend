package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.forgotpassImplService;
import com.lti.beans.forgotpass;



@CrossOrigin(origins = "http://localhost:8282") // any url, any, port no, any server
@RestController
@RequestMapping("/forgotpass")
public class forgotpasscontroller {
	@Autowired
	private forgotpassImplService forgotpassService;
	@PostMapping(path = "/addforgotpass", consumes = "application/json")
	public String addforgotpass(@RequestBody forgotpass f) {
		return forgotpassService.addforgotpass(f);
	}
}


