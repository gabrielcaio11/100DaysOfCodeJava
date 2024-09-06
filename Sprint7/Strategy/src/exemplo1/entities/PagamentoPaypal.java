package exemplo1.entities;

//Pagamento com Paypal
public class PagamentoPaypal implements PagamentoStrategy {
	private String email;

	public PagamentoPaypal(String email) {
		this.email = email;
	}

	@Override
	public void pagar(double valor) {
		// Lógica para processar o pagamento via Paypal
		System.out.println("Pagando " + valor + " com Paypal.");
	}
}
