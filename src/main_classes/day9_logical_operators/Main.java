package main_classes.day9_logical_operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        // true       ||     true
        if (age >= 18 || number < 100) {
            System.out.println("You're allowed to enter!");
        }

        if (number != age) {
            System.out.println("These numbers are not equal!");
        }
        scanner.nextLine();
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        if (!text.isEmpty()){
            System.out.println(text.charAt(0));
            System.out.println(text);
        }else {
            System.out.println("Your text is empty!");
        }





    }
}
