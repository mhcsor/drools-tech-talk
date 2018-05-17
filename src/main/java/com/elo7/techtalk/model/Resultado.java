package com.elo7.techtalk.model;

import java.util.ArrayList;
import java.util.List;

public class Resultado {

	private String valor;
	
    private List<String> fatos = new ArrayList<>();

	public void adicionarFato(String str) {
		this.fatos.add(str);
	}
    
	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the fatos
	 */
	public List<String> getFatos() {
		return fatos;
	}

	/**
	 * @param fatos the fatos to set
	 */
	public void setFatos(List<String> fatos) {
		this.fatos = fatos;
	}
    
    
	
}
