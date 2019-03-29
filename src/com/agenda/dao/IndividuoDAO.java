package com.agenda.dao;

import com.agenda.model.Individuo;

public class IndividuoDAO {
	
	public void registra(Individuo individuo) {
		
		String SQL = "insert into individuo (nome, endereco, email, telefone) values (?,?,?,?)";
		
	}
}
