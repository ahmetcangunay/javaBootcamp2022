package nLayeredWebApp.business;

import nLayeredWebApp.core.logging.Logger;
import nLayeredWebApp.dataAccess.CourseDao;
import nLayeredWebApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	int count;

	public void add(Course course) throws Exception {
		for (Course c : courseDao.getAllCourse()) {
			if ((c.getCourseName()) == (course.getCourseName())) {
				throw new Exception("This course already exists.");
			}
		}
		if (course.getCoursePrice() < 0) {
			throw new Exception("Course price cannot be less than 0.");
		} else if (course.getCourseName() == "") {
			throw new Exception("Missing information.");
		} else {
			count++;
			System.out.println("\n" + "Course number: " + count);
			System.out.println("---------------------------------------");
			courseDao.add(course);

			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}

	}

}
