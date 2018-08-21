package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        String name = input.nextLine();

        boolean isExists = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Student Name: " + students[i] + ". Position in array: " + (i + 1));
                isExists = true;
                break;
            }
        }

        if (!isExists) {
            System.out.println("Student not found!");
        }
    }
}
