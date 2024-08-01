package com.gcaio.entities;

import java.util.ArrayList;

public class Filme {
	public String titulo;
    public int ano;
    public ArrayList<String> generos;
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<String> getGeneros() {
		return generos;
	}
	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}
    
}
