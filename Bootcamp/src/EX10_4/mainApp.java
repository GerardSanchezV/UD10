package EX10_4;


	import java.util.InputMismatchException;
	import java.util.Scanner;

	import EX10_Exception.ExcepcionesRandom;
	import EX10_Exception.ExceptionClass;
	import EX10_Exception.OperationClass;

	

	public class mainApp {
		
		public static Double num 	=0.0;
		public static Double num2	=0.0;
		public static int opcion 	= 0;
		public static Scanner scan = new Scanner(System.in);

		public static void main(String[] args) {
			
			menu();
			
		}

		private static void menu() {
			do {
				System.out.println("Que operaci�n quieres utilizar");
				System.out.println("1-Suma\n2-Resta\n3-Multiplicaci�n\n4-Potencia"
						+ "\n5-Ra�z cuadrada\n6-Ra�z c�bica\n7-Divisi�n");
				try {
					opcion = scan.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Opci�n no v�lida\n");
					scan.nextLine();
				}
			}while(opcion>8||opcion<1);
			switch(opcion){
			case 1://Suma
				num 	= setNumberDouble();
				num2 	= setNumberDouble();
				
				System.out.println("El resultado de la suma es: "
				+OperationClass.suma(num, num2));
				break;
			case 2://Resta
				num 	= setNumberDouble();
				num2 	= setNumberDouble();
				
				System.out.println("El resultado de la resta es: "
				+OperationClass.resta(num, num2));
				break;
			case 3://Multiplicaci�n
				num 	= setNumberDouble();
				num2 	= setNumberDouble();
				
				System.out.println("El resultado de la multiplicacion es: "
				+OperationClass.multiplicacion(num, num2));
				break;
			case 4://Potencia
				num 	= setNumberDouble();
				num2 	= setNumberDouble();
				
				System.out.println("El resultado de la potencia es: "
				+OperationClass.potencia(num, num2));
				break;
			case 5://Ra�z cuadrada
				num 	= setNumberDouble();
				
				try {
					if(num<0) {
						throw new InputMismatchException();
					}
					
				}catch(InputMismatchException e) {
					System.out.println(e);
					break;
				}

				System.out.println("El resultado de la ra�z cuadrada es: "
				+OperationClass.raizCuadrada(num));
				break;
			case 6://Ra�z Cubica
				num 	= setNumberDouble();
				try {
					if(num<0) {
						throw new InputMismatchException();
					}
					
				}catch(InputMismatchException e) {
					System.out.println(e);
					break;
				}
				
				System.out.println("El resultado de la ra�z c�bica es: "
				+OperationClass.raizCuadrada(num));
				break;
			case 7://Divisi�n
				num 	= setNumberDouble();
				num2 	= setNumberDouble();
				
				System.out.println("El resultado de la Divisi�n es: "
				+OperationClass.division(num, num2));
				break;
			}
		}
	private static Double setNumberDouble() {
		boolean flag=false;
		Double retorno = 0.0;
		do {
			try {
				System.out.println("Introduce un n�mero");
				retorno = scan.nextDouble();
				flag = true;
			}catch(InputMismatchException e) {
				System.out.println(e);
				System.out.println("Formato de n�mero no correcto, recuerda que los doubles usan \",\"");
				scan.nextLine();
			}
		}while(!flag);
		
		return retorno;
	}
		
	}