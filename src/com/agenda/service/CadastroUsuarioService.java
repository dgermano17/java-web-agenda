package com.agenda.service;

import java.util.List;

import com.agenda.dao.IndividuoDAO;
import com.agenda.model.Individuo;

public class CadastroUsuarioService {
	
	private IndividuoDAO dao = new IndividuoDAO();
	
//	public void cadastra(Individuo individuo) {
//		this.dao.registra(individuo);
//	}
//	
//	public void altera(Individuo individuo) {
//		this.dao.editar(individuo);
//	}
	
	public void redirecionar(Individuo individuo) {
		if(0 != individuo.getId()) {
			this.dao.editar(individuo);
		}else {
			this.dao.registra(individuo);
		}
	}

	public List<Individuo> buscaIndividuos() {
		return dao.buscaIndividuos();
	}

	public void removeContato(Individuo individuo) {
		this.dao.removerContato(individuo);
	}

}
