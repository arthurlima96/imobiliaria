package br.com.lab.imobiliaria.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.lab.imobiliaria.dao.ClientesDAO;
import br.com.lab.imobiliaria.dao.ImoveisDAO;
import br.com.lab.imobiliaria.dao.LocacoesDAO;
import br.com.lab.imobiliaria.infra.EMFactory;
import br.com.lab.imobiliaria.model.Clientes;
import br.com.lab.imobiliaria.model.Imoveis;
import br.com.lab.imobiliaria.model.Locacao;

public class LocacaoTeste {
	 
	public static void main(String[] args) {
		
		EMFactory emFactory = new EMFactory();		
		LocacoesDAO locacaoDAO = new LocacoesDAO(emFactory.getEntityManager());
		
		List<Locacao> locacoes = new ArrayList<>();
		
		LocalDate dataInicio = LocalDate.of(2017, 9, 14);
		LocalDate dataFim = LocalDate.of(2017, 12, 14);
		LocalDate dataNasc = LocalDate.of(1996, 9, 27);
		
		ImoveisDAO imoveisDAO = new ImoveisDAO(emFactory.getEntityManager());
		Imoveis imovel = imoveisDAO.getDados(Long.valueOf(1));
		
		ClientesDAO clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		Clientes cliente = clientesDAO.getDados(Long.valueOf(1));
		
		Locacao locacao = new Locacao(
					imovel, 
					cliente, 
					200.1, 
					50.31, 
					14,
					dataInicio, 
					dataFim, 
					true, 
					"Nenhuma");
		locacaoDAO.Salvar(locacao);
				
		System.out.println("Listando todos as locaçoes agupadas por cliente");
		locacoes  = locacaoDAO.getDados();
		
		for (Locacao loc : locacoes) {
			System.out.println(loc);
		}
	}
}
