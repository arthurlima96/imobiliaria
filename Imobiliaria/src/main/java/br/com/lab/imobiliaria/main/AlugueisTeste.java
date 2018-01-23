package br.com.lab.imobiliaria.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.lab.imobiliaria.dao.AlugueisDAO;
import br.com.lab.imobiliaria.dao.LocacoesDAO;
import br.com.lab.imobiliaria.infra.EMFactory;
import br.com.lab.imobiliaria.model.Alugueis;
import br.com.lab.imobiliaria.model.Locacao;

public class AlugueisTeste {

	public static void main(String[] args) {
		EMFactory emFactory = new EMFactory();
		
		AlugueisDAO alugueisDAO = new AlugueisDAO(emFactory.getEntityManager());
		
		List<Alugueis> alugueis = new ArrayList<>();
		
		LocalDate dataVencimento = LocalDate.of(2017, 9, 14);
		LocalDate dataPagamento = LocalDate.of(2017, 9, 10);
		
		LocacoesDAO locacoesDAO = new LocacoesDAO(emFactory.getEntityManager());
		Locacao locacao = locacoesDAO.getDados(Long.valueOf(1));
		
		Alugueis aluguel = new Alugueis(locacao, dataVencimento, 200.0, dataPagamento, "Nenhuma");		
		
		alugueisDAO.Salvar(aluguel);	
		
		System.out.println("Listando todos as alugueis do cliente");
		alugueis = alugueisDAO.getDados();
		
		for (Alugueis alg : alugueis) {
			System.out.println(alg);
		}
	}
}
