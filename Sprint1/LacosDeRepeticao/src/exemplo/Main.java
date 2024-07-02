package exemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Usando laço for:\n");
        // Solicita a quantidade de alunos
        System.out.println("Digite a quantidade de alunos:");
        int quantidadeAlunos = sc.nextInt();

        // Cria um array para armazenar as notas dos alunos
        double[] notas = new double[quantidadeAlunos];

        // Usa um laço for para obter as notas dos alunos
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("Digite a nota do aluno %d: ", (i + 1));
            notas[i] = sc.nextDouble();
        }

        // Calcula a média das notas da turma
        double soma = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / quantidadeAlunos;

        // Exibe a média da turma
        System.out.printf("A média da turma é: %.2f%n", media);
        System.out.println("\nFim do laço for\n\n");
        sc.close();

	}

}
