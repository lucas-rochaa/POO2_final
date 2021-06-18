package br.edu.imed.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="mensagem")
public class Mensagemadm implements Serializable {

	private static final long serialVersionUID = -7018526342299627730L;

	@Id @Column(name="id_mensagem")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_user;
	
	@Column(name="nome_user")
	private String nome_user;
	
	@Column(name="telefone")
	private String telefone;

	@Column(name="email")
	private String email;
	
	@Column(name="func")
	private String func;
	
	@Column(name="idade")
	private String idade;
	
	@Column(name="peso")
	private String peso;
	
	@Column(name="Mensagem")
	private String Mensagem;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getMensagem() {
		return Mensagem;
	}

	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}

	public String getNome_user() {
		return nome_user;
	}

	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}

	

}