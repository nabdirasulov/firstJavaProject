package main_classes.day8_if_else;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        if (input > 10) {
            System.out.println("It's big");
        } else {
            System.out.println("It's small");
        }

        if (input % 2 == 0) {
            System.out.println("It's even number");
        } else {
            System.out.println("It's odd number");
        }


        System.out.println("----------------------------------------");
        System.out.print("Enter number: ");
        int score = scanner.nextInt();
        //  74
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Failed");
        }
    }
}
