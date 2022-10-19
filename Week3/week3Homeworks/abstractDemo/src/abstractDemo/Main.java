package abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new OracleDatabaseManager();
		customerManager.getCustomers();

		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.baseDatabaseManager = new SqlServerDatabaseManager();
		customerManager2.getCustomers();

		CustomerManager customerManager3 = new CustomerManager();
		customerManager3.baseDatabaseManager = new MySqlDatabaseManager();
		customerManager3.getCustomers();

	}

}
