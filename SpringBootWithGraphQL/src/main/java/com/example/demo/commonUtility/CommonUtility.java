package com.example.demo.commonUtility;

import org.springframework.stereotype.Component;

import com.example.demo.dto.RoleMasterDto;
import com.example.demo.dto.UserMasterDto;
import com.example.demo.entity.RoleMasterEntity;
import com.example.demo.entity.UserMasterEntity;

@Component
public class CommonUtility {

	
	 public  UserMasterDto convertToDto(UserMasterEntity entity) {
	        return UserMasterDto.builder()
	                .userId(entity.getUserId())
	                .userName(entity.getUserName())
	                .userEmail(entity.getUserEmail())
	                .userMobile(entity.getUserMobile())
	                .userRole(entity.getUserRole())
	                .userActive(entity.getUserActive())
	                .build();
	    }
	 
	 public  RoleMasterDto convertToRoleDto(RoleMasterEntity entity) {
	        return RoleMasterDto.builder()
	                .roleId(entity.getRoleId())
	                .roleName(entity.getRoleName())
	                .moduleCode(entity.getModuleCode())
	                .roleDept(entity.getRoleDept())
	                .rolePosition(entity.getRolePosition())
	                .roleStatus(entity.getRoleStatus())
	                .build();
	    }

}
