package nLayeredWebApp;

import nLayeredWebApp.business.CategoryManager;
import nLayeredWebApp.business.CourseManager;
import nLayeredWebApp.business.InstructorManager;
import nLayeredWebApp.core.logging.DatabaseLogger;
import nLayeredWebApp.core.logging.FileLogger;
import nLayeredWebApp.core.logging.EmailLogger;
import nLayeredWebApp.core.logging.Logger;
import nLayeredWebApp.dataAccess.HibernateCourseDao;
import nLayeredWebApp.dataAccess.HibernateInstructorDao;
import nLayeredWebApp.dataAccess.JdbcCategoryDao;
import nLayeredWebApp.entities.Category;
import nLayeredWebApp.entities.Course;
import nLayeredWebApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		Instructor instructor1 = new Instructor(1, "Name", "Surname");

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);

		Category category1 = new Category(1, "Web Programming");

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);

		Course course1 = new Course(1, "Java", 250);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

	}

}
