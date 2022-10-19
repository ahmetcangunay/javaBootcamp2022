package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepositry {

	@Override
	public void add() {

		System.out.println("My SQL'e eklendi.");
	}

}
