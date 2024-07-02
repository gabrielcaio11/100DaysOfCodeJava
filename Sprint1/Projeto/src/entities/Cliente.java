package entities;

public class Cliente {
    // Atributos
    private String nome;
    private String cpf;
    private String cep;

    // Construtor
    public Cliente(String nome, String cpf, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
    }

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // Método para exibir informações do cliente
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("CEP: " + cep);
    }
}
