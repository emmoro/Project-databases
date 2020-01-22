package br.com.core.database.postgresql.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente", schema = "estudo")
public class ClienteTO implements Serializable {
	
	private static final long serialVersionUID = -2688731199112016392L;
	
	//****************************************************************
	// ATRIBUTOS
	//****************************************************************
	
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@SequenceGenerator(name="estudo.cliente_idsequence", sequenceName="estudo.cliente_idsequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="estudo.cliente_idsequence")		
	private Integer id;
	
	@Column(name="NOME_CLIENTE")
	private String nomeCliente;
	
	@Column(name="DATA_NASCIMENTO")
	private Date dataNascimento;
	
	//****************************************************************
	// GETTERS & SETTERS
	//****************************************************************

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//****************************************************************
	// HASH CODE & EQUALS
	//****************************************************************

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteTO other = (ClienteTO) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		return true;
	}

	//****************************************************************
	// ToString
	//****************************************************************
	
	@Override
	public String toString() {
		return "ClienteTO [id=" + id + ", nomeCliente=" + nomeCliente + ", dataNascimento=" + dataNascimento + "]";
	}
	
}
