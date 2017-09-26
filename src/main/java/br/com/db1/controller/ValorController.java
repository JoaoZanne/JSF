package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ValorController {

	public Integer valor;
	public String resultado;
	
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public void formatarValor() {
		
	}
}