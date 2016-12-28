package br.com.bguabiraba.listas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lista {

	public static void main(String[] args) {
		List lista = new ArrayList();
		
		lista.add("manel");
		lista.add("Menelitro");
		lista.add("Ze cupin");
		
		System.out.println("Quantidade de elementos da lista.: "+lista.size());
		
		System.out.println("-------------------------------------------------");
		System.out.println("\n");
		Collections.sort(lista);
		System.out.println("lista ordenada");
		System.out.println(lista);
	}
	
	
}
