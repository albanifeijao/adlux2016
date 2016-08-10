<%@ include file="/includes.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
      	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	  	<meta name="viewport" content="width=device-width, initial-scale=1">
  
      	<title>Adicionar Fornecedor</title>
  
      	<!-- Bootstrap CSS -->
      	<link href="css/bootstrap.min.css" rel="stylesheet">
      	<link href="css/style.css" rel="stylesheet">
	</head>
	
	<body>	
  		<nav class="navbar navbar-inverse navbar-fixed-top">
   			<div class="container-fluid">
    			<div class="navbar-header">
     				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
      					<span class="sr-only">Toggle navigation</span>
      					<span class="icon-bar"></span>
      					<span class="icon-bar"></span>
      					<span class="icon-bar"></span>
     				</button>
     				<a class="navbar-brand" href="#">Adlux Fortaleza</a>
    			</div>
    		
    			<div id="navbar" class="navbar-collapse collapse">
     			<ul class="nav navbar-nav navbar-right">
      				<li><a href="menuSistema.jsp">Início</a></li>
     			</ul>
    			</div>
   			</div>
  		</nav>
	
		<hr />
	  	<div id="main" class="container-fluid">
    		<h3 class="page-header">Adicionar novo Fornecedor</h3>
			
			<form action="sistema" method="post">
				<input type="hidden" name="logica" value="AdicionaFornecedor"/>

				<div class="row">
					<div class="form-group col-md-4">
   						<label for="campo1">Nome</label>
   						<input type="text" class="form-control" id="campo1" name="nome"/>
 					</div>
					<div class="form-group col-md-4">
   						<label for="campo1">Contato</label>
   						<input type="text" class="form-control" id="campo2" name="contato"/>
 					</div>
					<div class="form-group col-md-4">
   						<label for="campo1">Fone</label>
   						<input type="text" class="form-control" id="campo3" name="fone"/>
 					</div>
					<div class="form-group col-md-4">
   						<label for="campo1">Data Início Parceria</label>
   						<input type="text" class="form-control" id="campo4" name="dataInicioParceria"/>
 					</div> 					
 				</div>
					
				<hr />
  				<div id="actions" class="row">
	    			<div class="col-md-12">
    	  				<button type="submit" class="btn btn-primary">Salvar</button>
      					<a href="menuSistema.jsp" class="btn btn-default">Voltar</a>
    				</div>
  				</div>
			</form>  		
  		</div>				
	</body>
</html>