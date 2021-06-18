package br.edu.imed.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -7018526342299627730L;

	@Id @Column(name="id_user")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_user;
	
	@Column(name="nome_user")
	private String nome_user;

	@Column(name="senha_user")
	private String senha_user;

	public Integer getId() {
		return id_user;
	}

	public void setId(Integer id_user) {
		this.id_user = id_user;
	}

	public String getNome() {
		return nome_user;
	}

	public void setNome(String nome_user) {
		this.nome_user = nome_user;
	}
	public String getSenha() {
		return senha_user;
	}

	public void setSenha(String senha_user) {
		this.senha_user = senha_user;
	}
}