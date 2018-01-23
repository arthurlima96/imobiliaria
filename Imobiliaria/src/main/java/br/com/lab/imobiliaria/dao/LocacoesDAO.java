package br.com.lab.imobiliaria.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.lab.imobiliaria.model.Locacao;

public class LocacoesDAO implements DAO{
	
	private EntityManager em;
	
	public LocacoesDAO(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void Salvar(Object object) {
		Locacao locacao = (Locacao) object;
		
		try {
			em.getTransaction().begin();
			em.persist(locacao);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Update(Object object) {
		Locacao locacao = (Locacao) object;
		
		try {
			em.getTransaction().begin();
			em.merge(locacao);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void Delete(Object object) {
		Locacao locacao = (Locacao) object;
		
		try {
			em.getTransaction().begin();
			em.remove(locacao);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Locacao> getDados() {
		List<Locacao> locacoes = new ArrayList<>();
		
		try {
			locacoes  = em.createQuery("FROM Locacao l GROUP BY l.id_cliente ", Locacao.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return locacoes;
	}
	
	public Locacao getDados(Long id) {
		Locacao locacao = null;
		
		try {
			locacao  = em.createQuery("FROM Locacao l WHERE l.id_imovel = :id ", Locacao.class)
					.setParameter("id", id).setMaxResults(1).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return locacao;
	}

}
