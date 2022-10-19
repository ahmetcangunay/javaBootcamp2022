package nLayeredWebApp.business;

import nLayeredWebApp.core.logging.Logger;
import nLayeredWebApp.dataAccess.InstructorDao;
import nLayeredWebApp.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	int count;

	public void add(Instructor instructor) throws Exception {
		if (instructor.getName() == "" || instructor.getSurname() == "") {
			throw new Exception("Missing informations.");
		} else {
			count++;
			System.out.println("\n" + "Instructor number: " + count);
			System.out.println("---------------------------------------");
			instructorDao.add(instructor);

			for (Logger logger : loggers) {
				logger.log(instructor.getName() + " " + instructor.getSurname());
			}
		}
	}
}
