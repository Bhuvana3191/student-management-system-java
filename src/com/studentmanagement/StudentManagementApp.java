package com.studentmanagement;

import java.util.Scanner;

public class StudentManagementApp {

	public static void main(String[] args) {

		StudentService studentService = new StudentServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
           
			System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
            
            case 1:
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume newline

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                studentService.addStudent(new Student(id, name, age, course));
                System.out.println("Student added successfully!");
                break;

            case 2:
                System.out.println("\n--- All Students ---");
                studentService.displayAllStudents();
                break;

            case 3:
                System.out.print("Enter Student ID to search: ");
                int searchId = sc.nextInt();

                Student student = studentService.searchStudentById(searchId);
                if (student != null) {
                    System.out.println(student);
                } else {
                    System.out.println("Student not found");
                }
                break;

            case 4:
                System.out.println("Exiting application. Thank you!");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice. Please try again.");

            }

		}
		
	}
}
