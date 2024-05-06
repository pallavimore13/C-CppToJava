import java.util.Scanner;

class Perform {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        try {
            System.out.println("Sum: " + add(num1, num2));
            System.out.println("Difference: " + sub(num1, num2));
            System.out.println("Product: " + multi(num1, num2));
            System.out.println("Quotient: " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

