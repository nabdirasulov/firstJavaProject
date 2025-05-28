package additional_classes.lambda_expression;

public class Main {
    public static void main(String[] args) {
        Technology technology = new Technology() {
            @Override
            public void print(String name, int age) {
                System.out.println("Hello how are you? " + age + " , and my name is " + name);
            }
        };

        technology.print("Codewise", 2);

    }
}
