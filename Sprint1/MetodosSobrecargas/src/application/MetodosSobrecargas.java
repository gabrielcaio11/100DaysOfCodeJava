package application;

public class MetodosSobrecargas {

    public void metodo() {
        System.out.println("Método sem parâmetros");
    }

    public void metodo(int parametro) {
        System.out.println("Método com um parâmetro inteiro: " + parametro);
    }

    public void metodo(String parametro) {
        System.out.println("Método com um parâmetro String: " + parametro);
    }

    public static void main(String[] args) {
    	MetodosSobrecargas exemplo = new MetodosSobrecargas();

        exemplo.metodo();                 // Chama o método sem parâmetros
        exemplo.metodo(10);               // Chama o método com um parâmetro inteiro
        exemplo.metodo("Hello, world!");  // Chama o método com um parâmetro String
    }
}
