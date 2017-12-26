package br.com.lab.imobiliaria.model;

public class Imoveis {
	
	
	
	public Imoveis(Long id_imovel, String tipo_imovel, String endereco, String bairro, String cep, Double metragem,
			Integer dormitorios, Integer banheiros, Integer suits, Integer vagasGaragem, Double valorAluguel,
			String obs) {
		this.id_imovel = id_imovel;
		this.tipo_imovel = tipo_imovel;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.metragem = metragem;
		this.dormitorios = dormitorios;
		this.banheiros = banheiros;
		this.suits = suits;
		this.vagasGaragem = vagasGaragem;
		this.valorAluguel = valorAluguel;
		this.obs = obs;
	}
	
	

	public Imoveis(String tipo_imovel, String endereco, String bairro, String cep, Double metragem, Integer dormitorios,
			Integer banheiros, Integer suits, Integer vagasGaragem, Double valorAluguel, String obs) {
		this.tipo_imovel = tipo_imovel;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.metragem = metragem;
		this.dormitorios = dormitorios;
		this.banheiros = banheiros;
		this.suits = suits;
		this.vagasGaragem = vagasGaragem;
		this.valorAluguel = valorAluguel;
		this.obs = obs;
	}



	public Imoveis(Long id_imovel) {
		this.id_imovel = id_imovel;
	}



	private Long id_imovel;
	
	private String tipo_imovel;
	
	private String endereco;
	
	private String bairro;
	
	private String cep;
	
	private Double metragem;
	
	private Integer dormitorios;
	
	private Integer banheiros;
	
	private Integer suits;
	
	private Integer vagasGaragem;
	
	private Double valorAluguel;
	
	private String obs;

	public Long getId_imovel() {
		return id_imovel;
	}

	public void setId_imovel(Long id_imovel) {
		this.id_imovel = id_imovel;
	}

	public String getTipo_imovel() {
		return tipo_imovel;
	}

	public void setTipo_imovel(String tipo_imovel) {
		this.tipo_imovel = tipo_imovel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Double getMetragem() {
		return metragem;
	}

	public void setMetragem(Double metragem) {
		this.metragem = metragem;
	}

	public Integer getDormitorios() {
		return dormitorios;
	}

	public void setDormitorios(Integer dormitorios) {
		this.dormitorios = dormitorios;
	}

	public Integer getBanheiros() {
		return banheiros;
	}

	public void setBanheiros(Integer banheiros) {
		this.banheiros = banheiros;
	}

	public Integer getSuits() {
		return suits;
	}

	public void setSuits(Integer suits) {
		this.suits = suits;
	}

	public Integer getVagasGaragem() {
		return vagasGaragem;
	}

	public void setVagasGaragem(Integer vagasGaragem) {
		this.vagasGaragem = vagasGaragem;
	}

	public Double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}	
	
	@Override
	public String toString() {
		return 		  "ID: ["+getId_imovel()+"] "
					+ "Tipo: ["+getTipo_imovel()+"] "
					+ "Endereço: ["+getEndereco()+"] "
					+ "Bairro: ["+getBairro()+"] "
					+ "CEP: ["+getCep()+"] "
					+ "Metragem: ["+getMetragem()+"] "
					+ "Dormitorios: ["+getDormitorios()+"] "
					+ "Banheiros: ["+getBanheiros()+"] "
					+ "Suites: ["+getSuits()+"] "
					+ "Vagas Garagem: ["+getVagasGaragem()+"] "
					+ "Valor do Aluguel: ["+getValorAluguel()+"] "
					+ "Obs: ["+getObs()+"] ";
	}
}
