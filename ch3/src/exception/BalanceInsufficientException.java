package exception;

public class BalanceInsufficientException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9122735070858421180L;

	public BalanceInsufficientException() {
		super();
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
