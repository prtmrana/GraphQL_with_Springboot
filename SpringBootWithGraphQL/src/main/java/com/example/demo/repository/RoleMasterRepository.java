package com.example.demo.repository;

import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.RoleMasterEntity;
import com.example.demo.entity.UserMasterEntity;

public interface RoleMasterRepository extends CrudRepository<RoleMasterEntity, String>{

	Optional<RoleMasterEntity> getRoleByRoleName(String roleName);

}
