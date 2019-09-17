package com.poc.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.microservices.limitsservice.bean.LimitsService;

@RestController
public class LimitsController {
	
	@Autowired 
	private LimitsService limitsService;
	
	@GetMapping("/retrieveLimits")
	public LimitsService retrieveLimit() {
		return new LimitsService(limitsService.getMaximum(),limitsService.getMinimum());
	}
	

}
