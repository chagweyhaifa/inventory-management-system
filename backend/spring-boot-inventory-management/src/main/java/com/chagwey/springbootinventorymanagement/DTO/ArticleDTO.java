package com.chagwey.springbootinventorymanagement.DTO;

import java.math.BigDecimal;

import com.chagwey.springbootinventorymanagement.model.Article;


import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ArticleDTO {
	
	private Integer id;
	
	private String code;
	
	private String description;
	
	private BigDecimal taxExclUnitPrice;
	
	private BigDecimal VATRate;
	
	private BigDecimal taxInclUnitPrice;
	
	private String image;

	private CategoryDTO categoryDTO;
	
	public static ArticleDTO fromEntity(Article article) {
		
		if(article == null) {
			return null;
//			TODO throw an exception
		}
		
		return ArticleDTO.builder()
				.id(article.getId())
				.code(article.getCode())
				.description(article.getDescription())
				.taxExclUnitPrice(article.getTaxExclUnitPrice())
				.VATRate(article.getVATRate())
				.taxInclUnitPrice(article.getTaxInclUnitPrice())
				.image(article.getImage())
				.build();
		
	}
	
	public static Article toEntity(ArticleDTO articleDTO) {
		
		if(articleDTO == null) {
			return null;
//			TODO throw an exception
		}
		
		Article article = new Article();
		
		article.setId(articleDTO.getId());
		article.setCode(articleDTO.getCode());
		article.setDescription(articleDTO.getDescription());
		article.setTaxExclUnitPrice(articleDTO.getTaxExclUnitPrice());
		article.setVATRate(articleDTO.getVATRate());
		article.setTaxInclUnitPrice(articleDTO.getTaxInclUnitPrice());
		article.setImage(articleDTO.getImage());
		return article;
		
	}

}
