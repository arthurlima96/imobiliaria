package br.com.lab.imobiliaria.model;

import java.time.LocalDate;

public class Clientes {
	
	
	
	public Clientes(Long id_cliente, String nome_cliente, String cPF, String telefone1, String telefone2, String email,
			LocalDate data_nascimento) {
		this.id_cliente = id_cliente;
		this.nome_cliente = nome_cliente;
		CPF = cPF;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}
	
	

	public Clientes(String nome_cliente, String cPF, String telefone1, String telefone2, String email,
			LocalDate data_nascimento) {
		this.nome_cliente = nome_cliente;
		CPF = cPF;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}
	
	
	public Clientes(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	private Long id_cliente;
	
	private String nome_cliente;
	
	private String CPF;
	
	private String telefone1;
	
	private String telefone2;
	
	private String email;
	
	private LocalDate data_nascimento;

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public LocalDate getData_nascimento() {
		return data_nascimento;
	}



	public void setData_nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}


}
