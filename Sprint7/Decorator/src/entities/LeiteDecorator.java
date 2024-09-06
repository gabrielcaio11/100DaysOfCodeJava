package entities;

//Decorator (Objeto Decorador)
public class LeiteDecorator extends CafeDecorator {
	private double precoLeite = 1.0;

	public LeiteDecorator(Cafe cafe) {
		super(cafe);
	}

	public double getPreco() {
		return super.getPreco() + precoLeite;
	}
}
