package application;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Digite um número de 1 a 7 para saber o dia da semana correspondente:");
        int dia = sc.nextInt();

        // Estrutura de controle switch case
        switch (dia) {
            case 1:
                System.out.println("O dia correspondente é Domingo.");
                break;
            case 2:
                System.out.println("O dia correspondente é Segunda-feira.");
                break;
            case 3:
                System.out.println("O dia correspondente é Terça-feira.");
                break;
            case 4:
                System.out.println("O dia correspondente é Quarta-feira.");
                break;
            case 5:
                System.out.println("O dia correspondente é Quinta-feira.");
                break;
            case 6:
                System.out.println("O dia correspondente é Sexta-feira.");
                break;
            case 7:
                System.out.println("O dia correspondente é Sábado.");
                break;
            default:
                System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
                break;
        }

	}

}
