import java.util.Scanner;

class Calculator {
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();

            System.out.println("Enter the operation (+, -, *, /): ");
            choice = sc.next().charAt(0);

            switch (choice) {
                case '+':
                    result = Add(num1, num2);
                    break;
                case '-':
                    result = Sub(num1, num2);
                    break;
                case '*':
                    result = Mul(num1, num2);
                    break;
                case '/':
                    result = Div(num1, num2);
                    break;
                default:
                    System.out.println("Invalid Operation");
            }

            System.out.println("Result = " + result);
            System.out.println("Do you want to continue (Y || N):");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int Mul(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("There is a logical error");
            return 0;
        }
    }
}

