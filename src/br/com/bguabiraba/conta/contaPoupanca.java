package br.com.bguabiraba.conta;

public class contaPoupanca extends conta implements Comparable<contaPoupanca> {

	public int compareTo(contaPoupanca o){
		if (this.getNumero() < o.getNumero()) {
			return -1;
		}
		if (this.getNumero() > o.getNumero()) {
			return 1;
		}
		return 0;
	}
	
}
