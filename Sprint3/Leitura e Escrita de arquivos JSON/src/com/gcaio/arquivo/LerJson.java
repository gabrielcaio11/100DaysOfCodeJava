package com.gcaio.arquivo;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.gcaio.entities.Filme;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class LerJson {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
        Filme filme = gson.fromJson(new FileReader("C:\\temp\\docs\\arquivojson.json"), Filme.class);
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Ano: " + filme.getAno());
        System.out.println("Gêneros: " + filme.getGeneros());
        

	}

}
