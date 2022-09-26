package com.chagwey.springbootinventorymanagement.DTO;

import java.math.BigDecimal;

import com.chagwey.springbootinventorymanagement.model.ClientOrder;
import com.chagwey.springbootinventorymanagement.model.ClientOrderItem;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientOrderItemDTO {
	
	private Integer id;

	ClientOrderDTO clientOrderDTO;

	ArticleDTO articleDTO;
	
	private BigDecimal quantity;
	
	private BigDecimal unitPrice;
	
	public static ClientOrderItemDTO fromEntity(ClientOrderItem clientOrderItem) {
		
		if(clientOrderItem ==null)
			return null;
		return ClientOrderItemDTO.builder()
				.id(clientOrderItem.getId())
				.articleDTO(ArticleDTO.fromEntity(clientOrderItem.getArticle()))
				.clientOrderDTO(ClientOrderDTO.fromEntity(clientOrderItem.getClientOrder()))
				.quantity(clientOrderItem.getQuantity())
				.unitPrice(clientOrderItem.getUnitPrice())
				.build();
				
	}
	
	public static ClientOrderItem toEntity(ClientOrderItemDTO clientOrderItemDTO) {
		
		ClientOrderItem clientOrderItem = new ClientOrderItem();
		clientOrderItem.setId(clientOrderItem.getId());
		clientOrderItem.setClientOrder(ClientOrderDTO.toEntity(clientOrderItemDTO.getClientOrderDTO()));
		clientOrderItem.setArticle(ArticleDTO.toEntity(clientOrderItemDTO.getArticleDTO()));
		clientOrderItem.setQuantity(clientOrderItemDTO.getQuantity());
		clientOrderItem.setUnitPrice(clientOrderItem.getUnitPrice());
		
		return clientOrderItem;
	}

}
