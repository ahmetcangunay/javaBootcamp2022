package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		// Instead of this

		// Set Value
		/*
		 * product1.name = "Delonghi Kahve Makinesi"; product1.imageUrl
		 * ="kahveMakinesi.jpg"; product1.unitPrice = 7500; product1.discount = 7;
		 * product1.unitsInStock = 3;
		 */

		// We use this methodology.

		product1.setName("Delonghi Kahve Makinesi");
		product1.setImageUrl("delonghiKahveMakinesi.jpg");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);

		Product product2 = new Product();
		product2.setName("Karaca Kahve Makinesi");
		product2.setImageUrl("karacaKahveMakinesi.jpg");
		product2.setUnitPrice(6800);
		product2.setDiscount(6);
		product2.setUnitsInStock(5);

		Product product3 = new Product();
		product3.setName("Sinbo Kahve Makinesi");
		product3.setImageUrl("sinboKahveMakinesi.jpg");
		product3.setUnitPrice(8000);
		product3.setDiscount(4);
		product3.setUnitsInStock(7);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {

			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("051111111");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Ahmet");
		individualCustomer.setMiddleName("Can");
		individualCustomer.setLastName("GÜNAY");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Gaming Operation (GO) Company");
		corporateCustomer.setPhone("05123154");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		
		// We could keep both of the customer class in an array, because we extended these classes from Customer class!
		Customer[] customers = {individualCustomer,corporateCustomer};
		 
		
	}

}
