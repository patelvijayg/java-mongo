package com.example.mongosample.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.mongosample.model.User;

public interface UserCrudRepository extends CrudRepository<User, String> {

}
