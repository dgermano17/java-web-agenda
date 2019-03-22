package com.agenda.dao;

import com.agenda.model.Individuo;

public class IndividuoDAO {
	
	public void registra(Individuo individuo) {
		
		System.out.println(individuo.getNome());
		System.out.println(individuo.getFone());
		System.out.println(individuo.getEmail());
		System.out.println(individuo.getEnd());
		
	}
}
