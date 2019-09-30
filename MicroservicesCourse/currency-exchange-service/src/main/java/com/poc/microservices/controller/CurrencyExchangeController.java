package com.poc.microservices.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.microservices.service.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		return new ExchangeValue(BigDecimal.valueOf(0),from,to,Integer.parseInt(environment.getProperty("local.server.port")));
		//BigDecimal.valueOf(0) is used to pass BigDecimal value
		//int numericVar=Integer.parseInt(String) is used to convert String to int
		
	}

}
