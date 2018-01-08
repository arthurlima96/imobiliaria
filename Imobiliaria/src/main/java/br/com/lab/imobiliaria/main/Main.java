package br.com.lab.imobiliaria.main;

import javax.persistence.EntityManager;

import br.com.lab.imobiliaria.infra.EMFactory;

public class Main {
	
	public static void main(String[] args) {
		EMFactory emFactory = new EMFactory();
		
		EntityManager manager = emFactory.getEntityManager();
		
		manager.close();
		
		emFactory.close();
	}
}
