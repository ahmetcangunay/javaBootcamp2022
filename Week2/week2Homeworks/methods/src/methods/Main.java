package methods;

public class Main {

	public static void main(String[] args) {

		findingNumber();
	}

	public static void findingNumber() {

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

			giveMessage("We have found the desired number. " + desiredNumber);

		} else {

			giveMessage("We could not the desired number. " + desiredNumber);

		}
	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}

}
