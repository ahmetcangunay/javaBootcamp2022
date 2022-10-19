package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Asus Laptop", 7500, 50);

		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(7500);
		product.setUnitInStock(50);

		ProductManager productManager = new ProductManager();
		productManager.addProduct(product);

		System.out.println(product.getId());
		System.out.println(product.getProductCode());
	}

}
