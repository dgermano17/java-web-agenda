<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Meus Contatos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link 
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	rel="stylesheet">
<link 
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #42cef4">
	  <a class="navbar-brand" href="#" style="font-weight: bold; font-size: 2em; color: white"><i class="fas fa-address-book"></i></a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
	    <div class="navbar-nav">
	    	<a class="nav-item nav-link" href="index.html">Home</a>
	    	<a class="nav-item nav-link" href="adiciona-contato.jsp">Novo Cadastro</a>
	    	<a class="nav-item nav-link active" href="#">Meus Contatos</a>
	    </div>
	  </div>
	</nav>	
	<br>
	<div class="container">
		<div class="card">
			<div class="card-body">
				<h1>Meus Contatos</h1>
				<table class="table">
				  <thead>
				    <tr>
				      <th scope="col">Nome</th>
				      <th scope="col">Telefone</th>
				      <th scope="col">E-mail</th>
				      <th scope="col">Endereço</th>
				      <th scope="col">Id</th>
				      <th scope="col">Opções</th>
				    </tr>
				  </thead>
				  <tbody> 
					  <c:forEach var="individuos" items="${individuos}">
					  	<tr>
					  		<td>${individuos.id}</td>
					  		<td>${individuos.nome}</td>
					  		<td>${individuos.fone}</td>
					  		<td>${individuos.email}</td>
					  		<td>${individuos.end}</td>
					  		<td><a data-toggle="modal" data-target="#exampleModal" class="btn btn-danger" style="padding: 0.2em 0.5em; border: none; width: 4em" href="#" onclick="passarId(${individuos.id})">Deletar</a>
					  			<a class="btn btn-info" style="padding: 0.2em 0.5em; border: none; width: 4em" href="adiciona-contato.jsp?id=${individuos.id}&nome=${individuos.nome}&fone=${individuos.fone}&email=${individuos.email}&endereco=${individuos.end}">Editar</a></td>
					  	</tr>
					  </c:forEach>
				  </tbody>
				</table>				
			</div>
		</div>
	</div>

	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<a type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</a>
					<a type="button" href="#" class="btn btn-primary" onclick="confirmDelete()">Deletar</a>
				</div>
			</div>
		</div>
	</div>

	<script src="js/jquery.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <script src="js/inputMask.js"></script>
    <script>
    	var trasnporteId;
    	function passarId(caseId){
    		trasnporteId = caseId;
    	}
    	
    	function confirmDelete(){
    		window.location.href = "remove-contato?id=" + trasnporteId;
    	}
    </script>
</body>
</html>