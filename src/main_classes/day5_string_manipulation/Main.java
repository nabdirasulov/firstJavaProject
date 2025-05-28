package main_classes.day5_string_manipulation;

public class Main {
    public static void main(String[] args) {
        String text1 = "Hello";
        String text2 = "Hello";
        String text3 = new String("Hello");
        String text4 = new String("Hello");
        boolean areTheyEqual = text1 == text2;
        System.out.println(areTheyEqual);
        System.out.println(text1 == text3);
        System.out.println(text3 == text4);
        System.out.println("Equals method -> " + text1.equals(text3));
        boolean equals = text3.equals(text4);
        System.out.println(equals);


        String text5 = "CODEWISE";
        System.out.println(text5.toLowerCase());

        String text6 = "Hello World!";
        String text7 = "HELLO WORLD!";
        text6 = text6.toLowerCase();
        System.out.println(text6);

        System.out.println("------------------toLowerCase-------------------");
        System.out.println(text6 == text7);
        System.out.println(text6.equals(text7));
        boolean toLowerCaseEqual = text6.toLowerCase().equals(text7.toLowerCase());
        System.out.println(toLowerCaseEqual);
        System.out.println(text6.toLowerCase().equals(text7.toLowerCase()));


        System.out.println("------------------toUpperCase-------------------");
        String text8 = "Hello World!";
        String text9 = "hello world!";

        System.out.println(text8.equals(text9));
        boolean equals2 = text8.toUpperCase().equals(text9.toUpperCase());
        System.out.println(equals2);

        text8 = text8.toUpperCase();
        System.out.println(text8);


        System.out.println("------------------charAt-------------------");
//        "Hello"
        // 01234 -> in programming
        String word = "Hello";
        char firstLetter = word.charAt(0);
        System.out.println(firstLetter);
        char lastLetter = word.charAt(4);
        System.out.println(lastLetter);

        System.out.println("------------------concat-------------------");
        String word1 = "Hi";
        String word2 = "Java";
        String result1 = word1 + word2;
        String result = word1.concat(" ").concat("  ").concat("    ").concat(word2);
        System.out.println(result);
        System.out.println(result1);

        System.out.println("------------------indexOf(char)-------------------");
        String text10 = "Hello";
        int indexOfResult1 = text10.indexOf('H');
        System.out.println(indexOfResult1);
        System.out.println(text10.indexOf('o'));
        System.out.println("Length of word -> " + text10.length());

        System.out.println("------------------isEmpty-------------------");

        String text11 = "";
        System.out.println(text11.isEmpty());




    }
}
