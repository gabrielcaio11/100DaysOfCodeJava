package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListandoConteudosDiretorios {

	public static void main(String[] args) throws IOException {
		Path pasta = Path.of("C:\\temp\\docs");

		try (Stream<Path> listaDeArquivos = Files.list(pasta)) {
				// pega somente os filhos da pasta
				 listaDeArquivos
				.map(Path::getFileName)
				.map(Path::toString)
				.filter(nome -> nome.matches(".*\\.txt"))
				.forEach(System.out::println);
				 
				 //todas as subpastas e arquivos 
				 //pasta,nivel de profundidade,
				 Stream<Path> listaDeArquivosSubpastas = Files.find(pasta, Integer.MAX_VALUE, 
						 (path, attrs) -> 
				 path.getFileName().toString().matches(".*\\.txt"));
		}
	}

}
