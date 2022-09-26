package com.chagwey.springbootinventorymanagement.DTO;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendorDTO {
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;

	private AddressDTO address;
	
	private String image;
	
	private String email;
	
	private String phoneNumber;
	
	List<VendorOrderDTO> vendorOrders; 

}
