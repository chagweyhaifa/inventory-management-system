package com.chagwey.springbootinventorymanagement.controller;

import java.util.List;

import com.chagwey.springbootinventorymanagement.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.chagwey.springbootinventorymanagement.controller.API.ArticleAPI;
import com.chagwey.springbootinventorymanagement.service.ArticleService;

@RestController
@CrossOrigin("*")
public class ArticleController implements ArticleAPI {


//	Field injection

    @Qualifier("ArticleServiceImpl")
    private ArticleService articleService;

//  Getter injection
//	@Autowired
//	public ArticleService getArticleservice() {
//		return articleService;
//	}

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }


    @Override
    public List<Article> findAll() {
        return articleService.findAll();
    }

    @Override
    public Article findById(Integer id) {
        return articleService.findById(id);

    }

    @Override
    public Article findByCode(String codeArticle) {
        return articleService.findByCode(codeArticle);
    }

    @Override
    public Article save(Article article) {
        return articleService.save(article);
    }

//    @Override
//    public Article update(Article article) {
//        return null;
//    }

    @Override
    public void delete(Integer id) {
        articleService.delete(id);
    }

}
