package com.gcaio.application;

import java.io.File;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		//FileSystem fs = FileSystems.getDefault();
		//System.out.println(fs);
		//Path arquivo = fs.getPath("C:\\temp","docs"); //pai,filho
		//Path arquivo = fs.getPath("C:\\temp\\docs");
		
		Path arquivo = Path.of("docs"); // depois do java 11
		
		
		System.out.println("Nome completo do arquivo: " + arquivo);
		System.out.println("Nome do arquivo: " + arquivo.getFileName());
		System.out.println("\"Pai\" do arquivo: " + arquivo.getParent());
		
		
		Path arquivoAbsoluto = arquivo.toAbsolutePath();
		System.out.println("Arquivo absoluto: " + arquivoAbsoluto);
		
		File arquivo1 = arquivo.toFile(); // path para file
		Path arquivo2 = arquivo1.toPath(); // file para path
	}

}
