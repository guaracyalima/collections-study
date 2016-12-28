package br.com.bguabiraba.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.bguabiraba.conta.conta;
import br.com.bguabiraba.conta.contaPoupanca;

public class testaOrdenacao {

	public static void main(String[] args) {
		List<contaPoupanca> contas = new LinkedList<>();
		
		contaPoupanca c1 = new contaPoupanca();
		c1.setNumero(834747);
		contas.add(c1);
		
		contaPoupanca c2 = new contaPoupanca();
		c2.setNumero(367565);
		contas.add(c2);
		
		contaPoupanca c3 = new contaPoupanca();
		c3.setNumero(888882);
		contas.add(c3);
		
		Collections.sort(contas);
		//Collections.reverse(contas);
		//Collections.min(contas);
		
		
		for (int i = 0; i < contas.size(); i++) {
			conta atual = contas.get(i);
			System.out.println("Numero.: "+atual.getNumero());
		}
	}
}
