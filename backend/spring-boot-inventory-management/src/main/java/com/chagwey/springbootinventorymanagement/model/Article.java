package com.chagwey.springbootinventorymanagement.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@Entity
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
public class Article extends AbstractEntity {
	
	private String code;
	
	private String description;
	
	private BigDecimal taxExclUnitPrice;
	
	private BigDecimal VATRate;
	
	private BigDecimal taxInclUnitPrice;
	
	private String image;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company;
	
	//*	
	@OneToMany(mappedBy="article")
	List<ClientOrderItem> clientOrderItems;
	//*
	@OneToMany(mappedBy="article")
	List<VendorOrderItem> vendorOrderItems;
	//*
	@OneToMany(mappedBy="article")
	List<SaleItem> SaleItems;
	
	//*
	@OneToMany(mappedBy="article")
	List<StockMvt> stockMvt;
	
	

}
