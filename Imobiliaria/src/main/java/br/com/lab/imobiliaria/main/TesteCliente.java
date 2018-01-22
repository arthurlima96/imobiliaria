package br.com.lab.imobiliaria.main;

import java.time.LocalDate;

import br.com.lab.imobiliaria.dao.ClientesDAO;
import br.com.lab.imobiliaria.infra.EMFactory;
import br.com.lab.imobiliaria.model.Clientes;

public class TesteCliente {
	
	public static void main(String[] args) {
		EMFactory emFactory = new EMFactory();
		ClientesDAO clientesDAO;
		
		Clientes cliente1 = new Clientes("Arthur", "60939846306", "32363963", "983064375", "arthurcantanhede@hotmail.com", LocalDate.of(1996,9,27));
		Clientes cliente2 = new Clientes("Arthur2", "60939846307", "32363963", "983064375", "arthurcantanhed2e@hotmail.com", LocalDate.of(1996,9,27));
		
		clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		clientesDAO.Salvar(cliente1);
		
		clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		clientesDAO.Salvar(cliente2);
		
		clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		Clientes cliBD = clientesDAO.getDados(cliente2);
		
		clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		cliBD.setnome("Arhur Lima");
		clientesDAO.Update(cliBD);
		
		clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		clientesDAO.getDados();
		
		clientesDAO = new ClientesDAO(emFactory.getEntityManager());
		Clientes cliBD2 = clientesDAO.getDados(cliente1);
		clientesDAO.Delete(cliBD2);
				
		emFactory.close();
	}
}
