package com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.agenda.model.Individuo;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;

public class IndividuoDAO {
	private Connection connection;

	public void registra(Individuo individuo) {

		String SQL = "insert into contatos (nome, telefone, email, endereco) values (?,?,?,?)";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			stmt.setString(1, individuo.getNome());
			stmt.setString(2, individuo.getFone());
			stmt.setString(3, individuo.getEmail());
			stmt.setString(4, individuo.getEnd());

			stmt.execute();
			stmt.close();
			
			buscaIndividuos();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Individuo> buscaIndividuos(){
		String  SQL = "select * from contatos";
		
		try {
			
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);
			
			List<Individuo> individuos = new ArrayList<Individuo>();
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Individuo individuo = new Individuo();
				
				individuo.setNome(rs.getString("nome"));
				individuo.setFone(rs.getString("telefone"));
				individuo.setEmail(rs.getString("email"));
				individuo.setEnd(rs.getString("endereco"));
				individuos.add(individuo);
				
			}
			
			stmt.close();
			this.connection.close();
			
			System.out.println(individuos);
			return individuos;
			
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
			
	
}
