package by.home.module04.entity;

import java.util.Arrays;


public class Student {

	private String fullName;
	int groupNumber;
	private int[] academicPerformance;

	public Student() {
		fullName = null;
		groupNumber = 0;
		academicPerformance = null;
	}

	public Student(String fullName, int groupNumber, int[] academicPerformance) {
		this.fullName = fullName;
		this.groupNumber = groupNumber;
		this.academicPerformance = academicPerformance;

	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(academicPerformance);
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + groupNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (!Arrays.equals(academicPerformance, other.academicPerformance))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[ fullName " + fullName + ", groupNumber=" + groupNumber
				+ ", academicPerformance=" + Arrays.toString(academicPerformance);

	}

}
