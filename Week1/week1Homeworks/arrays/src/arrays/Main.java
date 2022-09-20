package arrays;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String[] students = new String[3];

		students[0] = "Ahmet";
		students[1] = "Onur";
		students[2] = "Berkay";

		// "ArrayIndexOutOfBoundsException" Error
		// students[3] = "Selim";

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i]);
		}

		// Second iteration method (student iterates all array)
		for (String student : students) {

			System.out.println(student);

		}

	}

}
