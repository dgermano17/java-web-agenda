package com.agenda.service;

import com.agenda.dao.IndividuoDAO;
import com.agenda.model.Individuo;


public class CadastroUsuarioService {
	
	public void cadastra (Individuo individuo) {
		
		IndividuoDAO receberDados = new IndividuoDAO();
		
		receberDados.registra(individuo);
	}
}
