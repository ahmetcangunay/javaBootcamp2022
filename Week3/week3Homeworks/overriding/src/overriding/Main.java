package overriding;

public class Main {

	public static void main(String[] args) {

		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new LecturerCreditManager(),
				new AgricaltureCreditManager(), new StudentCreditManager() };

		for (BaseCreditManager credit : creditManagers) {

			System.out.println(credit.calculate(1000));

		}

	}

}
