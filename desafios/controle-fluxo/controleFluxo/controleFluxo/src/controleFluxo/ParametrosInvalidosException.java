package controleFluxo;

public class ParametrosInvalidosException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ParametrosInvalidosException(String message) {
		//("O segundo parâmetro deve ser maior que o primeiro");
		super(message);
	}

}