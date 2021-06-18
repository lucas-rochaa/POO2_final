package br.edu.imed.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="agendamento")
public class Agendamento implements Serializable {

	private static final long serialVersionUID = -7018526342299627730L;

	@Id @Column(name="nome_user")
	private String nome_user;

	@Column(name="modalidades")
	private String modalidades;
	
	@Column(name="data")
	private String data;
	
	@Column(name="horario")
	private String horario;
	
	@Column(name="personal")
	private String personal;

	public String getNome_user() {
		return nome_user;
	}

	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}

	public String getModalidades() {
		return modalidades;
	}

	public void setModalidades(String modalidades) {
		this.modalidades = modalidades;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}


}