package nLayeredWebApp.dataAccess;

import java.util.List;
import nLayeredWebApp.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	public List<Instructor> getAllInstructors();
}
