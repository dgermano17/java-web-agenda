package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Individuo;
import com.agenda.service.CadastroUsuarioService;

public class CadastraUsuarioServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		Individuo individuo = new Individuo();
		
		individuo.setNome(request.getParameter("nome"));
		individuo.setFone(request.getParameter("telefone"));
		individuo.setEmail(request.getParameter("email"));
		individuo.setEnd(request.getParameter("endereco"));
		
		CadastroUsuarioService service = new CadastroUsuarioService();

		if(null != request.getParameter("id") && !request.getParameter("id").equals("")) {
			individuo.setId(Long.parseLong(request.getParameter("id")));
		}
		service.redirecionar(individuo);
		response.sendRedirect("busca-individuos");
		
	}
}
