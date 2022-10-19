package nLayeredWebApp.dataAccess;

import java.util.ArrayList;
import java.util.List;
import nLayeredWebApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	private List<Instructor> instructors = new ArrayList<>();
	@Override
	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Added to database with Hibernate.");
	}
	@Override
	public List<Instructor> getAllInstructors() {
		return instructors;
	}
}
