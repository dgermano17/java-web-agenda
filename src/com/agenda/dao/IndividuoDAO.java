package com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.agenda.model.Individuo;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;

public class IndividuoDAO {
	private Connection connection;

	public void registra(Individuo individuo) {

		String SQL = "insert into individuos (nome, endereco, email, telefone) values (?,?,?,?)";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			stmt.setString(1, individuo.getNome());
			stmt.setString(2, individuo.getFone());
			stmt.setString(3, individuo.getEmail());
			stmt.setString(4, individuo.getEnd());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
