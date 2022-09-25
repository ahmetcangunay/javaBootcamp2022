package classes;

public class Main {

	public static void main(String[] args) {

		// Classes are reference types.

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;

		customerManager.addCustomer();
		customerManager.deleteCustomer();
		customerManager.updateCustomer();

		// NOTE: Primitive numerical types (int, double, float, byte) are value types.
		// These are just in stack. (not heap)

		// Example
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		// NOTE 2: Arrays are reference type!

		// Example 2
		int[] numbers = { 1, 2, 3 };
		int[] numbers2 = { 4, 5, 6 };
		numbers2 = numbers;
		numbers[0] = 10;
		System.out.println(numbers2[0]);

	}

}
