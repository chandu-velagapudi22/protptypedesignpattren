package com.info.tech;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements Cloneable {
	public static List<Student> studentList;
	static {
		studentList = new ArrayList<>();
		Student student = new Student(10, "naveen");
		Student student1 = new Student(5, "sai");
		Student student2 = new Student(6, "ramesh");
		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);
	}

	public List<Student> getStudents() {
		return studentList;

	}

	public List<Student> clone() throws CloneNotSupportedException {
		System.out.println("***************");
		System.out.println("I  am in clone data");
		ArrayList<Student> list = new ArrayList<>();
		for (Student student : list) {
			list.add(student);
		}
		System.out.println("**********");
		return list;

	}
}
