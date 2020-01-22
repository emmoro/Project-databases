package br.com.core.database.service;

import java.util.List;

import br.com.core.database.oracle.entities.UsuarioTO;

public interface UsuarioService {
	
	/**
	 * Busca todos os Usuarios
	 * @return List<UsuarioTO>
	 * @throws Exception
	 */
	public abstract List<UsuarioTO> buscaTodosUsuarios() throws Exception;
	
	/**
	 * Inserir Usuario na Base
	 * @param UsuarioTO usuario
	 * @throws Exception
	 */
	public abstract void inserirUsuario(UsuarioTO usuario) throws Exception;
	
	/**
	 * Faz update no Usuario
	 * @param UsuarioTO usuario
	 * @return UsuarioTO
	 * @throws Exception
	 */
	public abstract UsuarioTO updateUsuario(UsuarioTO usuario) throws Exception;
	
	/**
	 * Busca Usuario por Login
	 * @param String login
	 * @return UsuarioTO
	 * @throws Exception
	 */
	public abstract UsuarioTO buscaUsuarioPorLogin(String login) throws Exception;
	
}
