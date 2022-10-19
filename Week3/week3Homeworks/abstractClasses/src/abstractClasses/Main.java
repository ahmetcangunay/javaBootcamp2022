package abstractClasses;

public class Main {

	public static void main(String[] args) {

		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculatePoint();
		womanGameCalculator.gameOver();

		// We can not "new" the abstract class. Abstract classes can also be used for
		// hiding the base class.
		GameCalculator gameCalculator = new WomanGameCalculator();
		
	}

}
