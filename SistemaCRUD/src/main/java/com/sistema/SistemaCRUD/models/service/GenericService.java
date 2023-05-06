package com.sistema.SistemaCRUD.models.service;

import java.util.List;

public interface GenericService<T, ID> {

	public List<T> lista();
	
	public T incluir(T entity );
	
	public T alterar(ID id, T entity);
	
	public void excluir(ID id);
}
