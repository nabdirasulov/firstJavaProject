package main_classes.day18_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 34, 4, 423, 543, 2543};
        System.out.println(Arrays.toString(array));
//        System.out.println(array[0]);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(23, 34, 254, 43, 5, 1264, 43, 346, 6));
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        System.out.println("numbers.size() = " + numbers.size());
        System.out.println(numbers.get(9));
        System.out.println(numbers.get(10));
        System.out.println(numbers.get(11));
        System.out.println(numbers.get(12));
        numbers.set(12, 999999);
        System.out.println(numbers.get(12));
        System.out.println(numbers);
        numbers.remove(12);
        System.out.println(numbers);

        numbers.clear();
        System.out.println("numbers = " + numbers);
        System.out.println("numbers.size() = " +numbers.size());
        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());
    }
}
