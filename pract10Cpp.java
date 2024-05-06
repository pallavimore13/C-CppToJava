import java.util.Scanner;

class Demo {
    private int a;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        a = scanner.nextInt();
        scanner.close();
    }

    public void putData() {
        System.out.print(a);
    }

    public Demo negate() {
        a = -a;
        return this;
    }

    public Demo preIncrement() {
        a = a + 1;
        return this;
    }

    public Demo postIncrement() {
        Demo temp = new Demo();
        temp.a = a;
        a = a + 1;
        return temp;
    }
}

public class Main {
    public static void main(String[] args) {
        Demo x = new Demo();
        x.negate();
        x.getData();
        System.out.print("Original value: ");
        x.putData();
        x.negate();
        System.out.print("\nValue after operation: ");
        x.putData();

        Demo x2 = new Demo();
        x2.preIncrement();
        x.getData();
        System.out.print("\nOriginal value: ");
        x.putData();
        x.preIncrement();
        System.out.print("\nPrefix Increment: ");
        x.putData();

        Demo x3 = x.postIncrement();
        x.getData();
        System.out.print("\nOriginal value: ");
        x.putData();
        System.out.print("\nPostfix Increment: ");
        x3.putData();
    }
}

