package br.com.adluxfortaleza.logica;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.adluxfortaleza.dao.FornecedorDAO;
import br.com.adluxfortaleza.modelo.Fornecedor;


public class AlteraFornecedorLogica implements Logica{
	
	public void executa(HttpServletRequest request, HttpServletResponse response)
						throws Exception{
		
		Connection connection = (Connection) request.getAttribute("conexao");

		String code = request.getParameter("id");
		Long id = Long.parseLong(code);
			
		FornecedorDAO dao = new FornecedorDAO(connection);
		Fornecedor fornecedor = dao.getFornecedor(id);
				
		dao.altera(fornecedor);
		
		RequestDispatcher rd = request.getRequestDispatcher("/sistema?logica=ListaFornecedor");
		rd.forward(request, response);
		
	}
}
