package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.commonUtility.CommonUtility;
import com.example.demo.dto.RoleMasterDto;
import com.example.demo.dto.UserMasterDto;
import com.example.demo.entity.UserMasterEntity;
import com.example.demo.repository.RoleMasterRepository;
import com.example.demo.repository.UserMasterRepository;

@Service
public class UserService {

    @Autowired
    private UserMasterRepository repository;
    
    @Autowired
    private RoleMasterRepository roleRepository;
    
    @Autowired
    private CommonUtility commonUtility;

    public List<UserMasterDto> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(commonUtility::convertToDto)
                .collect(Collectors.toList());
    }

    public UserMasterDto getUserById(String userId) {
        return repository.findById(userId)
                .map(commonUtility::convertToDto)
                .orElse(null);
    }

   
	public RoleMasterDto getRoleByRoleName(String roleName) {
		 return roleRepository.getRoleByRoleName(roleName)
	                .map(commonUtility::convertToRoleDto)
	                .orElse(null);
	}
}