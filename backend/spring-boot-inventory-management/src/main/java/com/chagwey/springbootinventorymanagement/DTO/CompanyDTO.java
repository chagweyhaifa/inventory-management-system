package com.chagwey.springbootinventorymanagement.DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDTO {
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private AddressDTO address;
	
	private String taxCode;
	
	private String image;
	
	private String email;
	
	private String phoneNumber;
	
	private String website;
	
	List<UserDTO> users;

}
