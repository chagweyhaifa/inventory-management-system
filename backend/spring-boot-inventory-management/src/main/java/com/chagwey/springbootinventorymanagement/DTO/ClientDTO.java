package com.chagwey.springbootinventorymanagement.DTO;

import java.util.List;
import java.util.stream.Collectors;

import com.chagwey.springbootinventorymanagement.model.Client;
import com.chagwey.springbootinventorymanagement.model.ClientOrder;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClientDTO {
	
	private Integer id;
	
	private String firstName;
	
	private String lastName;

	private AddressDTO addressDTO;
	
	private String image;
	
	private String email;
	
	private String phoneNumber;
	
	List<ClientOrderDTO> clientOrders; 
	
	public static ClientDTO fromEntity(Client client) {
		
		if(client == null) {
			return null;
//			TODO throw an exception
		}
		
		return ClientDTO.builder()
				.id(client.getId())
				.firstName(client.getFirstName())
				.lastName(client.getLastName())
				.image(client.getImage())
				.email(client.getEmail())
				.phoneNumber(client.getPhoneNumber())
				
				.build();
		
	}
	
	public static Client toEntity(ClientDTO clientDTO) {
		
		if(clientDTO == null) {
			return null;
//			TODO throw an exception
		}
		
		Client client = new Client();
		
		client.setId(clientDTO.getId());
		client.setFirstName(clientDTO.getFirstName());
		client.setLastName(clientDTO.getLastName());
		client.setAddress(AddressDTO.toEntity(clientDTO.getAddressDTO()));
		client.setImage(clientDTO.getImage());
		client.setEmail(clientDTO.getEmail());
		client.setPhoneNumber(clientDTO.getPhoneNumber());
//		client.setClientOrders(clientDTO.getClientOrders().stream().map(ClientOrder::toEntity).collect(Collectors.toList());
		
		
		return client;
		
	}

}
