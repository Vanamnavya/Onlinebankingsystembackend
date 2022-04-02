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

import com.lti.Service.BenificiaryServiceImpl;
import com.lti.beans.Benificiary;



@CrossOrigin("*")
@RestController
@RequestMapping("/Benificiary")
public class BenificairyController {

	@Autowired
	BenificiaryServiceImpl benService;
	
	@PostMapping("/addben")
	public void addBenificiary(@RequestBody Benificiary ben) {
		System.out.println("add Method is called");
		benService.addBen(ben);
		 
	}
	@GetMapping("/{benId}")
	public Benificiary getBenById(@PathVariable(value = "benId") int benId) {
		return benService.searchBenbyId(benId);
	}
	
	@GetMapping("/allcus")
	public List<Benificiary> searchAll() {

		return benService.EmpList();
	}
	
}


