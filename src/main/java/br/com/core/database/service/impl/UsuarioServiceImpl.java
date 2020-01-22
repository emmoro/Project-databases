package br.com.core.database.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.core.database.oracle.entities.UsuarioTO;
import br.com.core.database.oracle.repository.UsuarioRepository;
import br.com.core.database.service.UsuarioService;

@Service("usuarioService")
@Transactional(readOnly = true, propagation = Propagation.REQUIRES_NEW)
public class UsuarioServiceImpl implements UsuarioService {
	
	
	//****************************************************************
	// DAOs e Services
	//****************************************************************
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//****************************************************************
	// METODOS
	//****************************************************************
	
	@Override
	public List<UsuarioTO> buscaTodosUsuarios() throws Exception {
		return usuarioRepository.findAll();
	}
	
	@Override
	public void inserirUsuario(UsuarioTO usuario) throws Exception {
		usuarioRepository.saveAndFlush(usuario);
	}
	
	@Override
	public UsuarioTO updateUsuario(UsuarioTO usuario) throws Exception {
		return usuarioRepository.saveAndFlush(usuario);
	}
	
	@Override
	public UsuarioTO buscaUsuarioPorLogin(String login) throws Exception {
		return usuarioRepository.buscaUsuarioPorLogin(login);
	}

}
