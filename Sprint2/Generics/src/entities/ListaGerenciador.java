package entities;

import java.util.ArrayList;
import java.util.List;

public class ListaGerenciador<T> {
    private List<T> itens;

    public ListaGerenciador() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void removerItem(T item) {
        itens.remove(item);
    }

    public List<T> listarItens() {
        return itens;
    }

    public void exibirItens() {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
