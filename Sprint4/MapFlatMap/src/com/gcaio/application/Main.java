package com.gcaio.application;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<String> words = Stream.of("lorem", "ipsum", "dolor", "sit", "amet");

		Stream<Character> characters = words.flatMap(word -> word.chars().mapToObj(c -> (char) c));

		characters.forEach(System.out::print);
	}

}
