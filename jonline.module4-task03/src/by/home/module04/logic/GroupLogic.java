package by.home.module04.logic;

import by.home.module04.entity.Group;
import by.home.module04.entity.Student;

public class GroupLogic {
	
	private StudentLogic logic = new StudentLogic();

	public Student[] createArrayofExellentStudents(Group group) {

		Student[] students = group.getStudents();

		Student[] exellentStudents = new Student[countExellentStudents(students)];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (logic.isStudentExellent(students[i])) {

				exellentStudents[index] = students[i];
				index++;
			}

		}
		return exellentStudents;

	}

	private int countExellentStudents(Student[] students) {

		int counter = 0;
		for (int i = 0; i < students.length; i++) {
			if (logic.isStudentExellent(students[i])) {
				counter++;
			}
		}
		return counter;
	}

}
