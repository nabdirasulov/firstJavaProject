package main_classes.day14_break_and_continue;

import java.util.Scanner;

public class ContinuePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("enter exit if you wanna quit, or skip if you wanna skip current iteration");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("skip")) {
                System.out.println("You skipped current iteration!");
                continue;
            }

            System.out.println("Hello from the rest part of loop!");
            System.out.println("You entered " + input);
        } while (!input.equalsIgnoreCase("exit"));


    }
}
