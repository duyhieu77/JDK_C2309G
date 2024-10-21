package com.aptech.system;

import com.aptech.aprotrain.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Entering details for Student " + (i + 1) + ":");
            Student student = new Student();
            student.input();
            students.add(student);
        }
    }
    public void showStudent() {
        System.out.println("Student List:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }

    public List<Student> sortStudentByMark() {
       List<Student> sortStudentByMark =  students.stream()
               .sorted(Comparator.comparing(Student::getMark).reversed())
               .toList();
        sortStudentByMark.forEach(student -> student.display());
        return sortStudentByMark;
    }
}