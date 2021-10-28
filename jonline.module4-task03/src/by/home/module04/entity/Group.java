package by.home.module04.entity;

import java.util.Arrays;

public class Group {

	private Student[] students;
	private int realGroupSize;

	public Group(int countOfStudents) {

		students = new Student[countOfStudents];
		realGroupSize = 0;

	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Student[] getStudents() {
		return students;
	}

	public boolean addStudent(Student newStudent) {
		if (realGroupSize == students.length)
			return false;

		students[realGroupSize] = newStudent;
		realGroupSize++;
		return true;
	}

	public Student getStudent(int indexOFStudent) {
		return students[indexOFStudent];
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((students == null) ? 0 : students.hashCode());
		result = result * prime + realGroupSize;
		return result;
	}

	@Override

	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Group other = (Group) o;
		if (!Arrays.equals(students, other.students))
			return false;
		if (realGroupSize != other.realGroupSize)
			return false;
		return true;
	}

	@Override

	public String toString() {
		return getClass().getSimpleName() + " [ students = " + Arrays.toString(students) + ", realGroupSize = "
				+ realGroupSize + " ]";
	}

}
