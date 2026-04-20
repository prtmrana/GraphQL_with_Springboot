package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RoleMasterDto;
import com.example.demo.dto.UserMasterDto;
import com.example.demo.entity.UserMasterEntity;
import com.example.demo.service.UserService;

@RestController
public class UserGraphQLController {

	@Autowired
	private UserService service;

	@QueryMapping
	public List<UserMasterDto> getAllUsers() {
		return service.getAllUsers();
	}

	@QueryMapping
	public UserMasterDto getUserById(@Argument String userId) {
		return service.getUserById(userId);
	}
	
	@QueryMapping
	public RoleMasterDto getRoleByRoleName(@Argument String roleName) {
		return service.getRoleByRoleName(roleName);
	}
}
