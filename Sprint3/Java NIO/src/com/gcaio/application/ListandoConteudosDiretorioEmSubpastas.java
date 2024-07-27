package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ListandoConteudosDiretorioEmSubpastas {

	public static void main(String[] args) throws IOException {
		Path pasta = Path.of("C:\\temp\\docs");
		//todas as subpastas e arquivos 
		 //pasta,nivel de profundidade,
		try (Stream<Path> listaDeArquivosSubpastas = 
				Files.find(pasta, Integer.MAX_VALUE, 
						 (path, attrs) -> 
				 path.getFileName().toString().matches(".*\\.txt"))){
			listaDeArquivosSubpastas.forEach(System.out::println);
		}
	}

}
