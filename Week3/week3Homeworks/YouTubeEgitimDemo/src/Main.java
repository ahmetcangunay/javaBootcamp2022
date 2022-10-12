
public class Main {

	public static void main(String[] args) {

		// Example 1
		int number1 = 10;
		int number2 = 20;

		number1 = number2;
		number2 = 100;

		System.out.println(number1);

		// Example 2
		int[] numbers = { 1, 2, 3 };
		int[] numbers2 = { 10, 20, 30 };

		numbers = numbers2;
		numbers2[0] = 1000;

		System.out.println(numbers[0]);

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "İstanbul";

		CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
		customerManager.giveCredit();
		customerManager.addCustomer();
		customerManager.deleteCustomer();

		Company company = new Company();
		company.setTaxNumber("123456897564");
		company.setCompanyName("Arçelik");
		company.id = 1000;
		System.out.println(company.getTaxNumber());

		Person person = new Person();
		person.setFirstName("Ahmet");

		CustomerManager customerManager2 = new CustomerManager(person, new TeacherCreditManager());

		customerManager2.giveCredit();

		person.setNationalIdentity("112035468");
		System.out.println(person.getNationalIdentity());

	}

}
