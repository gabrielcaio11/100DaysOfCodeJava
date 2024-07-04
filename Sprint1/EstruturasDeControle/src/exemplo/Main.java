package exemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dia:");
		int dia = sc.nextInt();

		System.out.println("Digite o mês:");
		int mes = sc.nextInt();

		System.out.println("Digite o ano:");
		int ano = sc.nextInt();
		String estacao;
		switch (mes) {
		case 1:
		case 2:
			estacao = "Verão";
			break;
		case 3:
			estacao = (dia < 21) ? "Verão" : "Outono";
			break;
		case 4:
		case 5:
			estacao = "Outono";
			break;
		case 6:
			estacao = (dia < 21) ? "Outono" : "Inverno";
			break;
		case 7:
		case 8:
			estacao = "Inverno";
			break;
		case 9:
			estacao = (dia < 23) ? "Inverno" : "Primavera";
			break;
		case 10:
		case 11:
			estacao = "Primavera";
			break;
		case 12:
			estacao = (dia < 22) ? "Primavera" : "Verão";
			break;
		default:
			estacao = "Mês inválido";
		}

		System.out.printf("A data %d/%d/%d corresponde à estação: %s.%n", dia, mes, ano, estacao);

		sc.close();
	}

}
