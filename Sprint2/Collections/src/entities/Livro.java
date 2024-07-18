package entities;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String editora;
    private int quantidade;

    
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public int getQuantidade() {
		return quantidade;
	}
    
    public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

    // Método toString para imprimir informações do livro
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", numeroPaginas=" + numeroPaginas +
                ", editora='" + editora + '\'' +
                '}';
    }

    // Método equals com base no autor
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Livro outroLivro = (Livro) obj;
        return autor.equals(outroLivro.autor);
    }

    // Método hashCode com base no autor
    @Override
    public int hashCode() {
        return autor.hashCode();
    }
}
