
public class Main {
	public static void main(String[] args) {
		SavingsBond bonds = new SavingsBond(15000, 12); 
		System.out.println("Uang Setelah kenaikan bunga: " + bonds.calculateFutureValue());
	}
}
