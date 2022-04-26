package EX10_3;

import EX10_Exception.ExcepcionesRandom;

public class mainApp {

	public static void main(String[] args) throws ExcepcionesRandom {
		
		try {
		System.out.println("Generando número aleatorio...");
		numRandom num_random1 = new numRandom();
		System.out.println("El numero aleatorio generado es: "+num_random1.getNumero_random());
		{
			throw new ExcepcionesRandom(num_random1.getNumero_random());
		}
		}catch (ExcepcionesRandom e) {
			System.out.println(e.getMessage());
		}

	}

}