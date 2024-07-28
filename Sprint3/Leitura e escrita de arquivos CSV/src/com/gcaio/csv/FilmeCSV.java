package com.gcaio.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.gcaio.entities.Filme;

public class FilmeCSV {
	private static final Path  caminhoDoArquivo = Path.of("C:\\temp\\Java\\ws-Java\\ArquivoCsv\\dados\\Filmes.csv");
	
	public FilmeCSV() {
		
	}
	public static void adicionarFilme(Filme filme) throws IOException {
		Objects.requireNonNull(filme,"filme não pode ser null!");
		FileWriter fw = new FileWriter(caminhoDoArquivo.toString(),StandardCharsets.UTF_8, true);
		if(Files.size(caminhoDoArquivo)==0) {
			fw.write("Nome;AnoLancamento;Nota\n");			
		}
		fw.write(filme.getNome()+ "," + filme.getAnoLancamento()+ "," + filme.getNota() + "\n");
		// Escrever todos os dados do buffer no arquivo imediatamente
		
		fw.flush();
		
		// fechar o recurso de escrita
		
		fw.close();
	}
	public static List<Filme> listarFilmes(){
		List<Filme> filmes = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo.toString()))){
			String linha;
			Boolean primeiraLinha = true;
			while((linha = br.readLine()) != null) {
				if(primeiraLinha) {
					primeiraLinha = false;
					continue;
				}
				String[] lines = linha.split(",");
				Filme filme = new Filme(lines[0],Integer.parseInt(lines[1]),Double.parseDouble(lines[2]));
				filmes.add(filme);
			}
			return filmes;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public static Filme buscarFilmePorTitulo(String titulo) {
        List<Filme> filmes = listarFilmes();
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null; // Retorna null se não encontrar o filme
    }
}
