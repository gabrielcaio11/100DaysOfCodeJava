package entities;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			return new Singleton();
		}
		return new Singleton();
	}
	
	public String propositoDoSingleton() {
		return "O Singleton é um padrão de projeto criacional \n"
				+ "que permite a você garantir que uma classe tenha apenas uma instância, \n"
				+ "enquanto provê um ponto de acesso global para essa instância.";
	}

}
