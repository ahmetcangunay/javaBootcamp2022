
public class CustomerManager {

	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {

		_customer = customer;
		_creditManager = creditManager;
	}

	public void addCustomer() {
		System.out.println("Müşteri Eklendi : " + _customer);
	}

	public void deleteCustomer() {
		System.out.println("Müşteri Silindi : " + _customer);
	}

	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi Verildi");
	}
}
