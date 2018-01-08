package br.com.lab.imobiliaria.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMFactory {
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("imobiliariaPU");
	
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
	
	public void close(){
		emf.close();
	}
}
