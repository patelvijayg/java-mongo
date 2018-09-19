package com.example.mongosample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongosample.model.User;
import com.example.mongosample.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	
	public List<User> getAllUser()
	{
		return repository.findAll();
	}


	public User addUser(User user) {
		return repository.save(user);
	}
	
	
	public User getSpecificUser(String id)
	{
		Optional<User> result = repository.findById(id);
		return result.orElse(new User());
	}
}
