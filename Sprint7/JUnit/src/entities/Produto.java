package entities;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private String codigo;

    public Produto(int id, String nome, double preco, String codigo) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Métodos adicionais da classe Produto
    // ...

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + "]";
    }
}