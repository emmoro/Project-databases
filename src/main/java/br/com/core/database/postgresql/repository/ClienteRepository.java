package br.com.core.database.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.core.database.postgresql.entities.ClienteTO;


@Repository
public interface ClienteRepository extends JpaRepository<ClienteTO, Integer> {

}
