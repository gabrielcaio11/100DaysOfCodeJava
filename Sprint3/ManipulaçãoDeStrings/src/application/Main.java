package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu texto para criptografar: ");
		String texto = sc.nextLine();
		
		System.out.println("\n\nTexto criptografado: \n");
		System.out.println(criptografarTexto(texto));

		System.out.println("Digite seu texto para descriptografar: ");
	    texto = sc.nextLine();
		
		System.out.println("\n\nTexto descriptografado: \n");
		System.out.println(descriptografarTexto(texto));
	}
	
	private static String criptografarTexto(String texto) {
        texto = texto.toLowerCase(); // Convertendo para minúsculas
        texto = texto.replace("e", "enter");
        texto = texto.replace("i", "imes");
        texto = texto.replace("a", "ai");
        texto = texto.replace("o", "ober");
        texto = texto.replace("u", "ufat");
        return texto;
    }
	
	private static String descriptografarTexto(String texto) {
        texto = texto.replace("enter", "e");
        texto = texto.replace("imes", "i");
        texto = texto.replace("ai", "a");
        texto = texto.replace("ober", "o");
        texto = texto.replace("ufat", "u");
        return texto;
    }

}
