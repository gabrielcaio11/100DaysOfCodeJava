package com.gcaio.arquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.gcaio.entities.Filme;
import com.google.gson.Gson;

public class EscreverJsonArquivo {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		Filme filme = new Filme();
		filme.titulo = "JSON x XML";
		filme.ano = 2012;
		filme.generos = new ArrayList<>();
		filme.generos.add("Aventura");
		filme.generos.add("Ação");
		filme.generos.add("Ficção");
		
		String json = gson.toJson(filme);
		
		FileWriter fw;
		try {
			fw = new FileWriter("C:\\temp\\docs\\arquivojson.json");
			fw.write(json);
	        fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        

	}

}
