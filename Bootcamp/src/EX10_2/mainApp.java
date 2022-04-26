package EX10_2;
 
import EX10_Exception.ExceptionClass;

public class mainApp {

	public static void main(String[] args) {

		try {
			System.out.println("Hola Mundo");
			ExceptionClass eCustom = new ExceptionClass(404, "PAGINA NO ENCONTRADA");
			eCustom.generadorExcepciones();
		} catch (ExceptionClass e) {
			System.out.println(e.getMessage());
		}

	}

}