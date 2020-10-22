package br.com.stefanini.maratonadev.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DiferencaEntreRequestApplicationScopeService {
	
	/**
	 * CODIGO COM EXEMPLO DE UTLIZACAO DO APPLICATONSCOPED E REQUESTSCOPED
	 */
	
	private List<String> listaNome = new ArrayList<String>();
	
	
	public void adicionar(String nome) {
		listaNome.add(nome);
		
	}
	
	public List<String> listar(){
		return listaNome;
	}

}
