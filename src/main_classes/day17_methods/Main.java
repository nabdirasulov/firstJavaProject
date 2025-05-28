package main_classes.day17_methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayHi10Times();
        checkIsEven();

    }

    public static void sayHi10Times() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi new User!");
        }
        System.out.println("----------------------------");
    }

    public static void checkIsEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scanner.nextInt();
        if (input % 2 == 0){
            System.out.println(input);
        }else {
            System.out.println("Error");
        }
    }
}
