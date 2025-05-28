package main_classes.day12_while_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int input = 0;
//        while (input != 10) {
//            System.out.println("Enter number 10");
//            input = scanner.nextInt();
//            if (input == 10){
//                System.out.println("Finally you entered 10!");
//            }
//        }

        int userInput = 1;
        while(userInput % 2 != 0){
            System.out.println("Enter number even number");
            userInput = scanner.nextInt();
            if (userInput % 2 == 0){
                System.out.println("You finally entered even number!");
            }
        }


    }
}
