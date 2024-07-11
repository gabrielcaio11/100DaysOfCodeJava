package entities;

public class Endereco {
    private String rua;
    private int numero;
    private String pontoDeReferencia;

    public Endereco(String rua, int numero, String pontoDeReferencia) {
        this.rua = rua;
        this.numero = numero;
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero=" + numero +
                ", pontoDeReferencia='" + pontoDeReferencia + '\'' +
                '}';
    }
}

