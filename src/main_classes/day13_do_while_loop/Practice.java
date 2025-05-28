package main_classes.day13_do_while_loop;

public class Practice {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter text: ");
//        String text = scanner.nextLine();
//        int counter = 0;
//        do {
//            System.out.println(text.charAt(counter));
//            counter++;
//        } while (counter < text.length());

        int number = 1;
        int sum = 0;
        do {
            if (number % 2 == 0) {
                sum += number;
            }

            number++;
        } while (number <= 20);

        System.out.println("The sum of even numbers between 1 and 20 is " + sum);
    }
}
