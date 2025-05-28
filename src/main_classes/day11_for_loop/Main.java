package main_classes.day11_for_loop;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i + " apples");
//        }

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("2 * " + i + " = " + (2 * i));
//        }


//        for (int i = 0; i < 5; i++) {
//            System.out.println("java is fun");
//        }

//        for (int i = 0; i < 10; i += 2) {
//            System.out.println("Hello world! -> " + i);
//        }
//        System.out.println("---------------------------");
//
//        for (int i = 0; i < 10; i = i + 2) {
//            System.out.println("Hello world! -> " + i);
//        }
//
//
//        for (int i = 10; i >= 0; i -= 2) {
//            System.out.println("Number -> " + i);
//        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("number -> " + i);
        }

        System.out.println("Sum of this numbers -> " + sum);


    }
}
