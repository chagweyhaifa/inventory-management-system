package com.chagwey.springbootinventorymanagement.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
public class User extends AbstractEntity {
	
	private String firstName;
	
	private String lastName;
	
	private String birthDay;
	
	private String password;
	
	private Address address;
	
	private String image;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	Company company;
	
//	@OneToMany(mappedBy="user")
//	List<Role> roles;
	

}
