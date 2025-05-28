package main_classes.day6_scanner_class;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------nextDouble()-----------------------");
        System.out.print("Enter decimal number: ");
        double inputNumber = scanner.nextDouble();

        System.out.println("The sum -> " + (inputNumber + 100));
        System.out.println("You entered : " + inputNumber);

        System.out.println("-----------------------nextLine()-----------------------");
        System.out.print("Enter some text: ");
        scanner.nextLine();
        String inputText = scanner.nextLine(); // <- user enters value here Hello world
        System.out.println(inputText.charAt(0));
        System.out.println(inputText.isEmpty());
        System.out.println(inputText.toUpperCase());
        System.out.println("Result message -> " + inputText);

        System.out.println("-----------------------next()-----------------------");
        System.out.println("Enter single word: ");
        String singleWord = scanner.next();
        System.out.println(singleWord.charAt(0));
        System.out.println(singleWord.isEmpty());
        System.out.println(singleWord.toUpperCase());
        System.out.println("Your entered value: " + singleWord);

        System.out.println("-----------------------nextBoolean()-----------------------");
        System.out.println("Enter true or false! ");
        boolean inputValue = scanner.nextBoolean();
        System.out.println("Your entered value: " + inputValue);

        System.out.println("-----------------------nextInt()-----------------------");
        System.out.println("Enter int number: ");
        int wholeNumberInput = scanner.nextInt();
        System.out.println("Your entered whole number: " + wholeNumberInput);

        scanner.close();



    }
}
