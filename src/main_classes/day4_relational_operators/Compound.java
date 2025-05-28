package main_classes.day4_relational_operators;

public class Compound {
    public static void main(String[] args) {
        int number = 20;
        number++;
        number++;
        number++;
        System.out.println(number);

        number--;
        number--;
        number--;
        System.out.println(number);

//        number = number - 15;
        number -= 15;
        System.out.println("After substract and assign -> " + number);

//        number = number + 100;
        number += 100;
        System.out.println("After adding and assigning -> " + number);


    }
}
