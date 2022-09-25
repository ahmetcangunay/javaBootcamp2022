package inheritance;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();

		customer.age = 25;
		employee.id = 1;

		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

		employeeManager.bestEmployee();
		customerManager.add();
	}

}
