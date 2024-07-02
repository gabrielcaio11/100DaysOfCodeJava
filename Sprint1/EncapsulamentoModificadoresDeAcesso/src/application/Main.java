package application;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Pessoa pessoa1 = new Pessoa("João", 25, 1.75);
        Pessoa pessoa2 = new Pessoa("Maria", 30, 1.65);

        // Manipulação de objetos
        pessoa1.apresentar();
        pessoa2.apresentar();

        // Alteração de atributos usando setters
        pessoa1.setIdade(26);
        pessoa1.setAltura(1.76);

        // Apresentação atualizada
        pessoa1.apresentar();
    }
}

