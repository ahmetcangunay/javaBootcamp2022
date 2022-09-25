package methods2;

public class Main {

	public static void main(String[] args) {

		int number = sum(5, 7);
		System.out.println(number);

		String city = giveACity();
		System.out.println(city);

		int sum = sum2(2, 3, 4, 5, 6, 10);
		System.out.println("Sum: " + sum);
	}

	// ----------------------------------Part 1---------------------------------

	public static void addCustomer() {

		System.out.println("Added!");

	}

	public static void deleteCustomer() {

		System.out.println("Deleted!");

	}

	public static void updateCustomer() {

		System.out.println("Updated!");

	}

	private static int sum(int number1, int number2) {
		return number1 + number2;
	}

	private static String giveACity() {
		return "Ankara";
	}

	// ----------------------------------Part 2---------------------------------

	// "int..." works as an int array and we can pass numbers as many as we
	// want.(Like an array.)
	public static int sum2(int... numbers) {
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
