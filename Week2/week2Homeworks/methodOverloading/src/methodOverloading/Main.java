package methodOverloading;

public class Main {

	public static void main(String[] args) {

		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.sum(3, 5));
		System.out.println(fourOperations.sum(3, 5, 7));

	}

}
