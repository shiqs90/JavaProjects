package com.poc.microservices.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.poc.microservices.service.ConversionValue;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/of/{quantity}/from/{from}/to/{to}")
	public ConversionValue retrieveConversion(@PathVariable BigDecimal quantity,@PathVariable String from,@PathVariable String to) {
		return new ConversionValue(quantity,from,to,null,null);
	}

}
