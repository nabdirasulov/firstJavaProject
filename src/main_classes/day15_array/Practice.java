package main_classes.day15_array;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        if (num1.length > 1) {
            if (num1[0] == num1[num1.length - 1]) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

        int[] num2 = {1, 2, 3, 1};
        if (num2.length > 1) {
            if (num2[0] == num2[num2.length - 1]) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

        System.out.println(Arrays.toString(num2));




    }
}
