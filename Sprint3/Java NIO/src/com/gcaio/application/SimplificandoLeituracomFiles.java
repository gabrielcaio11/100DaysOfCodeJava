package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimplificandoLeituracomFiles {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\temp\\docs\\LoremIpsum.txt");
		/*
		 * try(BufferedReader reader = Files.newBufferedReader(path)){
		 * reader.lines().forEach(System.out::println); }
		 */

		/*try (Stream<String> stream = Files.lines(path)) {
			stream.forEach(System.out::println);
		}*/

		/*List<String> stream = Files.readAllLines(path);
		stream.forEach(System.out::println);*/
		
		/*String conteudo = Files.readString(path);
		System.out.println(conteudo);*/
		
		byte[] conteudo = Files.readAllBytes(path);
		System.out.println(Arrays.toString(conteudo));
	}

}
