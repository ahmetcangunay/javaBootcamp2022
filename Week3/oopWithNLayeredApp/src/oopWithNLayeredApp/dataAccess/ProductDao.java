package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {

	// Birbirinin Alternatifi Olan Durumlarda (JDBC & Hibernate gibi) Interface
	// Kullanılır.

	// Interfaceler Sadece Metod İmzası Barındırabilir.
	// İlgili Sınıflar Interfacenin Kurallarına Uymak Zorundadır.

	// Bir Katman() Başka Bir Katmanın Class'ını Kullanıyorken Sadece Interface'nden
	// Erişim Kurmalıdır.
	void add(Product product);

}
