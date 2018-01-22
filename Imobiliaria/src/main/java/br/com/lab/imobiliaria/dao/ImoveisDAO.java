package br.com.lab.imobiliaria.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.lab.imobiliaria.model.Imoveis;

public class ImoveisDAO implements DAO {
	
	private EntityManager em;
	
	public ImoveisDAO(EntityManager em) {
	 this.em = em;
	}
	
	@Override
	public void Salvar(Object object) {
		Imoveis imovel = (Imoveis) object;
		
		try {
			em.getTransaction().begin();
			em.persist(imovel);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void Update(Object object) {
		Imoveis imovel = (Imoveis) object;
		
		try {
			em.getTransaction().begin();
			em.merge(imovel);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(Object object) {
		Imoveis imovel = (Imoveis) object;
		
		try {
			em.getTransaction().begin();
			em.remove(imovel);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Imoveis> getDados() {
		List<Imoveis> imoveis = new ArrayList<>();
		
		try {
			imoveis  = em.createQuery("FROM Imoveis", Imoveis.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imoveis;
	}
	
	public Imoveis getDados(Long id) {		
		
		try {
			return em.find(Imoveis.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
