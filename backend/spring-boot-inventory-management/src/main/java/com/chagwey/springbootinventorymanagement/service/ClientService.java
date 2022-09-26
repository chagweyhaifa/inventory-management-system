package com.chagwey.springbootinventorymanagement.service;

import java.util.List;

import com.chagwey.springbootinventorymanagement.DTO.ClientDTO;

public interface ClientService {
	
	List<ClientDTO> findAll();

	ClientDTO findById(Integer id);

	ClientDTO save(ClientDTO clientDTO);

	void delete(Integer id);

}
