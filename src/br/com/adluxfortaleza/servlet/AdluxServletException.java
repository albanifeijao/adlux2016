package br.com.adluxfortaleza.servlet;

import javax.servlet.ServletException;

public class AdluxServletException extends ServletException{
	
	public AdluxServletException(String msg){
		super(msg);
	}
	
	public AdluxServletException() {
		super();
	}
}
