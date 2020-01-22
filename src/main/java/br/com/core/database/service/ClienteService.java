package br.com.core.database.service;

import java.util.List;

import br.com.core.database.postgresql.entities.ClienteTO;

public interface ClienteService {
	
	/**
	 * Busca todos os Clientes
	 * @return List<ClienteTO>
	 * @throws Exception
	 */
	public abstract List<ClienteTO> buscaTodosClientes() throws Exception;
	
	/**
	 * Inserir cliente na Base
	 * @param ClienteTO cliente
	 * @throws Exception
	 */
	public abstract void inserirCliente(ClienteTO cliente) throws Exception;
	
	/**
	 * Faz update no Cliente
	 * @param ClienteTO cliente
	 * @return ClienteTO
	 * @throws Exception
	 */
	public abstract ClienteTO updateCliente(ClienteTO cliente) throws Exception;

}
