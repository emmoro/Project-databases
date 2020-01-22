package br.com.core.database.oracle.entities;

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
@Table(name = "USUARIO")
public class UsuarioTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5408691903500083427L;
	
	//****************************************************************
	// ATRIBUTOS
	//****************************************************************
	
	@Id
	@SequenceGenerator(name="seq_usuario", sequenceName="seq_usuario", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_usuario")
	private Long id;
	
	@Column(name="NOME_CLIENTE")
	private String nomeCliente;
	
	@Column(name="DATA_NASCIMENTO")
	private Date dataNascimento;
	
	@Column(name="LOGIN")
	private String login;
	
	//****************************************************************
	// GETTERS & SETTERS
	//****************************************************************

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
		result = prime * result + ((login == null) ? 0 : login.hashCode());
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
		UsuarioTO other = (UsuarioTO) obj;
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
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
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
		return "UsuarioTO [id=" + id + ", nomeCliente=" + nomeCliente + ", dataNascimento=" + dataNascimento
				+ ", login=" + login + "]";
	}

}
