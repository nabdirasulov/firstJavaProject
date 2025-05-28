package main_classes.day9_logical_operators;

public class Practice {
    public static void main(String[] args) {
        int age = 12;

        if (!(age >= 13 && age <= 19)) {
            System.out.println("You're not teenager");
        } else {
            System.out.println("yes you're");
        }
    }
}
