package main_classes.day14_break_and_continue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;

        do{
            System.out.println("Enter a word: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("stop")){
                System.out.println("Loop emergency stopped!");
                break;
            }
            System.out.println("Cycle number - " + counter);
            counter++;
        }while (true);

    }
}
