package br.com.estudos.java.basico;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sorteador {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		Random numeroSortiado = new Random();
		
		for(int i = 0; i < 6; i++) {
			
			numeros.add(numeroSortiado.nextInt(60));
			
		}
		System.out.println(numeros);
		
	}
	
}
