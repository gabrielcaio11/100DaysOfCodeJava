package application;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a += b; // a = a + b
        System.out.println("a += b: " + a);

        a -= b; // a = a - b
        System.out.println("a -= b: " + a);

        a *= b; // a = a * b
        System.out.println("a *= b: " + a);

        a /= b; // a = a / b
        System.out.println("a /= b: " + a);

        a %= b; // a = a % b
        System.out.println("a %= b: " + a);
    }
}
