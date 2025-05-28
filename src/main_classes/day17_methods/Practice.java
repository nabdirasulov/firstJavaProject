package main_classes.day17_methods;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] array = {100, 2, 33, 44, 5};
        int max = findMax(array);
        System.out.println(max);

        printEachCharInNewLine("Hello");

        double average = findAverage(12, 36, 3);
        System.out.println(average);
        double average1 = findAverage(10, 3, 3);
        System.out.println(average1);

        reverse("Codewise");


        String response = reverse1("Hello");
        System.out.println(response);

        String result = checkIsPositive(50);
        System.out.println(result);

        System.out.println(checkIsPositive(0));
        System.out.println(checkIsPositive(-10));
    }

    public static int findMax(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static void printEachCharInNewLine(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static double findAverage(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return (double) sum / 3;
    }

    public static void reverse(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    public static String reverse1(String text) {
        String reverseResult = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseResult += text.charAt(i);
        }
        return reverseResult;
    }

    public static String checkIsPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

}
