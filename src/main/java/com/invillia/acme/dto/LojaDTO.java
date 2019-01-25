package com.invillia.acme.dto;

import java.io.Serializable;

import com.invillia.acme.model.Loja;

public class LojaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String endereco;

	public LojaDTO() {
	}
	
	public LojaDTO(Loja obj) {
		id = obj.getId();
		nome = obj.getNome();
		endereco = obj.getEndereco();
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

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
