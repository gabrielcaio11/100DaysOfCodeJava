package entities;

public class Boleto implements Pagamento {
    private String codigoBarras;
    private double valor;

    public Boleto(String codigoBarras, double valor) {
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    @Override
    public void autorizar(Cliente cliente, String senha) {
        if (cliente.getSenha().equals(senha)) {
            System.out.println("Autorizando pagamento por boleto bancário com código de barras " + codigoBarras);
        } else {
            System.out.println("Senha incorreta. Autorização falhou.");
        }
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento de R$" + valor + " com boleto bancário " + codigoBarras);
    }
}



