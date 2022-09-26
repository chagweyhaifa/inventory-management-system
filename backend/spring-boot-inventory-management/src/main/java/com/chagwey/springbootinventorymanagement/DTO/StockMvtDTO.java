package com.chagwey.springbootinventorymanagement.DTO;

import java.math.BigDecimal;
import java.time.Instant;



	
import com.chagwey.springbootinventorymanagement.model.StockMvtType;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class StockMvtDTO {
	
	private Integer id;
	
	private Instant mvtDate;
	
	private BigDecimal quantity;
	
	private StockMvtType stockMvtType;
	
	ArticleDTO article;

}
