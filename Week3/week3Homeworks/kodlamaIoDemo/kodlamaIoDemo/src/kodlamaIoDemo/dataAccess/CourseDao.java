package nLayeredWebApp.dataAccess;

import java.util.List;
import nLayeredWebApp.entities.Course;

public interface CourseDao {
	void add(Course course);
	public List<Course> getAllCourse();
}
