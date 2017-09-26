package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class LetrasController {
	private String palavra;
	private String resultado00;
	private String resultado01;

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}


	public void aumentarLetras() {
		resultado00 = palavra.toUpperCase();
	}
	public void diminuirLetras() {
		resultado01 =  palavra.toLowerCase();
	}

	public String getResultado00() {
		return resultado00;
	}

	public void setResultado00(String resultado00) {
		this.resultado00 = resultado00;
	}

	public String getResultado01() {
		return resultado01;
	}

	public void setResultado01(String resultado01) {
		this.resultado01 = resultado01;
	}
}