package application;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Solicita a quantidade de elementos no array
		
        System.out.println("Digite a quantidade de elementos no array:");
        int n = sc.nextInt();

        // Cria um array para armazenar os elementos
        int[] array = new int[n];

        // Preenche o array com valores fornecidos pelo usuário
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento %d: ", (i + 1));
            array[i] = sc.nextInt();
        }

        // Exibe o array original
        System.out.println("\nArray original:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        

	}

}
