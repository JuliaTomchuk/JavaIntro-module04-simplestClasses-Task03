package by.home.module04.main;

import java.util.Arrays;

import by.home.module04.entity.Group;
import by.home.module04.entity.Student;
import by.home.module04.logic.GroupLogic;
import by.home.module04.view.View;

public class Main {

	public static void main(String[] args) {
		Group group = new Group(10);

		group.addStudent(new Student("Masha", 10, new int[] { 9, 9, 9, 10, 10 }));
		group.addStudent(new Student("Pasha", 10, new int[] { 2, 2, 2, 2, 2 }));
		group.addStudent(new Student("Sasha", 9, new int[] { 9, 9, 9, 10, 10 }));
		group.addStudent(new Student("Lesha", 9, new int[] { 10, 10, 10, 10, 10 }));
		group.addStudent(new Student("Tanya", 7, new int[] { 3, 3, 3, 3, 3 }));
		group.addStudent(new Student("Lena", 4, new int[] { 9, 9, 3, 9, 9 }));
		group.addStudent(new Student("Vika", 3, new int[] { 7, 7, 7, 7, 6 }));
		group.addStudent(new Student("Katya", 2, new int[] { 6, 6, 6, 6, 6 }));
		group.addStudent(new Student("Kostya", 1, new int[] { 9, 6, 9, 10, 10 }));
		group.addStudent(new Student("Dasha", 10, new int[] { 9, 9, 9, 8, 10 }));

		System.out.println(Arrays.toString(group.getStudents()));

		GroupLogic logic = new GroupLogic();

		Student[] exellentStudents = logic.createArrayofExellentStudents(group);

		View view = new View();

		view.print(exellentStudents);

	}
}