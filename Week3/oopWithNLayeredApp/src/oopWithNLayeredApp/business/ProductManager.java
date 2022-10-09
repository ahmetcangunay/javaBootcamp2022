package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

	// Bu Noktada Sadece Interface'ye Bağlıyız.
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		// Business Rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün Fiyatı 10'dan Küçük Olamaz!");
		}

		productDao.add(product);

		for (Logger logger : loggers) { // [db, mail]
			logger.log(product.getName());
		}

	}

}
