package br.com.adluxfortaleza.filtro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.adluxfortaleza.dao.ConnectionFactory;
import br.com.adluxfortaleza.servlet.AdluxServletException;

/**
 * Servlet Filter implementation class FiltroConexao
 */
@WebFilter(filterName="FiltroConexao",urlPatterns="/sistema")
public class FiltroConexao implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroConexao() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			Connection conexao = new ConnectionFactory().getConnection();
			request.setAttribute("conexao", conexao);
			chain.doFilter(request, response);
			conexao.close();
		} catch (SQLException | ClassNotFoundException e) {
			throw new AdluxServletException("Erro ao tentar fechar a conexão com o banco");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
