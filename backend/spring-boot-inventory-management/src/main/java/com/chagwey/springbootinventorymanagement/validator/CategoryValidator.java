package com.chagwey.springbootinventorymanagement.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.chagwey.springbootinventorymanagement.DTO.CategoryDTO;

public class CategoryValidator {
	
	public static List < String > validate ( CategoryDTO categoryDTO ) {
		List < String > errors = new ArrayList < > ( ) ;
		  if ( categoryDTO == null || ! StringUtils.hasLength ( categoryDTO.getCode ( ) ) ) {
		    errors.add ( "Please enter the category code" ) ;
		 }
		 return errors ;
		  
	} 

}
