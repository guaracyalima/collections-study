/*package br.com.bguabiraba.testes;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class testaAdicionaNoFinal {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList<>();
		
		LinkedList linkedlist = new LinkedList();
		
		long tempo = testaAdicionaNoFinal.adcionaNoFinal(arrayList);
		System.out.println("ArrayList: "+ tempo+ "ms");
		
		tempo = testaAdicionaNoFinal.adcionaNoFinal(linkedlist);
		System.out.println("LinkedList: "+tempo+"ms");
		
	}
	
	public static long adcionaNoFinal(LinkedList linkedlist){
		long inicio = System.currentTimeMillis();
		
		int size = 100000;
		
		for (int i = 0; i < size; i++){
			linkedlist.add(i);
		}
		long fim = System.currentTimeMillis();
		
		return fim - inicio;
		
		
	}
}
*/