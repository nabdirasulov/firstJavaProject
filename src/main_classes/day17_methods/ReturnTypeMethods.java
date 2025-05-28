package main_classes.day17_methods;

public class ReturnTypeMethods {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        findSum(num1, num2, " Hi how are you?");
//        addTwoNumbers1(num1, num2);
//        int result = addTwoNumbers2(num1, num2);
//        System.out.println("From number 2 " + result);
//        String textResult = addTwoNumbers3(num1, num2);
//        System.out.println(textResult);
//        System.out.println(addTwoNumbers4(num1, num2));
//        print10Times("Codewise");
//        print10Times("Java");
//
//
//        int larger = findLarger(num1, num2);
//        System.out.println("Larger number - " + larger);

        String resultText = makeItToUpperCase("Hello Codewisers");
        System.out.println(resultText);
    }

    public static void findSum(int number1, int number2, String text) {
        System.out.println("Sum - " + (number1 + number2) + text);
    }


    public static void addTwoNumbers1(int num1, int num2) {
        System.out.println("Sum : " + (num1 + num2));
    }

    public static int addTwoNumbers2(int num1, int num2) {
        return num1 + num2;
    }

    public static String addTwoNumbers3(int num1, int num2) {
        return String.valueOf((num1 + num2));
    }

    public static Double addTwoNumbers4(int num1, int num2) {
        return Double.valueOf((num1 + num2));
    }

    public static void print10Times(String text) {
        for (int i = 0; i < 10; i++) {
            System.out.println(text);
        }
    }

    public static int findLarger(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else if (number1 < number2) {
            return number2;
        } else {
            return -1;
        }
    }

    public static String makeItToUpperCase(String word){
        return word.toUpperCase();
    }
}
