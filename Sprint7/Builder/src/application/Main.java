package application;

import entities.Pessoa;

public class Main {
	public static void main(String[] args) {

		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.firstName("Gabriel")
				.lastName("Caio")
				.userName("Gabriel Caio")
				.email("Gabriel.Caio@dev.com")
				.builder();
		
		System.out.println(pessoa);

	}

}
