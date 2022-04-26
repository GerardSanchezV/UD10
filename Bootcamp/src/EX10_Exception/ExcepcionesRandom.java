package EX10_Exception;

public class ExcepcionesRandom extends Exception {

	private String mensaje;
	private int numero_random;

	public ExcepcionesRandom(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public ExcepcionesRandom(int numero_random) {
		super();
		this.numero_random = numero_random;
	}
	
	public String getMessage() {

		if (this.numero_random % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}

	}

	public String toString() {
		return mensaje;
	}

}