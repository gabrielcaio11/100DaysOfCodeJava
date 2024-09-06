package exemplo1.application;

import exemplo1.entities.*;
public class Main {

	public static void main(String[] args) {
		
		Acao acao = new Acao("PETR4", 10.0);
		Investidor investidor1 = new Investidor("João");
		Investidor investidor2 = new Investidor("Maria");				

		acao.addObserver(investidor1);
		acao.addObserver(investidor2);

		acao.setPreco(12.0);
		acao.setPreco(15.0);
	}
}
