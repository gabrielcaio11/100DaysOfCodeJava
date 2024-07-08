package exemplo;

public class Curso {
    private static final int NUMERO_MAXIMO_ALUNOS = 25;
    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int contadorAlunos;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[NUMERO_MAXIMO_ALUNOS];
        this.contadorAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (contadorAlunos < NUMERO_MAXIMO_ALUNOS) {
            alunos[contadorAlunos] = aluno;
            contadorAlunos++;
        } else {
            System.out.println("Número máximo de alunos atingido.");
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos do curso " + nome + ":");
        for (int i = 0; i < contadorAlunos; i++) {
            alunos[i].apresentar();
        }
    }

    public void apresentarCurso() {
        System.out.println("Curso: " + nome);
        professor.apresentar();
    }

    public String getNome() {
        return nome;
    }
}
