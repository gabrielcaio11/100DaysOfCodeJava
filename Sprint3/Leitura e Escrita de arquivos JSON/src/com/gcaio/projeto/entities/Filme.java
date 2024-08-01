package com.gcaio.projeto.entities;

public class Filme {
    private String nome;
    private String autor;
    private double nota;
    private Streaming streaming;

    public Filme(String nome, String autor, double nota, Streaming streaming) {
        this.nome = nome;
        this.autor = autor;
        this.nota = nota;
        this.streaming = streaming;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public double getNota() {
        return nota;
    }

    public Streaming getStreaming() {
        return streaming;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", nota=" + nota +
                ", streaming=" + streaming.getDescricao() +
                '}';
    }

   
}