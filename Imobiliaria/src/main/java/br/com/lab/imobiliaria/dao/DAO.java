package br.com.lab.imobiliaria.dao;

import java.util.List;

public interface DAO{
		
	public void Salvar(Object object);
	public void Update(Object object);
	public void Delete(Object object);
	public List<?> getItens();
	
}