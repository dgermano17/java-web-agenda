package com.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Individuo;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/busca-individuos")
public class ListaContatosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private CadastroUsuarioService service;
	
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		service = new CadastroUsuarioService();
		
		List<Individuo> individuos = service.buscaIndividuos();
		
		request.setAttribute("individuos", individuos);
		
		request.getRequestDispatcher("meus-contatos.jsp")
		.forward(request,response);
	}
}