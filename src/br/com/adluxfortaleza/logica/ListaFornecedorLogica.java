package br.com.adluxfortaleza.logica;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.adluxfortaleza.dao.FornecedorDAO;
import br.com.adluxfortaleza.modelo.Fornecedor;


public class ListaFornecedorLogica implements Logica{
	
	public void executa(HttpServletRequest request, HttpServletResponse response)
						throws Exception{
		
		Connection connection = (Connection) request.getAttribute("conexao");
		
		FornecedorDAO dao = new FornecedorDAO(connection);
		List<Fornecedor> lista = dao.getLista();
		

		RequestDispatcher rd = request.getRequestDispatcher("/listafornecedor.jsp");
		request.setAttribute("lista", lista);
		rd.forward(request, response);
		
	}
}
