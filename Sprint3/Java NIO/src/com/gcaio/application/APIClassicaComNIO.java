package com.gcaio.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class APIClassicaComNIO {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\temp\\docs\\LoremIpsum.txt");
		try(BufferedReader reader = Files.newBufferedReader(path)){
			reader.lines().forEach(System.out::println);
		}
	}
}
