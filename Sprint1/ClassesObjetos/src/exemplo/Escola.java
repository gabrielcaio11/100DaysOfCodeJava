package exemplo;

public class Escola {
    private static final int NUMERO_MAXIMO_CURSOS = 10;
    private String nome;
    private Curso[] cursos;
    private int contadorCursos;

    public Escola(String nome) {
        this.nome = nome;
        this.cursos = new Curso[NUMERO_MAXIMO_CURSOS];
        this.contadorCursos = 0;
    }

    public void adicionarCurso(Curso curso) {
        if (contadorCursos < NUMERO_MAXIMO_CURSOS) {
            cursos[contadorCursos] = curso;
            contadorCursos++;
        } else {
            System.out.println("Número máximo de cursos atingido.");
        }
    }

    public void listarCursos() {
        System.out.println("Cursos oferecidos pela escola " + nome + ":");
        for (int i = 0; i < contadorCursos; i++) {
            cursos[i].apresentarCurso();
        }
    }

    public Curso[] getCursos() {
        Curso[] cursosAtuais = new Curso[contadorCursos];
        System.arraycopy(cursos, 0, cursosAtuais, 0, contadorCursos);
        return cursosAtuais;
    }
}
