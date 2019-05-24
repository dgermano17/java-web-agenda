package com.agenda.service;

import java.util.List;

import com.agenda.dao.IndividuoDAO;
import com.agenda.model.Individuo;


public class CadastroUsuarioService {
	
	private IndividuoDAO dao;
	public void cadastra (Individuo individuo) {
		
		IndividuoDAO receberDados = new IndividuoDAO();
		
		receberDados.registra(individuo);
		
	}
	
	public List<Individuo> buscaIndividuos() {
		
		IndividuoDAO dao = new IndividuoDAO();
		
		return dao.buscaIndividuos();
		
	}

	public void removeContato(Individuo individuo) {
		IndividuoDAO dao = new IndividuoDAO();
		dao.removerContato(individuo);
		
	}
	
	public void altera(Individuo individuo) {
		dao.editar(individuo);
	}
}

