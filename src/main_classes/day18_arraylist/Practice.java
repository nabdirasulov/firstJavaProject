package main_classes.day18_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Double> fractionalNumbers = new ArrayList<>();
        fractionalNumbers.add(12.132);
        fractionalNumbers.add(465.45);
        fractionalNumbers.add(34223.324);
        fractionalNumbers.add(76876.234);
        fractionalNumbers.add(6565.3425);
        fractionalNumbers.add(99.111);
        fractionalNumbers.add(99.222);
        System.out.println(fractionalNumbers.size());
        System.out.println(fractionalNumbers.contains(99.111));
        System.out.println(fractionalNumbers.contains(99.1112));
        System.out.println("fractionalNumbers.isEmpty() = " + fractionalNumbers.isEmpty());

        Object[] array = fractionalNumbers.toArray();
        System.out.println(Arrays.toString(array));

        fractionalNumbers.sort(Comparator.naturalOrder());
        System.out.println(fractionalNumbers);
        fractionalNumbers.sort(Comparator.reverseOrder());
        System.out.println(fractionalNumbers);

        for (int i = 0; i < fractionalNumbers.size(); i++) {
            System.out.println(fractionalNumbers.get(i));
        }

    }
}
