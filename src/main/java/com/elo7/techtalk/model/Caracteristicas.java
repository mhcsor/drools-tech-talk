package com.elo7.techtalk.model;

public class Caracteristicas {

	private Cor cor;
	
	private Sabor sabor;
	
	private Tamanho tamanho;
	
	private Forma forma;
	
	public enum Cor {
		VERDE,
		VERMELHA,
		AMARELA
	}
	
	public enum Sabor {
		CITRICO,
		DOCE
	}
	
	public enum Tamanho {
		PEQUENO,
		MEDIO,
		GRANDE
	}
	
	public enum Forma {
		ARREDONDADA,
		ALONGADA
	}

	public Caracteristicas(Cor cor, Sabor sabor, Tamanho tamanho, Forma forma) {
		super();
		this.cor = cor;
		this.sabor = sabor;
		this.tamanho = tamanho;
		this.forma = forma;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((forma == null) ? 0 : forma.hashCode());
		result = prime * result + ((sabor == null) ? 0 : sabor.hashCode());
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caracteristicas other = (Caracteristicas) obj;
		if (cor != other.cor)
			return false;
		if (forma != other.forma)
			return false;
		if (sabor != other.sabor)
			return false;
		if (tamanho != other.tamanho)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Caracteristicas [cor=" + cor + ", sabor=" + sabor + ", tamanho=" + tamanho + ", forma=" + forma + "]";
	}


	/**
	 * @return the cor
	 */
	public Cor getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(Cor cor) {
		this.cor = cor;
	}

	/**
	 * @return the sabor
	 */
	public Sabor getSabor() {
		return sabor;
	}

	/**
	 * @param sabor the sabor to set
	 */
	public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}

	/**
	 * @return the tamanho
	 */
	public Tamanho getTamanho() {
		return tamanho;
	}

	/**
	 * @param tamanho the tamanho to set
	 */
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 * @return the forma
	 */
	public Forma getForma() {
		return forma;
	}

	/**
	 * @param forma the forma to set
	 */
	public void setForma(Forma forma) {
		this.forma = forma;
	}
	
	
}
