package exemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de elementos no array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("\nDigite os elementos do array:\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("Elemento %d: ", (i + 1));
            array[i] = sc.nextInt();
        }
		System.out.println("\nO programa então exibirá o array original, o array invertido, o maior e menor valor, e a soma dos elementos.\n");
		
        int[] arrayInvertido = new int[n];
        
        for (int i = 0; i < n; i++) {
            arrayInvertido[i] = array[n - 1 - i];
        }
        
        int maior = array[0];
        int menor = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += array[i];
        }
        System.out.println("\nArray original:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\nArray invertido:");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayInvertido[i] + " ");
        }

        // Exibe o maior e o menor valor
        System.out.printf("\n\nMaior valor: %d", maior);
        System.out.printf("\nMenor valor: %d", menor);

        // Exibe a soma dos elementos
        System.out.printf("\n\nSoma dos elementos: %d", soma);

	}

}
