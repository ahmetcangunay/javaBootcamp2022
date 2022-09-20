package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] numbers = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = numbers[0];

		for (double number : numbers) {

			total += number;
			System.out.println(number);

			if (number > max) {
				max = number;
			}
		}

		System.out.println("Total: " + total);
		System.out.println("Max: " + max);

	}

}
