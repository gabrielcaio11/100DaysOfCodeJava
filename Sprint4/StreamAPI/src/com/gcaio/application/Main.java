package com.gcaio.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		String[] nomes = { "Alice", "Bruno", "Carla", "Daniel", "Eva", "Fernando", "Gabriela", "Henrique", "Isabela",
				"João", "Gabriel", "Caio" };

		// pegar os nomes que tem a letra 'a' , tamanho maior que três e escrever de
		// forma reversa

		List<String> resultado = Arrays.stream(nomes) // Cria uma Stream a partir do array
				.filter(nome -> nome.contains("a") || nome.contains("A")) // Filtra nomes que contêm a letra 'a'
				.filter(nome -> nome.length() > 3) // Filtra nomes com tamanho maior que 3
				.map(nome -> new StringBuilder(nome).reverse().toString()) // Reverte cada nome
				.collect(Collectors.toList()); // Coleta os resultados em uma lista

		resultado.forEach(System.out::println);

	}

}
