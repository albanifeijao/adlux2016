package br.com.adluxfortaleza.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.adluxfortaleza.dao.ConnectionFactory;
import br.com.adluxfortaleza.dao.FornecedorDAO;
import br.com.adluxfortaleza.modelo.Fornecedor;

public class FornecedorTeste {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("Criando conexão");
		Connection connection = new ConnectionFactory().getConnection();
		
		System.out.println("Criando Fornecedor");
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Fornecedor Teste");
		fornecedor.setContato("Contato Fornecedor");
		fornecedor.setFone("32272561");
		fornecedor.setDataInicioParceria(Calendar.getInstance());
		
		System.out.println("Criando FornecedorDAO");
		FornecedorDAO fornecedorDAO = new FornecedorDAO(connection);
		fornecedorDAO.adiciona(fornecedor);
		System.out.println("Dados gravados DAO");
		
		System.out.println("Carregando lista DAO");
		List<Fornecedor> lista = fornecedorDAO.getLista();
		System.out.println("Lista carregada DAO");
		connection.close();
	}

}
