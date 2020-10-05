package com.fernando.agendacontato.dto;

import java.io.Serializable;

import com.fernando.agendacontato.domain.Contato;

public class ContatoDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String sexo;
	private String telefone;
	private String email;
	
	
	public ContatoDTO() {

	}
	
	public ContatoDTO(Contato obj) {
		 id = obj.getId();
		 nome = obj.getNome();
		 sexo = obj.getSexo();
		 telefone = obj.getTelefone();
		 email = obj.getEmail();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
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
	
	
	
	
}
