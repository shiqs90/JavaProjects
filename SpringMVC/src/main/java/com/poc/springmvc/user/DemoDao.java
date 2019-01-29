package com.poc.springmvc.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DemoDao {
	public String funct() {
		return "Yippie! Done Autowirings :)";
	}

}
