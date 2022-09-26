package com.chagwey.springbootinventorymanagement.DTO;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendorOrderDTO {
	
	private Integer id;
	
	private String code;
	
	private Instant orderDate;
	
	VendorDTO vendor;
	

	List<VendorOrderItemDTO> vendorOrderItems;

}
