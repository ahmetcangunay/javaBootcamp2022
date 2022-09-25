package reCapDemo_Classes;

public class FourOperations {

	public int summation(int... numbers) {

		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;

	}

	public int subtraction(int number1, int number2) {
		return number1 - number2;
	}

	public int multiplication(int... numbers) {
		int result = 1;
		for (int number : numbers) {
			result *= number;
		}
		return result;
	}

	public int division(int number1, int number2) {
		return number1 / number2;
	}

}
