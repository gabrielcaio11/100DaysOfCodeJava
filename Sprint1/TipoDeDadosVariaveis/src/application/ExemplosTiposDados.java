package application;
public class ExemplosTiposDados {

    public static void main(String[] args) {
        // Tipos Primitivos
        // Inteiros
        byte valorByte = 127;
        short valorShort = 32000;
        int valorInt = 1000000;
        long valorLong = 999999999L;

        // Ponto Flutuante
        float valorFloat = 3.14f;
        double valorDouble = 2.71828;

        // Caracteres
        char valorChar = 'A';

        // Booleanos
        boolean valorBoolean = true;

        // Tipos de Referência
        // Strings
        String valorString = "Olá, mundo!";


        // Exemplos de uso
        System.out.println("Exemplos de Tipos de Dados em Java\n");

        System.out.println("Valores dos Tipos Primitivos:");
        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
        System.out.println("char: " + valorChar);
        System.out.println("boolean: " + valorBoolean);

        System.out.println("\nValor da String: " + valorString);

    }
}