package polymorphismDemo;

public class CustomerManager {

	private BaseLogger logger;

	public CustomerManager(BaseLogger baseLogger) {

		this.logger = baseLogger;

	}

	public void addCustomer() {

		System.out.println("Customer Added!");
		this.logger.log("Log Message");

	}

}
