package com.gcaio.application;

import java.util.Arrays;
import java.util.List;

public class ComparacaoStreamParallelStream {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4,
				5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8,
				9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		
		// Capturando o tempo antes da operação
		long inicio = System.nanoTime();
		
		// Usando Streams sequenciais
		int somaSequencial = numeros.stream().reduce(0, Integer::sum);
		System.out.println("Soma sequencial: " + somaSequencial);
		
		// Capturando o tempo depois da operação
		long fim = System.nanoTime();
		
		long tempoSomaSequencial = fim-inicio;
		
		
		
		
		
		// Capturando o tempo antes da operação
		inicio = System.nanoTime();
		
		// Usando Parallel Streams
		int somaParalela = numeros.parallelStream().reduce(0, Integer::sum);
		System.out.println("Soma paralela: " + somaParalela);
		
		// Capturando o tempo depois da operação
		fim = System.nanoTime();
		long tempoSomaParalela = fim-inicio;
		
		
		System.out.println("\n\n");
		System.out.println("Tempo Soma sequencial: " + tempoSomaSequencial);
		System.out.println("Tempo Soma paralela: " + tempoSomaParalela);
		
	}

}
