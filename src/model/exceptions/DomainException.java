package model.exceptions;

public class DomainException extends Exception {
	//Quando um tipo é serializable é necessário ter uma versão (nesse caso é a versão padrão)
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
