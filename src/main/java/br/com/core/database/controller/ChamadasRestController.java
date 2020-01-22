package br.com.core.database.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.core.database.oracle.entities.UsuarioTO;
import br.com.core.database.postgresql.entities.ClienteTO;
import br.com.core.database.service.ClienteService;
import br.com.core.database.service.UsuarioService;

@RestController
@RequestMapping({ "database" })
public class ChamadasRestController {
	
	private static final Log log = LogFactory.getLog(ChamadasRestController.class);
	
	//****************************************************************
	// Services
	//****************************************************************
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	//*****************************************************************
	// METODOS
	//*****************************************************************

	@GetMapping({ "/buscaClientes" })
	public @ResponseBody List<ClienteTO> buscaTodosClientes() throws Exception {
		
		List<ClienteTO> lista = new ArrayList<ClienteTO>();
		try {	
			lista = clienteService.buscaTodosClientes();
		} catch (Exception e) {
			log.error(" Erro na Busca de Cliente" + e.getMessage());
			throw new Exception(" Erro na Busca de Cliente" + e.getMessage());
		}
		
		return lista;
	}
	
	@GetMapping({ "/buscaUsuario/{login}" })
	public @ResponseBody UsuarioTO buscaUsuarioPorLogin(@PathVariable("login") String login) throws Exception {
		
		UsuarioTO usuario = null;
		try {	
			usuario = usuarioService.buscaUsuarioPorLogin(login);
		} catch (Exception e) {
			log.error(" Erro na Busca de Usuario" + e.getMessage());
			throw new Exception(" Erro na Busca de Usuario" + e.getMessage());
		}
		
		return usuario;
	}

}
