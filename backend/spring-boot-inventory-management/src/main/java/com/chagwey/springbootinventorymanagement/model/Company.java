package com.chagwey.springbootinventorymanagement.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
public class Company  extends AbstractEntity{
	
	private String name;
	
	private String description;
	
	private Address address;
	
	private String codeFiscal;
	
	private String photo;
	
	private String email;
	
	private String phoneNumber;
	
	private String website;
	
	@OneToMany(mappedBy="company")
	List<User> users;
	
	@OneToMany(mappedBy="company")
	List<Article> articles;

}
