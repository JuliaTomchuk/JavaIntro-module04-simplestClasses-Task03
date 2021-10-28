package by.home.module04.view;

import by.home.module04.entity.Student;

public class View {
	public View() {

	}

	public void print(Student[] students) {

		for (Student student : students) {
			System.out
					.println(" Имя студента: " + student.getFullName() + " номер группы : " + student.getGroupNumber());

		}

	}

}
