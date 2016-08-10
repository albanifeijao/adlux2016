package br.com.adluxfortaleza.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.adluxfortaleza.modelo.Fornecedor;

public class FornecedorDAO {

	private Connection conexao;
	
	public FornecedorDAO(Connection conexao){
		this.conexao = conexao;
	}
	
	public FornecedorDAO(){
		
	}	
	
	
	public void adiciona(Fornecedor fornecedor){
		String sql = "insert into fornecedor (nome, contato, fone, dataInicioParceria) " +
				     " values (?,?,?,?)";
		
		try {
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, fornecedor.getNome());
			pstmt.setString(2, fornecedor.getContato());
			pstmt.setString(3, fornecedor.getFone());
			pstmt.setDate(4, new Date(fornecedor.getDataInicioParceria().getTimeInMillis()));
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Fornecedor fornecedor){
		String sql = "update fornecedor set nome=?, contato=?, fone=?, dataInicioParceria=? where id=?";
		
		try {
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.setString(1, fornecedor.getNome());
			pstmt.setString(2, fornecedor.getContato());
			pstmt.setString(3, fornecedor.getFone());
			pstmt.setDate(4, new Date(fornecedor.getDataInicioParceria().getTimeInMillis()));
			pstmt.setLong(5, fornecedor.getId());
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}	
	
	public void deleta(Fornecedor fornecedor){
		String sql = "delete from fornecedor where id=?";
		
		try {
			PreparedStatement pstmt = conexao.prepareStatement(sql);

			pstmt.setLong(1, fornecedor.getId());
			
			pstmt.execute();
			pstmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}		

	public List<Fornecedor> getLista(){
		
		try {
			PreparedStatement pstmt = conexao.prepareStatement("select * from fornecedor");

			List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
			Fornecedor fornecedor = null;
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				String contato = rs.getString("contato");
				String nome = rs.getString("nome");
				String fone = rs.getString("fone");
				Long id = rs.getLong("id");
				
				Calendar dataInicioParceria = Calendar.getInstance();
				if(rs.getDate("dataInicioParceria") != null){ 
					dataInicioParceria.setTime(rs.getDate("dataInicioParceria"));
				}
				
				fornecedor = new Fornecedor();
				fornecedor.setContato(contato);
				fornecedor.setNome(nome);
				fornecedor.setFone(fone);
				fornecedor.setDataInicioParceria(dataInicioParceria);
				fornecedor.setId(id);
				
				listaFornecedor.add(fornecedor);			
			}
			
			pstmt.execute();
			pstmt.close();
			
			return listaFornecedor;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
	
	public Fornecedor getFornecedor(Long id){
		String sql = "select * from fornecedor where id=?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			
			Fornecedor fornecedor = null;
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()){
				Long idFornecedor = rs.getLong("id");
				String nome = rs.getString("nome");
				String contato = rs.getString("contato");
				String fone = rs.getString("fone");
				Calendar dataInicioParceria = Calendar.getInstance();
				dataInicioParceria.setTime(rs.getDate("dataInicioParceria"));
				
				fornecedor = new Fornecedor();
				fornecedor.setId(idFornecedor);
				fornecedor.setNome(nome);
				fornecedor.setContato(contato);
				fornecedor.setFone(fone);
				fornecedor.setDataInicioParceria(dataInicioParceria);
			}
			rs.close();
			stmt.close();
			return fornecedor;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
		
}
