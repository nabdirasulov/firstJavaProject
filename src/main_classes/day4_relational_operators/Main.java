package main_classes.day4_relational_operators;

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;

        boolean areTheyEqual = number1 == number2;

        System.out.println("Result boolean -> " + areTheyEqual);
        System.out.println("second result -> " + (number1 == number2));


        int number3 = 150;
        int number4 = 151;

        boolean areTheyNotEqual = number3 != number4;
        System.out.println("Result not equal -> " + areTheyNotEqual);
        System.out.println("Result not equal 2 -> " + (number3 != number4));



        int number5 = 5;
        int number6 = 10;
        boolean lessThan = number5 < number6;
        System.out.println("Less than result -> " + lessThan);
        System.out.println("Result greater than -> " + (number5 > number6));


        int number7 = 50;
        int number8 = 10;
        boolean lessThanOrEqual = number7 <= number8;
        System.out.println("Less than or equal result -> " + lessThanOrEqual);
        System.out.println("Greater than or equal result -> " + (number7 >= number8));



    }
}
