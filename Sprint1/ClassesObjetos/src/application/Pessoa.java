package application;

public class Pessoa {
    // Atributos
    String nome;
    int idade;
    double altura;

    // Construtor
    public Pessoa(String nomePessoa, int idadePessoa, double alturaPessoa) {
        nome = nomePessoa;
        idade = idadePessoa;
        altura = alturaPessoa;
    }

    // Métodos
    public void apresentar() {
        System.out.printf("Olá, meu nome é %s, tenho %d anos e %.2f metros de altura.%n", nome, idade, altura);
    }
}

