# Student Management System (Core Java)

## Description

A menu-driven console application built using Core Java to manage student records.
The application allows users to add, view, and search student details using in-memory data storage.

## Features

- Add student
- Display all students
- Search student by ID
- Menu-driven console interface
- Clean service-layer design using interfaces

## Technologies Used

- Java (Core Java)
- OOP concepts
- Collections (ArrayList)

## Sample SQL Design (Conceptual)

> Note: This project currently uses in-memory data structures.
> The following SQL is a conceptual design to demonstrate database understanding.

```sql
CREATE TABLE student (
  student_id INT PRIMARY KEY,
  name VARCHAR(50),
  age INT,
  course VARCHAR(50)
);

SELECT * FROM student WHERE student_id = ?;
```
