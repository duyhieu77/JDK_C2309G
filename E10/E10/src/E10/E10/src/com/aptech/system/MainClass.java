package com.aptech.system;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        StudentManagement studentManagement = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Add New");
            System.out.println("2. Show All");
            System.out.println("3. Sort");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManagement.addStudent();
                    break;
                case 2:
                    studentManagement.showStudent();
                    break;
                case 3:
                    studentManagement.sortStudentByMark();
                    System.out.println("Students sorted by marks.");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        scanner.close();
    }
}