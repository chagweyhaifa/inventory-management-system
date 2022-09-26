package com.chagwey.springbootinventorymanagement.DTO;

import java.time.Instant;
import java.util.List;


import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class SaleDTO {
	
	private Integer id;
	
	private String code;
	
	private Instant saleDate;
	
	private String comment;
	
	List<SaleItemDTO> saleItems;

}
