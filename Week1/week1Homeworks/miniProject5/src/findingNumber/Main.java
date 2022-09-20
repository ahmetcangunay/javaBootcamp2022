package findingNumber;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 5, 7, 9, 0 };
		int desiredNumber = 2;
		boolean isFound = false;

		for (int number : numbers) {

			if (number == desiredNumber) {

				isFound = true;
				break;

			}

		}

		if (isFound) {
			System.out.println("We have found the desired number.");
		} else {
			System.out.println("We could not the desired number.");
		}

	}

}
