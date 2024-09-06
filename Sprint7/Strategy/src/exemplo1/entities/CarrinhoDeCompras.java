package exemplo1.entities;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens;
    private PagamentoStrategy pagamentoStrategy;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Adiciona itens ao carrinho
    public void adicionarItem(String item) {
        itens.add(item);
    }

    // Define a estratégia de pagamento
    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    // Realiza o pagamento
    public void pagar(double valor) {
        if (pagamentoStrategy == null) {
            throw new IllegalStateException("Nenhuma forma de pagamento foi selecionada.");
        }
        pagamentoStrategy.pagar(valor);
    }

    // Exibe os itens do carrinho
    public void mostrarItens() {
        System.out.println("Itens no carrinho: " + itens);
    }
}
