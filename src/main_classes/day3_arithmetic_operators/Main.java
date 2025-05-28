package main_classes.day3_arithmetic_operators;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        x = x + x - x + 5;
        System.out.println("Result -> " + x);

        System.out.println(x);

        int ex1 = 3 + 5 * 2;
        System.out.println("Result 1 -> " + ex1);

        int ex2 = (3 + 5) * 2;
        System.out.println("Result 2 -> " + ex2);


        System.out.println("-----------------------------------");

        int ex3 = 72 / 3 / 3;
        System.out.println("Result 3 -> " + ex3);

        int ex4 = 72 / (3 / 3);
        System.out.println("Result 4 -> " + ex4);


        System.out.println("1 + 2 = " + 1 + 2 + 3);
        System.out.println("1 + 2 = " + (1 + 2 + 3));


        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + (1 + 2));

        int result = 1 + 2;
        System.out.println("Last abc" + result);


        int candies = 18;
        int friends = 6; // 6 * 3 -> 18

        System.out.println("Result of modulus -> " + (candies % friends));





    }
}
