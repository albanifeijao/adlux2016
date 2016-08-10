package br.com.adluxfortaleza.logica;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.adluxfortaleza.servlet.AdluxServletException;

public interface Logica {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws AdluxServletException, ServletException, IOException, Exception;
}
