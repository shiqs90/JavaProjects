package com.poc.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.poc.springmvc.helloWordBean;
import com.poc.springmvc.user.DemoDao;



@RestController
public class WSController {
	@Autowired
	private DemoDao demodao;
	
	@RequestMapping(value="/getNames",method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
	@RequestMapping(value="/appComponents",method=RequestMethod.GET)
	public String testAppComponents() {
		return demodao.funct();
	}
	@RequestMapping(value="/getBean",method=RequestMethod.GET)
	public helloWordBean helloWorldBean() {
		return new helloWordBean("Hello there");
	}
	@RequestMapping(value="/getBeanPath/{name}",method=RequestMethod.GET)
	public helloWordBean helloWorldPath(@PathVariable String name) {
		return new helloWordBean(String.format("Hello there %s",name));
	}
	
}
