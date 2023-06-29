import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        // Define Scanner class
        Scanner scanner = new Scanner(System.in);

        // List of functions
        System.out.println("\u001B[31mFunctions Available:\u001B[0m");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");
        System.out.println("power");
        System.out.println("square root");
        System.out.println("cube root");

        double result = 0;

        // Input the desired operation to be performed
        System.out.println("\u001B[31m\nEnter your Choice:\u001B[0m");
        String choice = scanner.next();

        if (choice.equals("power")) {
            // Input the numbers for calculation
            System.out.print("\nEnter the base number: ");
            int base = scanner.nextInt();
            System.out.print("\nEnter the exponent: ");
            int exponent = scanner.nextInt();
            result = Math.pow(base, exponent);
        } else if (choice.equals("square")) {
            System.out.print("\nEnter the number: ");
            int number = scanner.nextInt();
            result = Math.sqrt(number);
        } else if (choice.equals("cube")) {
            System.out.print("\nEnter the number: ");
            int number = scanner.nextInt();
            result = Math.cbrt(number);
        } else {
            // Input the no of required inputs
            System.out.println("\u001B[31m\nEnter the no of inputs:\u001B[0m");
            int n = scanner.nextInt();
            // Input the numbers for calculation
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("\nEnter the " + (i + 1) + "th number: ");
                numbers[i] = scanner.nextInt();
            }
            switch (choice) {
                case "+":
                    for (int i = 0; i < n; i++) {
                        result += numbers[i];
                    }
                    break;

                case "-":
                    result = numbers[0]; // Initialize result with the first number
                    for (int i = 1; i < n; i++) {
                        result -= numbers[i];
                    }
                    break;

                case "*":
                    result = 1; // Initialize result with 1 for multiplication
                    for (int i = 0; i < n; i++) {
                        result *= numbers[i];
                    }
                    break;

                case "/":
                    result = numbers[0]; // Initialize result with the first number
                    for (int i = 1; i < n; i++) {
                        result /= numbers[i];
                    }
                    break;

                default:
                    System.out.println("Invalid operation");
                    scanner.close();
                    return;
            }
        }
        
        System.out.println("\u001B[31m\nThe result is:\u001B[0m");
        scanner.close();
    }
}
