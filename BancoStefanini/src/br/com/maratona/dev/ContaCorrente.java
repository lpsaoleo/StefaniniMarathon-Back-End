package br.com.maratona.dev;

public class ContaCorrente extends Conta {

	private Float limite;
	
	public void setLimite(Float limite) {
		this.limite = limite;
	}
	
	public Float getLimite() {
		return limite;
	}
}
