package nLayeredWebApp.dataAccess;

import java.util.List;
import nLayeredWebApp.entities.Category;

public interface CategoryDao {
	void add(Category category);
	public List<Category> getAllCategories();
}
