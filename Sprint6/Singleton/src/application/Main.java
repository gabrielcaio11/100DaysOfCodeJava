package application;

import entities.Singleton;

public class Main {

	public static void main(String[] args) {
		//Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();
		
		System.out.println(singleton.propositoDoSingleton());
	}
}
