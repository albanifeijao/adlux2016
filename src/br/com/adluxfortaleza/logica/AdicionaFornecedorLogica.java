package br.com.adluxfortaleza.logica;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.adluxfortaleza.dao.FornecedorDAO;
import br.com.adluxfortaleza.modelo.Fornecedor;
import br.com.adluxfortaleza.servlet.AdluxServletException;

public class AdicionaFornecedorLogica implements Logica{
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		Connection connection = (Connection) request.getAttribute("conexao");
		
		String nome = request.getParameter("nome");
		String contato = request.getParameter("contato");
		String fone = request.getParameter("fone");
		String dataInicioParceria = request.getParameter("dataInicioParceria");
		Calendar dataInicioParceriaConvertida = null;
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataInicioParceria);
			dataInicioParceriaConvertida = Calendar.getInstance();
			dataInicioParceriaConvertida.setTime(data);
			
		} catch (ParseException e) {
			throw new AdluxServletException();
		}	
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome(nome);
		fornecedor.setContato(contato);
		fornecedor.setFone(fone);
		fornecedor.setDataInicioParceria(dataInicioParceriaConvertida);
		
		FornecedorDAO dao = new FornecedorDAO(connection);
		dao.adiciona(fornecedor);
		
		RequestDispatcher rd = request.getRequestDispatcher("/adicionafornecedor.jsp");
		rd.forward(request, response);
	}
}
