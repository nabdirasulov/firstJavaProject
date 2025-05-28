package main_classes.day2_non_primitive_data_type;

public class Main {
    public static void main(String[] args) {
        String text = "Hello";
        String tail = "World!";
        String result = text + " " + tail;
        System.out.println(result);

        int number = 123;


        System.out.println(result + " " + number);

        System.out.println("Text here");


        String hello = "HI";
        hello = hello + "I";

        System.out.println(hello);


        String newVersion = new String("Hello Codewise!");
        System.out.println(newVersion);

        newVersion = newVersion + "!!!!!!!";

        System.out.println(newVersion);

    }
}
