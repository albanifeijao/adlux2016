package br.com.adluxfortaleza.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.adluxfortaleza.logica.Logica;


@WebServlet("/sistema")
public class ServletSistema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("logica");
		
		try {
			String nomeClasse = "br.com.adluxfortaleza.logica." + acao + "Logica";
			Class classe = Class.forName(nomeClasse);
			Object obj = classe.newInstance();
			Logica logica = (Logica) obj;
			logica.executa(request, response);
			
		} catch (ClassNotFoundException e) {
			throw new AdluxServletException(e.getMessage());
		} catch (InstantiationException | IllegalAccessException e) {
			throw new AdluxServletException(e.getMessage());
		} catch (Exception e) {
			throw new AdluxServletException(e.getMessage());
		}			
	}
}
