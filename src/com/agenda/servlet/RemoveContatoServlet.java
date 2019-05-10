package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Individuo;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/remove-contato")
public class RemoveContatoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CadastroUsuarioService service = new CadastroUsuarioService();
		
		long id = Long.parseLong(request.getParameter("id"));
		
		Individuo individuo = new Individuo();
		individuo.setId(id);

		service.removeContato(individuo);
		
		response.sendRedirect("busca-individuos");
	}

}
