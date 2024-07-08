package entities;

public class CartaoCredito implements Pagamento {
    private String numeroCartao;
    private String titular;
    private double valor;

    public CartaoCredito(String numeroCartao, String titular, double valor) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.valor = valor;
    }

    @Override
    public void autorizar(Cliente cliente, String senha) {
        if (cliente.getSenha().equals(senha)) {
            System.out.println("Autorizando pagamento com cartão de crédito para " + titular);
        } else {
            System.out.println("Senha incorreta. Autorização falhou.");
        }
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento de R$" + valor + " no cartão de crédito " + numeroCartao);
    }
}



