package br.com.db1.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraController {

	private Double valor1;
	private Double valor2;
	private Double resultado;
	private Double resultado1;
	private Double resultado2;
	private Double resultado3;

	public Double getResultado1() {
		return resultado1;
	}

	public void setResultado1(Double resultado1) {
		this.resultado1 = resultado1;
	}

	public Double getResultado2() {
		return resultado2;
	}

	public void setResultado2(Double resultado2) {
		this.resultado2 = resultado2;
	}

	public Double getResultado3() {
		return resultado3;
	}

	public void setResultado3(Double resultado3) {
		this.resultado3 = resultado3;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public void soma() {
		resultado = valor1 + valor2;
	}

	public void subtrair() {
		resultado1 = valor1 - valor2;
	}

	public void multiplicar() {
		resultado2 = valor1 * valor2;
	}

	public void dividir() {
		resultado3 = valor1 / valor2;
	}

}
