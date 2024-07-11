package entities;

public class Produto {
    private String nome;
    private String codigo;
    private float preco;

    public Produto(String nome, String codigo,float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setPreco(Float preco) {
		this.preco = preco;
	}
    public Float getPreco() {
		return preco;
	}
    

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}

