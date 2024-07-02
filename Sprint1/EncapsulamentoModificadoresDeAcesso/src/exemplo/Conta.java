package exemplo;

public class Conta {
    // Atributos
    private String numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    public Conta(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso!%n\n", valor);
        } else {
            System.out.println("Valor de depósito inválido.\n");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!%n\n", valor);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.\n");
        }
    }

    // Método para verificar saldo
    public double verificarSaldo() {
        return saldo;
    }

    // Método para transferir
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && valor <= saldo) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$%.2f para a conta %s realizada com sucesso!%n\n", valor, contaDestino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.\n");
        }
    }

    // Getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
}

