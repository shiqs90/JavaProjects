package com.poc.springmvc.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
	private static List<User> users=new ArrayList<User>();
	
	static {
		users.add(new User(1, "Shikha", new Date()));
		users.add(new User(2, "Singh", new Date()));
		}
}
