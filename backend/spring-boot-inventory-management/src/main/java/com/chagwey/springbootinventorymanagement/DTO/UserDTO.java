package com.chagwey.springbootinventorymanagement.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
	
	private Integer id;

	private String firstName;
	
	private String lastName;
	
	private String birthday;
	
	private String email;
	
	private String password;
	
	private AddressDTO address;
	
	private String image;
	
	CompanyDTO company;
	
//	@OneToMany(mappedBy="user")
//	List<RoleDTO> roles;
}
