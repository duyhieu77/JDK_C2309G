package com.aptech.aprotrain;

import java.util.Scanner;

public class Student implements IStudent {

    private int id;
    private String fullname;
    private String email;
    private float mark;

    public Student(){;}
    public Student(int id, String fullname, String email, float mark) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Full Name: ");
        this.fullname = scanner.nextLine();

        System.out.print("Enter Email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter Mark: ");
        this.mark = scanner.nextFloat();
    }

    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullname);
        System.out.println("Email: " + email);
        System.out.println("Mark: " + mark);
    }
}
