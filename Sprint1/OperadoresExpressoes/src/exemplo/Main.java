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
		char sexo = scn.next().toUpperCase().charAt(0);
		
		System.out.printf("Bem vindo %s \nVoce tem %d anos \nCom %.2f metro de altura \ne o sexo \"%c\".\n\n",nome.toUpperCase(),idade,altura,sexo);
		
		int idadeEmDias = idade*365;		
		
		float alturaEmCentimetros = altura*100;
		
		String sexoString = (sexo == 'M') ? "Masculino":"Feminino";
		
		System.out.printf("\nVoce tem %d dias de idade \nCom %.1f cm de altura \ne o sexo %s.",idadeEmDias,alturaEmCentimetros,sexoString);
		
		
		

	}

}
