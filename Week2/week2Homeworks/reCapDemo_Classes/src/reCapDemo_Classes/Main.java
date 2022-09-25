package reCapDemo_Classes;

public class Main {
	// Main intension of classes is keep the common operations.
	public static void main(String[] args) {

		FourOperations fourOperations = new FourOperations();

		int sum_result = fourOperations.summation(3, 4, 5, 6);
		int subs_result = fourOperations.subtraction(15, 10);
		int multip_result = fourOperations.multiplication(8, 6, 9, 4);
		int div_result = fourOperations.division(15, 5);

		System.out.println(sum_result);
		System.out.println(subs_result);
		System.out.println(multip_result);
		System.out.println(div_result);
	}

}
