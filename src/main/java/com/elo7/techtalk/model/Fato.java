package com.elo7.techtalk.model;

import org.kie.api.definition.type.Position;

public class Fato {

	@Position(0)
	private String elemento;
	
	@Position(1)
	private String lugar;

	public Fato(String elemento, String lugar) {
		this.elemento = elemento;
		this.lugar = lugar;
	}
	
	/**
	 * @return the elemento
	 */
	public String getElemento() {
		return elemento;
	}

	/**
	 * @param elemento the elemento to set
	 */
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	
	
}
