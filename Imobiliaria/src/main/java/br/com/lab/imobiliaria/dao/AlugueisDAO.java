package br.com.lab.imobiliaria.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.lab.imobiliaria.model.Alugueis;
import br.com.lab.imobiliaria.model.Clientes;

public class AlugueisDAO implements DAO{
	
	private EntityManager em;
	
	public AlugueisDAO(EntityManager em) {
		this.em = em;
	}

	@Override
	public void Salvar(Object object) {
		Alugueis aluguel = (Alugueis) object;
		
		try {
			em.getTransaction().begin();
			em.persist(aluguel);
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
		Alugueis aluguel = (Alugueis) object;
		
		try {
			em.getTransaction().begin();
			em.merge(aluguel);
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
		Alugueis aluguel = (Alugueis) object;
		
		try {
			em.getTransaction().begin();
			em.remove(aluguel);
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
	public List<Alugueis> getDados() {
		List<Alugueis> alugueis = new ArrayList<>();
		
		try {
			alugueis  = em.createQuery("FROM Alugueis ", Alugueis.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(em != null)
				em.close();	
		}
		return alugueis;
	}
	
	public List<?> getDadosPor(Clientes cliente) {
		List<Alugueis> alugueis = new ArrayList<>();
		
		try {
			alugueis  = em.createQuery("FROM Alugueis a WHERE a.id_locacao.id_cliente = :cli ", Alugueis.class)
					.setParameter("cli", cliente)
					.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(em != null)
				em.close();	
		}
		return alugueis;
	}
	
	

}
