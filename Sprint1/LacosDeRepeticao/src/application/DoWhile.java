package application;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Deseja continuar? (sim/não)");
            resposta = sc.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                System.out.println("Continuando...");
            } else if (resposta.equals("não")) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Resposta inválida. Digite 'sim' ou 'não'.");
            }
        } while (!resposta.equals("não"));

        sc.close();
    }
}

