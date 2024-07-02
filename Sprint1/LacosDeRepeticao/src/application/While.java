package application;

public class While {

	public static void main(String[] args) {
		int contador = 1;
		System.out.println("While normal:");
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        System.out.println("\n\nWhile true:");
        contador = 1;
        while(true) {
        	if(contador <= 5) {
        		System.out.println("Contador: " + contador);
                contador++;
        	}else {
        		break;
        	}
        }

	}

}
