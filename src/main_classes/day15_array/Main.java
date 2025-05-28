package main_classes.day15_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Toyota", "Mercedes", "Tesla"};

        System.out.println("Hello guys " + Arrays.toString(cars));
//        for (int i = 0; i < cars.length; i++) {
//            System.out.print(cars[i] + ", ");
//        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number for index -> " + i + " : ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + ", ");
//        }

        System.out.println();

        int[] nums = {234, 34, 23, 4, 1234};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        System.out.println();
        String[] texts = new String[20];
        texts[5] = "Hello";
        texts[10] = "Codewise";
        texts[0] = "Hi";
        for (int i = 0; i < texts.length; i++) {
            System.out.print(texts[i] + ", ");
        }
        System.out.println();

        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }

    }

}
