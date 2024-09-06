package exemplo1.entities;

//Pagamento com Boleto Bancário
public class PagamentoBoleto implements PagamentoStrategy {
@Override
public void pagar(double valor) {
   // Lógica para gerar e processar o pagamento com boleto bancário
   System.out.println("Gerando boleto para o valor de " + valor);
}
}
