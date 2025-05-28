package main_classes.day10_switch_statement;

public class Practice {
    public static void main(String[] args) {

        String fruit = "orange";
        switch (fruit){
            case "apple":
                System.out.println("You chose apple");
                break;
            case "banana":
                System.out.println("You chose banana");
                break;
            case "orange":
                System.out.println("You chose orange");
                break;
            default:
                System.out.println("Hello world!");
                break;
        }
    }
}
