package application;

import java.util.Locale;
import java.util.Scanner;

public class elseIf {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        
        int numero = sc.nextInt();
		if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

	}

}
