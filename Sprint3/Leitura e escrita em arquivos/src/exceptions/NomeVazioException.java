package exceptions;

public class NomeVazioException extends Exception {
	private static final long serialVersionUID = 1L;

	public NomeVazioException(String message) {
        super(message);
    }
}