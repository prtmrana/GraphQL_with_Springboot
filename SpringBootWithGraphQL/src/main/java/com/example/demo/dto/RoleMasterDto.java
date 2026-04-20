package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleMasterDto {

	   private String roleId;
	    private String roleName;
	    private String moduleCode;
	    private String roleDept;
	    private String rolePosition;
	    private String roleStatus;
	    private String productName;

}
