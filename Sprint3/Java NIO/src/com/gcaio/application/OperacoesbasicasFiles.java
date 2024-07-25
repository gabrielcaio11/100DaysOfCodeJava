package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OperacoesbasicasFiles {

	public static void main(String[] args) {
		Path arquivo = Path.of("C:\\temp\\docs","teste1");
		Path arquivo2 = Path.of("C:\\temp\\docs\\teste1\\textos\\texto1");
		try {
			Files.createDirectory(arquivo);
			Files.createDirectories(arquivo2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
