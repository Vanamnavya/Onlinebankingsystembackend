package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Service.setpassImplService;
import com.lti.beans.setpass;




@CrossOrigin(origins = "http://localhost:8282") // any url, any, port no, any server
@RestController
@RequestMapping("/setpass")
public class setpasscontroller {
	@Autowired
	private setpassImplService setpassService;
	@PostMapping(path = "/addsetpass", consumes = "application/json")
	public String addsetpass(@RequestBody setpass s) {
		return setpassService.addsetpass(s);
	}
}


