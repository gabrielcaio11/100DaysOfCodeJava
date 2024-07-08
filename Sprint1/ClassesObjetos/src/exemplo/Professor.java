package exemplo;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void apresentar() {
        System.out.printf("Professor: %s, Especialidade: %s%n", nome, especialidade);
    }
}
