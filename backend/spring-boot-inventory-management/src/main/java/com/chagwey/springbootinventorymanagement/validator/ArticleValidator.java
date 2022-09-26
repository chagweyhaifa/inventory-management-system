 package com.chagwey.springbootinventorymanagement.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.chagwey.springbootinventorymanagement.DTO.ArticleDTO;

public class ArticleValidator {

	public static List<String> validate(ArticleDTO articleDTO) {
		List<String> errors = new ArrayList<>();
		if (articleDTO == null) {
			errors.add("Please enter the article code");
			errors.add("Please enter the article description");
			errors.add("Please enter article the tax exclusive unit price");
			errors.add("Please enter article the tax inclusive unit price");
			errors.add("Please enter the article VAT rate");
			errors.add("Please select a category");
			return errors;
		}

		if (!StringUtils.hasLength(articleDTO.getCode())) {
			errors.add("Please enter the article code");
		}
		if (!StringUtils.hasLength(articleDTO.getDescription())) {
			errors.add("Please enter the article description");
		}
		if (articleDTO.getTaxExclUnitPrice() == null) {
			errors.add("Please enter article the tax exclusive unit price");
		}
		if (articleDTO.getTaxInclUnitPrice() == null) {
			errors.add("Please enter article the tax exclusive unit price");
		}
		if (articleDTO.getVATRate() == null) {	
			errors.add("Please enter the article VAT rate");
		}
		if (articleDTO.getCategoryDTO() == null) {
			errors.add("Please select a category");
		}
		return errors;

	}
}