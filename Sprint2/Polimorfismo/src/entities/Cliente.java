package entities;
	

public class Cliente extends Pessoa{

	private String tipoCliente;
	public Cliente(String nome, String cpf, String cep, String tipoCliente ) {
		super(nome, cpf, cep);
		this.tipoCliente = tipoCliente;
		
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	@Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Cliente: " + tipoCliente);
    }

}
