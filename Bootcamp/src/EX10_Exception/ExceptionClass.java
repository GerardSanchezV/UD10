package EX10_Exception;

public class ExceptionClass extends Exception {

		private int codigoException;
		private String eMensaje;

		public ExceptionClass(int codigoException, String eMensaje) {
			this.codigoException = codigoException;
			this.eMensaje = eMensaje;
		}

		public void generadorExcepciones() throws ExceptionClass {
			throw new ExceptionClass(codigoException, eMensaje);
		}

		public String getMessage() {
			String eMessage = "";
			switch (codigoException) {
			case 404:
				eMessage = "ERROR 404! " + eMensaje;
			}

			return eMessage;
		}
	}