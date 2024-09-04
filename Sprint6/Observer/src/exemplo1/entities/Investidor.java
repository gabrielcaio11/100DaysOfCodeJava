package exemplo1.entities;

//Classe Investidor (Observer)
public class Investidor implements Observer {
	private String nome;

	public Investidor(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Acao acao) {
		System.out.println(
				nome + " foi notificado que o preço da ação " + acao.getNome() + " mudou para " + acao.getPreco());
	}
}
