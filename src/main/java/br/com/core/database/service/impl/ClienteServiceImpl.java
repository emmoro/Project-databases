package br.com.core.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.core.database.postgresql.entities.ClienteTO;
import br.com.core.database.postgresql.repository.ClienteRepository;
import br.com.core.database.service.ClienteService;

@Service("clienteService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
public class ClienteServiceImpl implements ClienteService {
	
	//****************************************************************
	// DAOs e Services
	//****************************************************************
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//****************************************************************
	// METODOS
	//****************************************************************
	
	@Override
	public List<ClienteTO> buscaTodosClientes() throws Exception {
		return clienteRepository.findAll();
	}
	
	@Override
	public void inserirCliente(ClienteTO cliente) throws Exception {
		clienteRepository.saveAndFlush(cliente);
	}
	
	@Override
	public ClienteTO updateCliente(ClienteTO cliente) throws Exception {
		return clienteRepository.saveAndFlush(cliente);
	}

}