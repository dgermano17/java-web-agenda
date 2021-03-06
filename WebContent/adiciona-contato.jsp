<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Adicionar Contato</title>
<link crossorigin="anonymous"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	rel="stylesheet">
<link crossorigin="anonymous"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	rel="stylesheet">
<link crossorigin="anonymous"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
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
	    	<a class="nav-item nav-link active" href="#">Novo Cadastro</a>
	    	<a class="nav-item nav-link" href="busca-individuos">Meus Contatos</a>
	    </div>
	  </div>
	</nav>	
	<br>
	<div class="container">
		<div class="card">
			<div class="card-body">
				<h1>Dados Pessoais:</h1>
				<hr>
				<form action="cadastra-usuario" id="form-produto">
				
					<input type="hidden" name="id" value="${param.id}"></input>
					
					<div class="form-row">
						<div class="form-group col-md-12">
							<input type="text" class="form-control" id="name" name="nome" value="${param.nome}" placeholder="Nome" required="required">
						</div>
					</div>

					<div class="form-row">
						<div class="form-group col-md-3">
							<input type="text" class="form-control" id="tel" name="telefone" value="${param.fone}" placeholder="Telefone" data-mask="(99)9999-9999">
						</div>

						<div class="form-group col-md-3">
							<input type="email" class="form-control" id="email" value="${param.email}" name="email"placeholder="E-mail">
						</div>

						<div class="form-group col-md-6">
							<input type="text" class="form-control" id="end" value="${param.endereco}" name="endereco" placeholder="Endere�o">
						</div>

						<div class="form-group col-md-6">
							<button style="background-color: #42cef4" class="btn btn-primary btn-sm" id="btnSalvar" type="submit">Salvar</button>
						</div>

					</div>
				</form>
			</div>
		</div>
	</div>
	
	<script src="js/jquery.js" type="text/javascript"></script>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <script src="js/inputMask.js"></script>
</body>
</html>