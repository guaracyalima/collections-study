package br.com.bguabiraba.conta;

public class conta {

	protected int numero;
	private double saldo;
	private double limite;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
}
