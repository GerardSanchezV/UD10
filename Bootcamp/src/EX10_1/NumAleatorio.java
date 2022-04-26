package EX10_1;

import java.util.Random;


public class NumAleatorio {

		int numero;
		int intentos;
		int NumAleatorio; 

		int min = 1;
		int max = 500;

		public NumAleatorio() {
			this.numero = generarNumero();
			this.intentos = 0;
		}

		public NumAleatorio(int min, int max) {
			this.min = min;
			this.max = max;
			this.numero = generarNumero();
			this.intentos = 0;
		}

		public int generarNumero() {
			Random r = new Random();
			return (r.nextInt(max)+min);
		}


		public String toString() {
			return "El numero generado es " + numero + ", te ha llevado " + intentos + " intentos.";
		}		
		public int getIntentos() {
			return intentos;
		}
		public void setIntentos(int intentos) {
			this.intentos = intentos;
		}
		public int getNumero() {
			return numero;
		}
		public boolean calcularPar() {			
			if(this.numero%2 == 0) {
				return true;
			}else {
				return false;
			}
			
		}
		
	}
