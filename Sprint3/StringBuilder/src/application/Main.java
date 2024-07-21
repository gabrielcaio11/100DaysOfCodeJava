package application;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Desafio de 100 dias");

        // Append
        sb.append(" codando");
        System.out.println(sb.toString());  // Output: Desafio de 100 dias codando

        // Insert
        sb.insert(0, "Meu ");
        System.out.println(sb.toString());  // Output: Meu Desafio de 100 dias codando

        // Replace
        sb.replace(24, 31, "Codando");
        System.out.println(sb.toString());  // Output: Hello Awesome World


        // Reverse
        sb.reverse();
        System.out.println(sb.toString());  // Output: odnadoC said 001 ed oifaseD ueM
	}

}
