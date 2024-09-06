package entities;

//Decorator (Objeto Decorador)
public class AcucarDecorator extends CafeDecorator {
	private double precoAcucar = 0.5;

	public AcucarDecorator(Cafe cafe) {
		super(cafe);
	}

	public double getPreco() {
		return super.getPreco() + precoAcucar;
	}
}
