package exemplo;

public class Calculadora {

	// Método para somar dois inteiros
	public int somar(int a, int b) {
		return a + b;
	}

	// Método sobrecarregado para somar três inteiros
	public int somar(int a, int b, int c) {
		return a + b + c;
	}

	// Método para somar dois números de ponto flutuante
	public double somar(double a, double b) {
		return a + b;
	}

	// Método para subtrair dois inteiros
	public int subtrair(int a, int b) {
		return a - b;
	}

	// Método para subtrair dois números de ponto flutuante
	public double subtrair(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		// Uso de métodos sobrecarregados
		System.out.println("Soma de 2 inteiros: " + calc.somar(10, 5)); // 15
		System.out.println("Soma de 3 inteiros: " + calc.somar(10, 5, 2)); // 17
		System.out.println("Soma de 2 doubles: " + calc.somar(10.5, 5.5)); // 16.0

		// Uso de métodos de subtração
		System.out.println("Subtração de 2 inteiros: " + calc.subtrair(10, 5)); // 5
		System.out.println("Subtração de 2 doubles: " + calc.subtrair(10.5, 5.5)); // 5.0
	}
}
