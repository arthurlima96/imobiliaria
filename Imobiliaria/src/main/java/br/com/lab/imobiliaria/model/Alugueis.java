package br.com.lab.imobiliaria.model;

import java.time.LocalDate;

public class Alugueis {
		
	public Alugueis(Locacao id_locacao, LocalDate data_vencimento, Double valor_pago, LocalDate data_pagamento,
			String obs) {
		this.id_locacao = id_locacao;
		this.data_vencimento = data_vencimento;
		this.valor_pago = valor_pago;
		this.data_pagamento = data_pagamento;
		this.obs = obs;
	}

	private Locacao id_locacao;
	
	private LocalDate data_vencimento;
	
	private Double valor_pago;
	
	private LocalDate data_pagamento;
	
	private String obs;

	public Locacao getId_locacao() {
		return id_locacao;
	}

	public void setId_locacao(Locacao id_locacao) {
		this.id_locacao = id_locacao;
	}

	public LocalDate getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(LocalDate data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public Double getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(Double valor_pago) {
		this.valor_pago = valor_pago;
	}
	
	public void setData_pagamento(LocalDate data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	
	public LocalDate getData_pagamento() {
		return data_pagamento;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
	@Override
	public String toString() {
		return 		  "ID Locação: ["+getId_locacao().getId_locacao()+"] "
					//+ "Data Vencimento: ["+fmt.print(getData_vencimento())+"] "
					+ "Valor Pago: ["+getValor_pago()+"] "
					//+ "Data Pagamento: ["+fmt.print(getData_pagamento())+"] "
					+ "Observação: ["+getObs()+"] ";
	}
}
