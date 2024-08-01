package com.gcaio.projeto.entities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class FilmeJSON {
	private List<Filme> filmes = new ArrayList<>();
	private Gson gson;
	private String arquivoJSON = "C:\\temp\\docs\\arquivojson.json";

	public FilmeJSON() {
		this.gson = new GsonBuilder().setPrettyPrinting().create();

		try (Reader reader = Files.newBufferedReader(Paths.get(arquivoJSON))) {
			this.filmes = gson.fromJson(reader, new TypeToken<List<Filme>>() {
			}.getType());
		} catch (IOException e) {
			this.filmes = new ArrayList<>();
		}
	}
	public void adicionarFilme(List<Filme> filme) {
		for(Filme f : filme) {
			this.filmes.add(f);
		}		
		salvarFilmes();
	}

	public Filme getFilmeByTitulo(String titulo) {
		for (Filme filme : this.filmes) {
			if (filme.getNome().equals(titulo)) {
				return filme;
			}
		}
		return null;
	}

	private void salvarFilmes() {
		try (FileWriter writer = new FileWriter(arquivoJSON)) {
			gson.toJson(this.filmes);
		} catch (IOException e) {
			System.err.println("Erro ao salvar filmes: " + e.getMessage());
		}
	}
	public List<Filme> findAll() {
		return filmes;
	}
}
