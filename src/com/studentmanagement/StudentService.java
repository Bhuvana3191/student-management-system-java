package com.studentmanagement;

public interface StudentService {
	
	void addStudent(Student student);
	
	void displayAllStudents();
	
	Student searchStudentById(int studentId);

}
