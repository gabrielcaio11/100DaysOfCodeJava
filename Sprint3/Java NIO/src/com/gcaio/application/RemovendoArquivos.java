package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RemovendoArquivos {

	public static void main(String[] args) throws IOException {
		Path pastaFornecedores = Path.of("C:\\temp\\docs\\contratos\\fornecedores\\teste.txt");
		Path pastaClientes = Path.of("C:\\temp\\docs\\contratos\\clientes\\teste.txt");

		Files.delete(pastaClientes);
		Files.deleteIfExists(pastaFornecedores);

	}

}
