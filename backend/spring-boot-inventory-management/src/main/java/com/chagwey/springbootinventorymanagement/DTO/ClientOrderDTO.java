package com.chagwey.springbootinventorymanagement.DTO;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.chagwey.springbootinventorymanagement.model.ClientOrder;
import com.chagwey.springbootinventorymanagement.model.ClientOrderItem;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClientOrderDTO {
	
	private Integer id;
	
	private String code;
	
	private Instant orderDate;
	
	ClientDTO clientDTO;
	
	List<ClientOrderItemDTO> clientOrderItems;
	
	public static ClientOrderDTO fromEntity(ClientOrder clientOrder) {
		if(clientOrder == null) {
			return null;
		}
		return ClientOrderDTO.builder()
				.id(clientOrder.getId())
				.code(clientOrder.getCode())
				.orderDate(clientOrder.getOrderDate())
				.clientDTO(ClientDTO.fromEntity(clientOrder.getClient()))
//				.clientOrderItems(clientOrder.getClientOrderItems().stream().map(ClientOrderItemDTO::fromEntity).collect(Collectors.toList())
				.build();
		
	}
	
	public static ClientOrder toEntity(ClientOrderDTO clientOrderDTO) {
		ClientOrder clientOrder = new ClientOrder();
		clientOrder.setId(clientOrderDTO.getId());
		clientOrder.setCode(clientOrderDTO.getCode());
		clientOrder.setClient(ClientDTO.toEntity(clientOrderDTO.getClientDTO()));
//		clientOrder.setClientOrderItems(clientOrderDTO.getClientOrderItems().stream().map(ClientOrderItem::toEntity).collect(Collectors.toList());
		return clientOrder;
		
	}

}
