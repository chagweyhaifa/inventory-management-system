package com.chagwey.springbootinventorymanagement.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor
@NoArgsConstructor
public class ClientOrder extends AbstractEntity {
	
	private String code;
	
	private Instant orderDate;
	
	@ManyToOne
	@JoinColumn(name="client_id")
	Client client;
	
	@OneToMany(mappedBy="clientOrder")
	List<ClientOrderItem> clientOrderItems;

}
