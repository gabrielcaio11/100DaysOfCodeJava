package entities;

import java.util.ArrayList;
import java.util.List;

public final class SalaDeAula {
    public final int TOTAL_ESTUDANTE = 30;
    private List<Estudante> alunos;

    public SalaDeAula() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Estudante aluno) {
        if (alunos.size() < TOTAL_ESTUDANTE) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado à sala de aula.");
        } else {
            System.out.println("Não foi possível adicionar o aluno " + aluno.getNome() + ". Sala de aula cheia.");
        }
    }

    public void removerAluno(Estudante aluno) {
        if (alunos.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNome() + " removido da sala de aula.");
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não encontrado na sala de aula.");
        }
    }

    // Métodos adicionais da classe SalaDeAula podem ser incluídos aqui

    public List<Estudante> getAlunos() {
        return alunos;
    }
}

