package com.chagwey.springbootinventorymanagement.DTO;

import java.util.List;

import com.chagwey.springbootinventorymanagement.model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class CategoryDTO {
	
	private Integer id;

	private String code;
	
	private String description;
	
	@JsonIgnore
	private List<ArticleDTO> articleDTOs;
	
	public static CategoryDTO fromEntity(Category category) {
		
		if(category == null) {
			return null;
//			TODO throw an exception
		}
		
		return CategoryDTO.builder()
				.id(category.getId())
				.code(category.getCode())
				.description(category.getDescription())
				.build();
		
	}
	
	public static Category toEntity(CategoryDTO categoryDTO) {
		
		if(categoryDTO == null) {
			return null;
//			TODO throw an exception
		}
		
		Category category = new Category();
		
		category.setId(categoryDTO.getId());
		category.setCode(categoryDTO.getCode());
		category.setDescription(categoryDTO.getDescription());
		
		return category;
		
	}
}
