package br.com.lab.imobiliaria.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100	)
	private String nome;
	
	@Column(nullable = false, unique = true, length = 11)
	private String CPF;
	
	private String telefone1;
	
	private String telefone2;
	
	@Column(nullable = false, unique = true, length = 255)
	private String email;
	
	@Column(nullable = false)
	private LocalDate data_nascimento;
	
	
	public Clientes(Long id, String nome, String cPF, String telefone1, String telefone2, String email,
			LocalDate data_nascimento) {
		this.id = id;
		this.nome = nome;
		CPF = cPF;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}
	
	

	public Clientes(String nome, String cPF, String telefone1, String telefone2, String email,
			LocalDate data_nascimento) {
		this.nome = nome;
		CPF = cPF;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.email = email;
		this.data_nascimento = data_nascimento;
	}
	
	
	public Clientes(Long id) {
		this.id = id;
	}
	
	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
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
