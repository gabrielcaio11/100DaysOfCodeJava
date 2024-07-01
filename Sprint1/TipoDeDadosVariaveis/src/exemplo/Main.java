package exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Dados Pessoais:");
		
		System.out.println("Nome: ");
		String nome = scn.nextLine();
		
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Altura: ");
		float altura = sc.nextFloat();
		
		System.out.println("Sexo: [M\\F]");
		char sexo = scn.next().charAt(0);
		
		System.out.printf("Bem vindo %s \nVoce tem %d anos \nCom %.2f metros de altura \ne o sexo %c",nome.toUpperCase(),idade,altura,sexo);
		
		

	}

}
