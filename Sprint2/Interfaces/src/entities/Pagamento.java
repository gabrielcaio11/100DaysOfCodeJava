package entities;

public interface Pagamento {
    void autorizar(Cliente cliente, String senha);
    void processar();
}



