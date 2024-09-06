package application;

import entities.AcucarDecorator;
import entities.Cafe;
import entities.CafeSimple;
import entities.LeiteDecorator;

//Uso do padrão Decorator
public class Main {
	public static void main(String[] args) {
		Cafe cafe = new CafeSimple();
		Cafe cafeComLeite = new LeiteDecorator(cafe);
		Cafe cafeComLeiteEAucar = new AcucarDecorator(cafeComLeite);

		System.out.println("Preço do café: " + cafe.getPreco());
		System.out.println("Preço do café com leite: " + cafeComLeite.getPreco());
		System.out.println("Preço do café com leite e açúcar: " + cafeComLeiteEAucar.getPreco());
	}
}
