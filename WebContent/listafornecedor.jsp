<%@ include file="/includes.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Fornecedores</title>
</head>
<body>	
	<p>Lista de Fornecedores</p>
	<p></p>
	<table border="1">
		<tr>
			<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
			<td>Nome</td>
			<td>Contato</td>
			<td>Fone</td>
			<td>Início Parceria</td>
			<td></td>
			<td></td>
		</tr>
		
		<c:forEach var="fornecedor" items="${lista}" varStatus="id"> 
			<tr bgcolor="#${id.count % 2 == 0 ? 'FFDAB9' : 'ffffff'}"> 	
				<td>${id.count}
				<td>${fornecedor.nome}</td>
				<td>${fornecedor.contato}</td>
				<td>${fornecedor.fone}</td>
								
				<td><fmt:formatDate value="${fornecedor.dataInicioParceria.time}" pattern="dd/MM/yyyy"/> </td>	
				
				<td><a href="editafornecedor.jsp=${fornecedor.id}">Alterar</a> </td>
				
				<td><a href="sistema?logica=DeletaFornecedor&id=${fornecedor.id}">Excluir</a> </td>
				
			</tr>		
		</c:forEach>	
	</table>
</body>
</html>


	  