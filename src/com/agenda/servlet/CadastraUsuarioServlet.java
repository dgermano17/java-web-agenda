package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Individuo;

public class CadastraUsuarioServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		Individuo individuo = new Individuo();
		
		individuo.setNome(request.getParameter("name"));
		individuo.setNome(request.getParameter("telefone"));
		individuo.setNome(request.getParameter("email"));
		individuo.setNome(request.getParameter("endereco"));
		
		
	}
}
