package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

	private List<Student> studentList = new ArrayList<>();

	@Override
	public void addStudent(Student student) {
		studentList.add(student);
		System.out.println("Student added successfully.");
	}

	@Override
	public void displayAllStudents() {
		if (studentList.isEmpty()) {
			System.out.println("No students available.");
			return;
		}

		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	@Override
	public Student searchStudentById(int studentId) {

	    for (Student student : studentList) {
	        if (student.getStudentId() == studentId) {
	            return student;
	        }
	    }
	    return null;
	}
}
