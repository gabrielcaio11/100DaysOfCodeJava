package entities;

public class Cliente {
    private String nome;
    private String cpf;
    private String senha;
    private double saldo;

    public Cliente(String nome, String cpf, String senha, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para sacar dinheiro da conta
    public boolean sacar(double valor, String senha) {
        if (this.senha.equals(senha)) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
                return true;
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
                return false;
            }
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

