package com.chagwey.springbootinventorymanagement.controller.API;

import static com.chagwey.springbootinventorymanagement.utils.Constant.APP_ROOT;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.chagwey.springbootinventorymanagement.DTO.ArticleDTO;

public interface ArticleAPI {
	
	@PostMapping(value = APP_ROOT + "/articles/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ArticleDTO save(@RequestBody ArticleDTO articleDTO);
	
	@GetMapping(value = APP_ROOT + "/articles/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
	ArticleDTO findById(@PathVariable("idArticle") Integer id);
	
	@GetMapping(value = APP_ROOT + "/articles/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
	ArticleDTO findByCodeArticle(@PathVariable("codeArticle") String codeArticle);
	
	@GetMapping(value = APP_ROOT + "/articles", produces = MediaType.APPLICATION_JSON_VALUE)
	List<ArticleDTO> findAll();
	
	@DeleteMapping(value = APP_ROOT + "/articles/all", produces = MediaType.APPLICATION_JSON_VALUE)
	void delete(@PathVariable("idArticle") Integer id);

}
