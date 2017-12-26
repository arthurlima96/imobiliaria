package br.com.lab.imobiliaria.model;

import java.time.LocalDate;

public class Locacao {
		
	public Locacao(Long id_locacao, Imoveis id_imovel, Clientes id_cliente, Double valor_aluguel,
			Double percetual_multa, Integer dia_vencimento, LocalDate data_inicio, LocalDate data_fim, Boolean ativo,
			String obs) {
		this.id_locacao = id_locacao;
		this.id_imovel = id_imovel;
		this.id_cliente = id_cliente;
		this.valor_aluguel = valor_aluguel;
		this.percetual_multa = percetual_multa;
		this.dia_vencimento = dia_vencimento;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.ativo = ativo;
		this.obs = obs;
	}
	
	
	
	public Locacao(Imoveis id_imovel, Clientes id_cliente, Double valor_aluguel, Double percetual_multa,
			Integer dia_vencimento, LocalDate data_inicio, LocalDate data_fim, Boolean ativo, String obs) {
		this.id_imovel = id_imovel;
		this.id_cliente = id_cliente;
		this.valor_aluguel = valor_aluguel;
		this.percetual_multa = percetual_multa;
		this.dia_vencimento = dia_vencimento;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.ativo = ativo;
		this.obs = obs;
	}

	public Locacao(Long id_locacao) {
		this.id_locacao = id_locacao;		
	}

	private Long id_locacao;
	
	private Imoveis id_imovel;
	
	private Clientes id_cliente;
	
	private Double valor_aluguel;
	
	private Double percetual_multa;
	
	private Integer dia_vencimento;
	
	private LocalDate data_inicio;
	
	private LocalDate data_fim;
	
	private Boolean ativo;
	
	private String obs;

	public Long getId_locacao() {
		return id_locacao;
	}

	public void setId_locacao(Long id_locacao) {
		this.id_locacao = id_locacao;
	}

	public Imoveis getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(Imoveis id_imovel) {
		this.id_imovel = id_imovel;
	}

	public Clientes getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Clientes id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Double getValor_aluguel() {
		return valor_aluguel;
	}

	public void setValor_aluguel(Double valor_aluguel) {
		this.valor_aluguel = valor_aluguel;
	}

	public Double getPercetual_multa() {
		return percetual_multa;
	}

	public void setPercetual_multa(Double percetual_multa) {
		this.percetual_multa = percetual_multa;
	}

	public Integer getDia_vencimento() {
		return dia_vencimento;
	}

	public void setDia_vencimento(Integer dia_vencimento) {
		this.dia_vencimento = dia_vencimento;
	}

	public LocalDate getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(LocalDate data_inicio) {
		this.data_inicio = data_inicio;
	}
	
	public LocalDate getData_fim() {
		return data_fim;
	}



	public void setData_fim(LocalDate data_fim) {
		this.data_fim = data_fim;
	}



	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	@Override
	public String toString() {
		return 		  "ID Locação: ["+getId_locacao()+"] "
					+ "ID Imovel: ["+getId_imovel().getId_imovel()+"] "
					+ "ID Inquilino: ["+getId_cliente().getId_cliente()+"] "
					+ "Valor Aluguel: ["+getValor_aluguel()+"] "
					+ "Multa: ["+getPercetual_multa()+"] "
					+ "Dia Vencimento: ["+getDia_vencimento()+"] "
//					+ "Data Inicio: ["+fmt.print(getData_inicio())+"] "
//					+ "Data Fim: ["+fmt.print(getData_fim())+"] "
					+ "Ativo: ["+getAtivo()+"] "
					+ "Observação: ["+getObs()+"] ";
	}
	
}
