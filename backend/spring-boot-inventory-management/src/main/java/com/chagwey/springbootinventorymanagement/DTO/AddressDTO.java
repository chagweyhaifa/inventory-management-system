package com.chagwey.springbootinventorymanagement.DTO;

import com.chagwey.springbootinventorymanagement.model.Address;
import com.chagwey.springbootinventorymanagement.model.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDTO {

	
	private String address1;
	

	private String address2;
	

	private String city;
	

	private String zipCode;
	

	private String country;
	
	public static AddressDTO fromEntity(Address address) {
		
		if(address == null) {
			return null;
//			TODO throw an exception
		}
		
		return AddressDTO.builder()
				.address1(address.getAddress1())
				.address2(address.getAddress2())
				.city(address.getCity())
				.zipCode(address.getZipCode())
				.country(address.getCountry())
				.build();
		
	}
	
	public static Address toEntity(AddressDTO addressDTO) {
		
		if(addressDTO == null) {
			return null;
//			TODO throw an exception
		}
		
		Address address = new Address();
		
		address.setAddress1(addressDTO.getAddress1());
		address.setAddress2(addressDTO.getAddress2());
		address.setZipCode(addressDTO.getZipCode());
		address.setCity(addressDTO.getCity());
		address.setCountry(addressDTO.getCountry());
		
		return address;
		
	}

}
