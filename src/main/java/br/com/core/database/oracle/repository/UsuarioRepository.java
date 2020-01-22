package br.com.core.database.oracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.core.database.oracle.entities.UsuarioTO;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioTO, Integer> {

	 @Query("SELECT usu FROM UsuarioTO usu WHERE usu.login = :login ")
	 public UsuarioTO buscaUsuarioPorLogin(@Param("login") String login) throws Exception;
	 
}
