package com.gcaio.application;

import java.util.ArrayList;

import com.gcaio.entities.Filme;
import com.google.gson.Gson;

public class GravandoJSON  {

	public static void main(String[] args) {
		Filme f = new Filme();
		f.titulo = "JSON x XML";
		f.ano = 2012;
		f.generos = new ArrayList<>();
		f.generos.add("Aventura");
		f.generos.add("Ação");
		f.generos.add("Ficção");
		// instancia um objeto da classe Gson
		Gson gson = new Gson();

		// pega os dados do filme, converte para JSON e armazena em string
		String aux = gson.toJson(f);

		// imprime os resultados
		System.out.println(aux);

	}

}
