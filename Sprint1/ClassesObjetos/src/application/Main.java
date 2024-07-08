package application;

import java.util.Scanner;

import exemplo.Aluno;
import exemplo.Curso;
import exemplo.Escola;
import exemplo.Professor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escola escola = new Escola("Escola");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Curso");
            System.out.println("2. Adicionar Aluno a Curso");
            System.out.println("3. Listar Cursos");
            System.out.println("4. Listar Alunos de um Curso");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Curso: ");
                    String nomeCurso = scanner.nextLine();
                    System.out.print("Nome do Professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Especialidade do Professor: ");
                    String especialidade = scanner.nextLine();
                    
                    Professor professor = new Professor(nomeProfessor, especialidade);
                    Curso curso = new Curso(nomeCurso, professor);
                    escola.adicionarCurso(curso);
                    System.out.println("Curso adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do Curso: ");
                    String cursoParaAluno = scanner.nextLine();
                    Curso cursoSelecionado = null;

                    for (Curso c : escola.getCursos()) {
                        if (c.getNome().equals(cursoParaAluno)) {
                            cursoSelecionado = c;
                            break;
                        }
                    }

                    if (cursoSelecionado != null) {
                        System.out.print("Nome do Aluno: ");
                        String nomeAluno = scanner.nextLine();
                        System.out.print("Idade do Aluno: ");
                        int idadeAluno = scanner.nextInt();
                        scanner.nextLine();  // Consumir a nova linha
                        System.out.print("Matrícula do Aluno: ");
                        String matriculaAluno = scanner.nextLine();
                        
                        Aluno aluno = new Aluno(nomeAluno, idadeAluno, matriculaAluno);
                        cursoSelecionado.adicionarAluno(aluno);
                        System.out.println("Aluno adicionado com sucesso!");
                    } else {
                        System.out.println("Curso não encontrado!");
                    }
                    break;
                case 3:
                    escola.listarCursos();
                    break;
                case 4:
                    System.out.print("Nome do Curso: ");
                    String cursoParaListar = scanner.nextLine();
                    Curso cursoParaExibir = null;

                    for (Curso c : escola.getCursos()) {
                        if (c.getNome().equals(cursoParaListar)) {
                            cursoParaExibir = c;
                            break;
                        }
                    }

                    if (cursoParaExibir != null) {
                        cursoParaExibir.listarAlunos();
                    } else {
                        System.out.println("Curso não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
