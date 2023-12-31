package io.github.Matheusmachado01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.Matheusmachado01.model.Cliente;
import io.github.Matheusmachado01.repository.ClientesRepository;

@Service
public class ClientesService {
	
	private ClientesRepository repository;
	
	@Autowired
	public ClientesService(ClientesRepository repository) {
		this.repository = repository;
	}
	
	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);
		this.repository.persistir(cliente);
	}
	
	public void validarCliente(Cliente cliente) {
		
	}

}
