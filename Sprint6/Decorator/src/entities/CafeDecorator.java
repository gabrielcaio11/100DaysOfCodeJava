package entities;

//Decorator (Objeto Decorador)
public abstract class CafeDecorator implements Cafe {
	protected Cafe cafe;

	public CafeDecorator(Cafe cafe) {
		this.cafe = cafe;
	}

	public double getPreco() {
		return cafe.getPreco();
	}
}
