package br.com.bguabiraba.set;

import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		Set<String> cargos = new HashSet<>();
		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secreataria");
		cargos.add("Funcionario");
		cargos.add("Diretor");
		cargos.add("Sniper");
		cargos.add("Jiu-Jiteiro");
		cargos.add("Metalhead");
		cargos.add("Hitman");
		cargos.add("Gerente");
		System.out.println(cargos);
	}
}
