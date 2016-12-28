package br.com.bguabiraba.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.bguabiraba.conta.conta;

public class testaContas {


	public static void main(String[] args) {
		
		conta c1 = new conta();
		c1.deposita(255555500);
		
		conta c2 = new conta();
		c2.deposita(233333300);
		
		conta c3 = new conta();
		c3.deposita(400);
		
		conta c4 = new conta();
		c4.deposita(3200);
		System.out.println(c4.getSaldo());
		
		
		conta c5 = new conta();
		c5.deposita(1200);
		
		List<conta> contas = new ArrayList<>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		
		//Collections.sort(contas);
	}
}
