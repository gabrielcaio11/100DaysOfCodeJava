package Exemplo;

public class Casa {
	// Atributos
	int numero;
	String rua;
	int quantidadeQuartos;
	
	// Construtor
	public Casa(int numeroCasa, String ruaCasa, int quantidadeQuartosCasa) {
		numero = numeroCasa;
		rua = ruaCasa;
		quantidadeQuartos = quantidadeQuartosCasa;
	}
	
	// Métodos
	
	public void informacoes() {
		System.out.println("Numero: "+ numero);
		System.out.println("Rua: "+ rua);
		System.out.println("Quantidade de Quartos: "+ quantidadeQuartos);
	}
	

}
