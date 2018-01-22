package br.com.lab.imobiliaria.main;

import java.util.ArrayList;
import java.util.List;

import br.com.lab.imobiliaria.dao.ImoveisDAO;
import br.com.lab.imobiliaria.infra.EMFactory;
import br.com.lab.imobiliaria.model.Imoveis;

public class ImoveisTeste {
	
	public static void main(String[] args) {
		
		EMFactory emFactory = new EMFactory();
		ImoveisDAO imoveisDAO = new ImoveisDAO(emFactory.getEntityManager());
		
		List<Imoveis> imoveis = new ArrayList<>();
		
		System.out.println("Inserindo um novo imovel");
		Imoveis imovel1 = new Imoveis("Apartamento", 
									"Rua 45", 
									"Vinhais",
									"65074440", 
									1600.20, 
									4, 
									3, 
									2, 
									2, 
									630.30, 
									"Nenhuma");
		
		Imoveis imovel2 = new Imoveis("Casa", 
				"Rua 45", 
				"Vinhais",
				"65074440", 
				1600.20, 
				4, 
				3, 
				2, 
				2, 
				630.30, 
				"Nenhuma");
		
		imoveisDAO.Salvar(imovel1);		
		imoveisDAO.Salvar(imovel2);
		
		System.out.println("Listando todos os imoveis");
		imoveis =  imoveisDAO.getDados();
		
		for (Imoveis imv : imoveis) {
			System.out.println(imv);
		}
		
		System.out.println("Atualizando imovel um novo imovel");
		Imoveis imovelNovo = imoveisDAO.getDados(Long.valueOf(2));
		imovelNovo.setBairro("Cohama");
		
		imoveisDAO.Update(imovelNovo);
		
		System.out.println("Listando todos os imoveis depois de atualizar");
		imoveis = imoveisDAO.getDados();
		
		for (Imoveis imv : imoveis) {
			System.out.println(imv);
		}
		
		imoveisDAO.Delete(imovelNovo);
		
	}
}
