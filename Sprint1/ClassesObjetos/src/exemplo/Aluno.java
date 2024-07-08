package exemplo;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void apresentar() {
        System.out.printf("Aluno: %s, Idade: %d, Matrícula: %s%n", nome, idade, matricula);
    }
}
