package br.com.stefanini.maratonadev.service;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.stefanini.maratonadev.dao.TodoDao;

public class TodoService {
	
	//COMO SER FOSSE A INTERFACE NO SPRING REST
	@Inject TodoDao dao;
	
	private void validar() {
		//VALIDA REGRA DE NEGOCIO
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void inserir() {
		//VALIDAÇÃO
		validar();
		
		//CHAMADA DA DAO
		
	}
	
	public void listar() {
		
		//CHAMADA DA DAO
		
	}
	
}
