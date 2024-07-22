package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Estudante;
import exceptions.CpfInvalidoException;
import exceptions.NomeVazioException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Menu de Login:");
				System.out.println("1. Cadastro Estudante");
				System.out.println("2. Mostrar Estudantes matriculados");
				System.out.println("3. Sair");
				System.out.print("Escolha uma opção: ");
				int opcao = Integer.parseInt(scanner.nextLine());

				if (opcao == 1) {
					System.out.print("Nome: ");
					String nome = scanner.nextLine();
					validarNome(nome);

					System.out.print("CPF: ");
					String cpf = scanner.nextLine();
					validarCpf(cpf);

					System.out.print("Matrícula: ");
					String matricula = scanner.nextLine();
					validarMatricula(matricula);

					Estudante estudante = new Estudante(nome, cpf, matricula);
					cadastrarEstudante(estudante);
					System.out.println("Cadastro realizado com sucesso!");
					System.out.println("Nome: " + estudante.getNome());
					System.out.println("CPF: " + estudante.getCpf());
					System.out.println("Matrícula: " + estudante.getMatricula());
				} else if (opcao == 2) {
					List<Estudante> estudantes = alunosMatriclados();
					mostrarAlunosMatriculados(estudantes);
					
				}
				else if (opcao == 3) {
					System.out.println("Saindo...");
					break;
				}
				else {
					System.out.println("Opção inválida. Tente novamente.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida. Por favor, digite um número.");
			} catch (NomeVazioException | CpfInvalidoException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}

		scanner.close();
	}

	private static void mostrarAlunosMatriculados(List<Estudante> estudantes) {
		System.out.println("\n\n=====Alunos Matriculados=====\n");
		for(Estudante estudante : estudantes) {
			System.out.println(estudante);
		}
		System.out.println("\n\n");
		
	}

	private static List<Estudante> alunosMatriclados() {
		List<Estudante> estudantes = new ArrayList<>();
		String[] lines;
		String path = "C:\\temp\\docs\\ArquivoDeEstudantes.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String linha;
	        while ((linha = br.readLine()) != null) {
	            System.out.println(linha);
	            lines = linha.split(",");
	            estudantes.add(new Estudante(lines[0],lines[1],lines[2]));
	        }
	        return estudantes;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return estudantes;
		
	}

	private static void cadastrarEstudante(Estudante estudante) {

		String[] lines = new String[] { estudante.getNome(), estudante.getCpf(), estudante.getMatricula() };
		String path = "C:\\temp\\docs\\ArquivoDeEstudantes.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (int i = 0; i < lines.length; i++) {
				if (i == lines.length - 1) {
					bw.write(lines[i]);
				} else {
					bw.write(lines[i] + ",");
				}
			}
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void validarNome(String nome) throws NomeVazioException {
		if (nome == null || nome.isEmpty()) {
			throw new NomeVazioException("Nome não pode ser vazio.");
		}
	}

	private static void validarCpf(String cpf) throws CpfInvalidoException {
		if (!cpf.matches("\\d{11}")) {
			throw new CpfInvalidoException("CPF deve ter 11 dígitos.");
		}
	}

	private static void validarMatricula(String matricula) {
		if (matricula == null || matricula.isEmpty()) {
			throw new IllegalArgumentException("Matrícula não pode ser vazia.");
		}
	}
}
