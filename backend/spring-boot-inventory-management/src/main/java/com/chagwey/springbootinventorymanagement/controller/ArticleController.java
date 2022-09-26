package com.chagwey.springbootinventorymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.chagwey.springbootinventorymanagement.DTO.ArticleDTO;
import com.chagwey.springbootinventorymanagement.controller.API.ArticleAPI;
import com.chagwey.springbootinventorymanagement.service.ArticleService;

@RestController
public class ArticleController implements ArticleAPI {



//	Field injection
	@Autowired
	@Qualifier("ArticleServiceImpl")
	private ArticleService articleService;

//  Getter injection
//	@Autowired
//	public ArticleService getArticleservice() {
//		return articleService;
//	}

//	@Autowired
//	public ArticleController(ArticleService articleService) {
//		this.articleService = articleService;
//	}
	

	
	@Override
	public List<ArticleDTO> findAll() {
		return articleService.findAll();
	}

	@Override
	public ArticleDTO findById(Integer id) {
		return articleService.findById(id);

	}

	@Override
	public ArticleDTO findByCodeArticle(String codeArticle) {
		return articleService.findByCode(codeArticle);
	}

	@Override
	public ArticleDTO save(ArticleDTO articleDTO) {
		return articleService.save(articleDTO);
	}
	
	@Override
	public void delete(Integer id) {
		 articleService.delete(id);
	}

	 



	 


}
