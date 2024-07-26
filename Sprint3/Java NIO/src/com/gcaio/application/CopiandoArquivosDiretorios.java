package com.gcaio.application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopiandoArquivosDiretorios {

	public static void main(String[] args) throws IOException {
		// fornecedores 
		Path pastaFornecedores = Path.of("C:\\temp\\docs\\contratos\\fornecedores");	
		Path arquivoContratoFornecedores = Path.of("C:\\temp\\docs\\contratos\\fornecedores\\Contrato-venda.txt");	
		Path arquivoContratoOrigem = pastaFornecedores.resolve(arquivoContratoFornecedores);
		
		System.out.println(arquivoContratoOrigem);
		
		//clientes		
		Path pastaClientes= Path.of("C:\\temp\\docs\\contratos\\clientes");		
		Path arquivoContratoCliente = Path.of("C:\\temp\\docs\\contratos\\clientes\\Contrato-venda.txt");	
		Path arquivoContratoDestino= pastaClientes.resolve(arquivoContratoCliente); 
		
		Files.copy(arquivoContratoOrigem, arquivoContratoDestino,StandardCopyOption.REPLACE_EXISTING);
		
	}

}
