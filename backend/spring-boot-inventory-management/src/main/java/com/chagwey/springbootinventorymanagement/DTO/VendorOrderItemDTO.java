package com.chagwey.springbootinventorymanagement.DTO;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VendorOrderItemDTO {
	
	private Integer id;
	
	private BigDecimal quantity;

	private BigDecimal unitPrice;
	
	VendorOrderDTO vendorOrder;
	
	ArticleDTO article;

}
