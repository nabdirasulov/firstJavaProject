package main_classes.day15_array;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {234, 2, 34, 6, 52, 6, 5, 4, 7, 43, 7, 1234, 521, 4, 234, 23};
        Arrays.sort(array);
        System.out.println("Comes from first -  " + array[0]);
        System.out.println("Comes from first -  " + array[array.length - 1]);

        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[0] && array[i] != array[array.length - 1]) {
                sum1 += array[i];
            }
        }
        System.out.println("Sum - " + sum1);
        System.out.println("Average - " + ((double)sum1 / (array.length - 2)));

        System.out.println("-------------------------------------------------");

        int[] array2 = {234, 2, 34, 6, 52, 6, 5, 4, 7, 43, 7, 1234, 521, 4, 234, 23};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];
            }
            if (array2[i] < min) {
                min = array2[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);

        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != max && array2[i] != min) {
                sum += array2[i];
            }
        }
        System.out.println("Sum - " + sum);
        System.out.println("Average - " + ((double) sum / (array2.length - 2)));

    }
}
