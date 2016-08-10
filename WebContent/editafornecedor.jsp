<%@ include file="/includes.jsp"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
      	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	  	<meta name="viewport" content="width=device-width, initial-scale=1">
  
      	<title>Alterar Fornecedor</title>
  
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
    		<h3 class="page-header">Alterar Fornecedor</h3>
			
			<form action="sistema" method="post">
				<input type="hidden" name="logica" value="AlteraFornecedor"/>



				<div class="row">
					<div class="col-md-4">
 						<p><strong>Nome</strong></p>
 						<p>{nome}</p>
					</div>  					
					<div class="col-md-4">
 						<p><strong>Contato</strong></p>
 						<p>{contato}</p>
					</div>  					
					<div class="col-md-4">
 						<p><strong>Fone</strong></p>
 						<p>{fone}</p>
					</div>  					
					<div class="col-md-4">
 						<p><strong>Data Início Parceria</strong></p>
 						<p>{dataInicioParceria}</p>
					</div>  					
 				</div>
					
				<hr />
  				<div id="actions" class="row">
	    			<div class="col-md-12">
    	  				<button type="submit" class="btn btn-primary">Alterar</button>
      					<a href="sistema?logica=ListaFornecedor" class="btn btn-default">Voltar</a>
    				</div>
  				</div>
			</form>  		
  		</div>				
	</body>
</html>