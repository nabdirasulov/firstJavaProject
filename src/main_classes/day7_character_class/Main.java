package main_classes.day7_character_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some word or letter: ");
        char symbol = scanner.next().charAt(0);
        System.out.println("Entered symbol: " + symbol);

        boolean isLetter = Character.isLetter(symbol);
        System.out.println("is it letter? -> " + isLetter);
        System.out.println("is it letter? -> " + Character.isLetter(symbol));

        boolean isDigit = Character.isDigit(symbol);
        System.out.println("is it digit? -> " + isDigit);
        System.out.println("is it digit? -> " + Character.isDigit(symbol));


        boolean isUpperCase = Character.isUpperCase(symbol);
        System.out.println("is it upper case? -> " + isUpperCase);
        System.out.println("is it upper case? -> " + Character.isUpperCase(symbol));

        boolean isLowerCase = Character.isLowerCase(symbol);
        System.out.println("is it lower case? -> " + isLowerCase);
        System.out.println("is it lower case? -> " + Character.isLowerCase(symbol));

        char upperCasedSymbol = Character.toUpperCase(symbol);
        System.out.println("Uppercased symbol -> " + upperCasedSymbol);
        System.out.println("Uppercased symbol -> " + Character.toUpperCase(symbol));

        char lowerCasedSymbol = Character.toLowerCase(symbol);
        System.out.println("Uppercased symbol -> " + lowerCasedSymbol);
        System.out.println("Uppercased symbol -> " + Character.toLowerCase(symbol));




    }
}
