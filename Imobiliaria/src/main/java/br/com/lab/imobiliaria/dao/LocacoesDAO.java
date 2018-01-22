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
		}finally {
			if (em!=null) {
				em.close();
			}
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
		}finally {
			if (em!=null) {
				em.close();
			}
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
		}finally {
			if (em!=null) {
				em.close();
			}
		}
	}

	@Override
	public List<?> getDados() {
		List<Locacao> locacoes = new ArrayList<>();
		
		try {
			locacoes  = em.createQuery("FROM Locacao l GROUP BY l.id_cliente ", Locacao.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(em != null)
				em.close();	
		}
		return locacoes;
	}

}
