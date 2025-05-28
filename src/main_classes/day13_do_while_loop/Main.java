package main_classes.day13_do_while_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 1;
//        do {
//            System.out.println("Good morning everyone! " + i);
//            i++;
//        }while (i <= 10);


        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter number 10");
            userInput = scanner.nextInt();
        }while (userInput != 10);
        System.out.println("Finally you entered 10!");


    }
}
