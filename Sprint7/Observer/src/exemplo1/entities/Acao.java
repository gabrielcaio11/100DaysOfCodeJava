package exemplo1.entities;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String nome;
    private double preco;
    private List<Observer> observers;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notifyObservers();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
