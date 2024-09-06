package exemplo1.application;

import exemplo1.entities.CarrinhoDeCompras;
import exemplo1.entities.PagamentoBoleto;
import exemplo1.entities.PagamentoCartaoCredito;
import exemplo1.entities.PagamentoPaypal;
import exemplo1.entities.PagamentoStrategy;

public class Main {
    public static void main(String[] args) {
        // Cria o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Notebook");
        carrinho.adicionarItem("Mouse");
        carrinho.mostrarItens();

        double valorTotal = 2500.00;

        // Pagar com cartão de crédito
        PagamentoStrategy pagamentoCartao = new PagamentoCartaoCredito("1234-5678-9101-1121", "João Silva", "12/25", "123");
        carrinho.setPagamentoStrategy(pagamentoCartao);
        carrinho.pagar(valorTotal);

        // Pagar com boleto
        PagamentoStrategy pagamentoBoleto = new PagamentoBoleto();
        carrinho.setPagamentoStrategy(pagamentoBoleto);
        carrinho.pagar(valorTotal);

        // Pagar com Paypal
        PagamentoStrategy pagamentoPaypal = new PagamentoPaypal("joao@example.com");
        carrinho.setPagamentoStrategy(pagamentoPaypal);
        carrinho.pagar(valorTotal);
    }
}

