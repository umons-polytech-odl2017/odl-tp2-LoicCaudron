package exercise2;

public class ProductionWorker implements Payable {
	private int retribution;
	private int production = 0;

	// Constructeurs
	public ProductionWorker(int r) {
		retribution = r;
	}

	// Méthodes
	public void produceOnePiece() {
		production++;
	}

	public int computeSalary() {
		return retribution * production;
	}
}
