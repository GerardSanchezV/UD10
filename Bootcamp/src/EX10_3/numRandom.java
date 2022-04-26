package EX10_3;

public class numRandom {
	
	private final int Min = 0;
	private final int Max = 999;
	
	private int numero_random;
	public numRandom() {
		this.numero_random = numeroAleatorio(Min, Max);
	}

	private int numeroAleatorio(int inferior, int superior) {
		return (int) (Math.random() * (superior - inferior)) + inferior;
	}

	public int getNumero_random() {
		return numero_random;
	}

}