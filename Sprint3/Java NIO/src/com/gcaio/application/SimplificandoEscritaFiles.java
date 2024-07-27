package com.gcaio.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class SimplificandoEscritaFiles {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\temp\\docs\\LoremIpsum.txt");

		Files.writeString(path, "qualquer coisa");
		
		List<String> lista = Arrays.asList("Opa!","Beleza?");
		
		Files.write(path, lista);

		
		byte[] bytes = { 79,108, -61, -95};
		
		Files.write(path, bytes);
		
		try (BufferedReader reader = Files.newBufferedReader(path)) {
			reader.lines().forEach(System.out::println);
		}
	}

}
