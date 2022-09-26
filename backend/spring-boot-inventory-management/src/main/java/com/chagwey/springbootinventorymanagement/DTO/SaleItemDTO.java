package com.chagwey.springbootinventorymanagement.DTO;

import java.math.BigDecimal;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaleItemDTO {
	
	private Integer id;

	SaleDTO sale;

	ArticleDTO article;
	
	private BigDecimal quantity;
	
	private BigDecimal unitPrice;
}
