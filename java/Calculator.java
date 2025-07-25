import java.util.Scanner;

public class Calculator {

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static String divide(double x, double y) {
        if (y == 0) {
            return "Error: Division by zero";
        }
        return String.valueOf(x / y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice (1/2/3/4): ");
        String choice = scanner.nextLine();

        if (choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")) {
            try {
                System.out.print("Enter first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                switch (choice) {
                    case "1":
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case "2":
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case "3":
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case "4":
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers.");
            }
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}


