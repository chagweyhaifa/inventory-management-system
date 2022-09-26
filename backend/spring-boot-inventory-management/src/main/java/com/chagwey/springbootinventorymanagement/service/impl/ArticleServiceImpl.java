package com.chagwey.springbootinventorymanagement.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chagwey.springbootinventorymanagement.DTO.ArticleDTO;
import com.chagwey.springbootinventorymanagement.repository.ArticleRepository;
import com.chagwey.springbootinventorymanagement.service.ArticleService;
import com.chagwey.springbootinventorymanagement.validator.ArticleValidator;
import com.chagwey.springbootinventorymanagement.exception.InvalidEntityException;
import com.chagwey.springbootinventorymanagement.model.Article;
import com.chagwey.springbootinventorymanagement.exception.EntityNotFoundException;
import com.chagwey.springbootinventorymanagement.exception.ErrorCode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

@Service("ArticleServiceImpl")
@Slf4j
public class ArticleServiceImpl implements ArticleService {

	ArticleRepository articleRepository;

	@Autowired
//	constructor injection
	public ArticleServiceImpl(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	@Override
	public List<ArticleDTO> findAll() {
		return articleRepository.findAll().stream().map(ArticleDTO::fromEntity).collect(Collectors.toList());
	}

	@Override
	public ArticleDTO findById(Integer id) {
		if (id == null) {
			log.error(" Article ID is null ");
			return null;
		}
		Optional<Article> article = articleRepository.findById(id);
		ArticleDTO articleDTO = ArticleDTO.fromEntity(article.get());
		return Optional.of(articleDTO)
				.orElseThrow(() -> new EntityNotFoundException("No article with id " + id + " was found.",
						ErrorCode.ARTICLE_NOT_FOUND));
	}	

	@Override
	public ArticleDTO findByCode(String code) {
		if (!StringUtils.hasLength(code)) {
			log.error(" Article CODE is null ");
			return null;
		}
		Optional<Article> article = articleRepository.findArticleByCode(code);
		return Optional.of(ArticleDTO.fromEntity(article.get()))
				.orElseThrow(() -> new EntityNotFoundException("No article with code " + code + " was found.",
						ErrorCode.ARTICLE_NOT_FOUND));
	}

	@Override
	public ArticleDTO save(ArticleDTO articleDTO) {
		List<String> errors = ArticleValidator.validate(articleDTO);
		if (!errors.isEmpty()) {
			log.error("Article is not valid " + articleDTO);
			throw new InvalidEntityException("Article is not valid", ErrorCode.ARTICLE_NOT_VALID, errors);
			// InvalidEntityException(String message, ErrorCode errorCode, List<String>
			// errors)
		}
		return ArticleDTO.fromEntity(articleRepository.save(ArticleDTO.toEntity(articleDTO)));
	}

	@Override
	public void delete(Integer id) {
		if (id == null) {
			log.error("Article ID is null");
			return;
		}
		articleRepository.deleteById(id);
	}

}
