package nLayeredWebApp.dataAccess;

import java.util.ArrayList;
import java.util.List;
import nLayeredWebApp.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
	private List<Category> categories = new ArrayList<>();
	@Override
	public void add(Category category) {
		categories.add(category);
		System.out.println("Added to database with Hibernate.");
	}
	@Override
	public List<Category> getAllCategories() {
		return categories;
	}
}
