package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MovendoArquivosDiretorios {

	public static void main(String[] args) throws IOException {
		Path pastaFornecedores = Path.of("C:\\temp\\docs\\contratos\\fornecedores\\teste.txt");
		Path pastaClientes= Path.of("C:\\temp\\docs\\contratos\\clientes\\teste.txt");
		//movendo o arquivo da pasta fornecedores para a pasta clientes
		Files.move(pastaFornecedores, pastaClientes,StandardCopyOption.REPLACE_EXISTING);
		
		Files.delete(pastaClientes);
		Files.deleteIfExists(pastaFornecedores);
	}

}
