package br.com.lab.imobiliaria.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.lab.imobiliaria.model.Clientes;

public class ClientesDAO implements DAO {
	
	EntityManager em;
	
	public ClientesDAO(EntityManager em) {
	 this.em = em;
	}
	
	@Override
	public void Salvar(Object object) {
		Clientes cliente = (Clientes) object;
		
		try {
			em.getTransaction().begin();
			em.persist(cliente);
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
		Clientes cliente = (Clientes) object;		
		try {
			em.getTransaction().begin();
			em.merge(cliente);
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
		Clientes cliente = (Clientes) object;		
		try {
			em.getTransaction().begin();
			em.remove(cliente);
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
	public List<Clientes> getItens() {
		
		List<Clientes> clientes = new ArrayList<>();
		
		try {
			clientes  = em.createQuery("FROM Clientes", Clientes.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(em != null)
				em.close();	
		}
		return clientes;
	}

}
