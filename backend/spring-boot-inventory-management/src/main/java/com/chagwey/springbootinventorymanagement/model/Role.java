package com.chagwey.springbootinventorymanagement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
public class Role extends AbstractEntity {
	
	private String name;
	
//	@ManyToOne
//	@JoinColumn(name="user_id")
//	User user;

}
