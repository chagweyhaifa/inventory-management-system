package com.chagwey.springbootinventorymanagement.service;

import java.util.List;

import com.chagwey.springbootinventorymanagement.DTO.ArticleDTO;

public interface ArticleService {
	
	ArticleDTO save(ArticleDTO artcleDTO);

	ArticleDTO findById(Integer id);

	ArticleDTO findByCode(String codeArticle);

	List<ArticleDTO> findAll();

	void delete(Integer id);
}