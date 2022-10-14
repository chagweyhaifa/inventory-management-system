//package com.chagwey.springbootinventorymanagement.service.impl;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import com.chagwey.springbootinventorymanagement.exception.EntityNotFoundException;
//import com.chagwey.springbootinventorymanagement.exception.ErrorCode;
//import com.chagwey.springbootinventorymanagement.exception.InvalidEntityException;
//import com.chagwey.springbootinventorymanagement.model.Client;
//import com.chagwey.springbootinventorymanagement.repository.ClientRepository;
//import com.chagwey.springbootinventorymanagement.service.ClientService;
//import com.chagwey.springbootinventorymanagement.validator.ClientValidator;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Service
//@Slf4j
//public class ClientSericeImpl implements ClientService {
//
//    @Autowired
//    ClientRepository clientRepository;
//
//    @Override
//    public List<Client> findAll() {
//        return clientRepository.findAll();
//    }
//
//    @Override
//    public Client findById(Integer id) {
//        if (id == null) {
//            log.error(" Client ID is null ");
//            return null;
//        }
////        Optional<Client> optionalClient = clientRepository.findById(id);
////        Client clientDTO = Client.fromEntity(optionalClient.get());
////        return Optional.of(clientDTO)
////                .orElseThrow(() -> new EntityNotFoundException("No client with id " + id + " was found.",
////                        ErrorCode.CLIENT_NOT_FOUND));
//
//
//    @Override
//    public ClientDTO save(ClientDTO clientDTO) {
//        List<String> errors = ClientValidator.validate(clientDTO);
//        if (!errors.isEmpty()) {
//            log.error("Client is not valid " + clientDTO);
//            throw new InvalidEntityException("Client is not valid", ErrorCode.CLIENT_NOT_VALID, errors);
//            // InvalidEntityException(String message, ErrorCode errorCode, List<String> errors)
//        }
//        return ClientDTO.fromEntity(clientRepository.save(ClientDTO.toEntity(clientDTO)));
//    }
//
//    @Override
//    public void delete(Integer id) {
//        if (id == null) {
//            log.error("Client ID is null");
//            return;
//        }
//        clientRepository.deleteById(id);
//
//    }
//
//}
