package exceptions;

public class CpfInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public CpfInvalidoException(String message) {
        super(message);
    }
}