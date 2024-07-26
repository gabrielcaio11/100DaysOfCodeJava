package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class ObtendoInformacoes {

	public static void main(String[] args) throws IOException {
		Path arquivo = Path.of("C:\\temp\\docs\\teste.txt");
		
		System.out.println("Tamanho do Arquivo em bytes: " + Files.size(arquivo));
		System.out.println("É arquivo: " + Files.isRegularFile(arquivo));
		System.out.println("É diretorio: " + Files.isDirectory(arquivo));
		
		Instant ultimaModificcao = Files.getLastModifiedTime(arquivo).toInstant();
		
		System.out.println("Última alterção: " + ultimaModificcao);
		
		System.out.println("O arquivo é oculto: " + Files.isHidden(arquivo));
		System.out.println("O arquivo pode ser lido: " + Files.isReadable(arquivo));
		System.out.println("O arquivo pode ser executado: " + Files.isExecutable(arquivo));
	}

}
