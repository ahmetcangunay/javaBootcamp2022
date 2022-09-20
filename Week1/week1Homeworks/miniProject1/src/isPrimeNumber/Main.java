package isPrimeNumber;

public class Main {

	public static void main(String[] args) {

		int number = 11;
		boolean isPrime = true;

		if (number == 1 || number < 1) {
			System.out.println(number + " is not a prime number.");
			return;
		}

		for (int i = 2; i < number; i++) {

			if ((number % i) == 0) {
				isPrime = false;
				break;
			}

		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}

}
