package com.example.mongosample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongosample.model.User;
import com.example.mongosample.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	UserService userService;
	
	@GetMapping(value="/users")
	public List<User> getAllUser()
	{
		System.out.println("Request called.");
		return userService.getAllUser();
	}

	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User getSpecificUser(@PathVariable String id)
	{
		System.out.println("Request called.");
		return userService.getSpecificUser(id);
	}	
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public User addUser(@RequestBody User user)
	{
		System.out.println("Request called."+user);
		return userService.addUser(user);
	}
}
