package exemplo1.entities;

//Pagamento com Cartão de Crédito
public class PagamentoCartaoCredito implements PagamentoStrategy {
 private String numeroCartao;
 private String nomeTitular;
 private String dataValidade;
 private String codigoSeguranca;

 public PagamentoCartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String codigoSeguranca) {
     this.numeroCartao = numeroCartao;
     this.nomeTitular = nomeTitular;
     this.dataValidade = dataValidade;
     this.codigoSeguranca = codigoSeguranca;
 }

 @Override
 public void pagar(double valor) {
     // Lógica para processar o pagamento com cartão de crédito
     System.out.println("Pagando " + valor + " com cartão de crédito.");
 }
}




