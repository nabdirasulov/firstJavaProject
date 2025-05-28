package main_classes.day16_wrapper_classes;

public class Main {
    public static void main(String[] args) {
        int number = 10;

        String textNumber = "2345";
        Integer objNum = Integer.valueOf(textNumber);
        Integer objNum2 = number;
        System.out.println(objNum);
        System.out.println(objNum2);


        System.out.println("------------------------------");


        String stringNum = "95.4234";
        Double doubleNumber = Double.valueOf(stringNum);
        System.out.println(doubleNumber);


        Integer num2 = Integer.valueOf("200");
        String numString = String.valueOf(num2);
        System.out.println(numString);

        int primitiveNumber = num2;

        System.out.println(primitiveNumber);


    }
}
