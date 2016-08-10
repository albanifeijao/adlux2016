<%@ include file="/includes.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
    		<h3 class="page-header">Menu Inicial</h3>
		</div>
		
	<p>
		<ol>
			<a href='<c:url value="/adicionafornecedor.jsp" />'>
				Adicionar Fornecedor
			</a>
		</ol>
		<ol>
			<a href='<c:url value="/sistema?logica=ListaFornecedor" />'>
				Listar Fornecedor
			</a>
		</ol>
	</p>
</body>
</html>