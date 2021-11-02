package by.home.module04.logic;

import by.home.module04.entity.Student;

public class StudentLogic {
	
	public boolean isStudentExellent(Student student) {

		
		for (int i = 0; i < student.getAcademicPerformance().length; i++) {
			if (student.getAcademicPerformance()[i] < 9)
				return false;
		}
		
		return true;

	}
}
