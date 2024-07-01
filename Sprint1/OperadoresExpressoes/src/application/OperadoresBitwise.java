package application;

public class OperadoresBitwise {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println("a & b: " + (a & b)); // 0001
        System.out.println("a | b: " + (a | b)); // 0111
        System.out.println("a ^ b: " + (a ^ b)); // 0110
        System.out.println("~a: " + (~a));       // 1010 (invertido)

        System.out.println("a << 1: " + (a << 1)); // 1010
        System.out.println("a >> 1: " + (a >> 1)); // 0010
        System.out.println("a >>> 1: " + (a >>> 1)); // 0010
    }
}
