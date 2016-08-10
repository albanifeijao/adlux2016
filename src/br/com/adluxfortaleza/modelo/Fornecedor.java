package br.com.adluxfortaleza.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String contato;
	private String fone;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataInicioParceria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Calendar getDataInicioParceria() {
		return dataInicioParceria;
	}

	public void setDataInicioParceria(Calendar dataInicioParceria) {
		this.dataInicioParceria = dataInicioParceria;
	}
	
	
}
