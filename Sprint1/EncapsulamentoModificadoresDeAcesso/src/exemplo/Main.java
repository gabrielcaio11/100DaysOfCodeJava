package exemplo;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("123456", "João Silva", 1000.0);
        Conta conta2 = new Conta("654321", "Maria Souza", 500.0);

        System.out.println("Saldo inicial conta 1: R$" + conta1.verificarSaldo());
        System.out.println("\nSaldo inicial conta 2: R$" + conta2.verificarSaldo()+"\n");

        conta1.depositar(200.0);
        
        conta1.sacar(150.0);

        conta1.transferir(300.0, conta2);

        System.out.println("\n\nSaldo final conta 1: R$" + conta1.verificarSaldo());
        System.out.println("\nSaldo final conta 2: R$" + conta2.verificarSaldo());
    }
}

