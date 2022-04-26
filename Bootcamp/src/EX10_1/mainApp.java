package EX10_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainApp {

	public static void main(String[] args) {
		NumAleatorio x = new NumAleatorio();
		int numero = 0;
		int intentos = 0;

		
		boolean checkNumero = false;
		Scanner sc = new Scanner(System.in);
		do {	
			try {

				System.out.println("Introduce un valor entero del 1 al 500:");
				numero = sc.nextInt();
				x.setIntentos(++intentos);
				if(x.getNumero() == numero) {
					checkNumero = true;
					System.out.println("Enhorabuena, has adivinado el n�mero secreto");
				}else if(x.getNumero() > numero) {
					System.out.println("Incorrecto, prueba otra vez con un n�mero m�s grande");
					
				}else{
					System.out.println("Incorrecto, prueba otra vez con un n�mero m�s peque�o");
					
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Solo se aceptan n�mero enteros.");
				x.setIntentos(++intentos);
				sc.next();
			
			}
		
		}while(!checkNumero);
		sc.close();
		System.out.println(x);
			
		;
	}

}