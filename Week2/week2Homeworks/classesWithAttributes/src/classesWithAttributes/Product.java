package classesWithAttributes;

public class Product {

	// Attributes or Fields

	// Private means these fields just valid in this scope.
	private int id;
	private String name;
	private String description;
	private double price;
	private int unitInStock;
	private String productCode;

	// Constructor
	public Product(int id, String name, String description, double price, int unitInStock) {

		System.out.println("Product constructor worked.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.unitInStock = unitInStock;
	}

	public Product() {
		// Constructor Overloading!
	}

	// Getter
	public int getId() {
		return id;
	}

	// Setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getProductCode() {
		return name.substring(0, 1) + id;
	}

}
