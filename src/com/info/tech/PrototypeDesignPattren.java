package com.info.tech;

import java.util.List;

public class PrototypeDesignPattren {
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Welcome to prototype design pattren");
		StudentDao dao = new StudentDao();
		List<Student> students = dao.getStudents();
		System.out.println("Vinodd.............");
		students.forEach(System.out::println);
		System.out.println("Vobdh>>>.");
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		List<Student> cloneData = dao.clone();
		Student student = new Student(88, "rachith");
		Student student2 = new Student(90, "bargav");
		cloneData.add(student);
		cloneData.add(student2);
		System.out.println("I AM GETTING ALL THE STUDENTS Original data DATA");
		students.forEach(System.out::println);
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		System.out.println("updated Student List");
		cloneData.forEach(System.out::println);
	}
}
