package main_classes.day15_array;

import java.util.Arrays;

public class PracticeSort {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Toyota", "Mercedes", "Tesla", "Akura"};
        Arrays.sort(cars);
        String output = Arrays.toString(cars);
        System.out.println(output);


        int[] numbers = {23, 24, 3, 4, 564, 325, 0, 4, 35, 23};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        int[] nums = {23, 423, 4, 45, 54, 756, 87, 6, 8, 42, 43, 5234, 5, 12, 90, 354, 4235436, 76, 7};

        boolean isContains54 = false;
        boolean isContains90 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 90) {
                isContains90 = true;
            }

            if (nums[i] == 54) {
                isContains54 = true;
            }
        }

        if (isContains54 && isContains90) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }





    }
}
