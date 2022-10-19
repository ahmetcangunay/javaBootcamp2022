package nLayeredWebApp.business;

import nLayeredWebApp.core.logging.Logger;
import nLayeredWebApp.dataAccess.CategoryDao;
import nLayeredWebApp.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	int count;

	public void add(Category category) throws Exception {
		for (Category c : categoryDao.getAllCategories()) {
			if ((c.getCategoryName()) == (category.getCategoryName())) {
				throw new Exception("This category already exists.");
			}
		}
		if (category.getCategoryName() == "") {
			throw new Exception("Missing information.");
		} else {
			for (Category c : categoryDao.getAllCategories()) {
				if (c.getCategoryName().equals(category.getCategoryName())) {
					throw new Exception("This category already exists.");
				}
			}
			count++;
			System.out.println("\n" + "Category number: " + count);
			System.out.println("---------------------------------------");
			categoryDao.add(category);
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
		}

	}
}
