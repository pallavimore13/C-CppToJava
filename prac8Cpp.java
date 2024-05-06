import java.util.Scanner;

class Area {
    int X, Y;

    public Area() {
        X = 20;
        Y = 10;
    }

    public Area(int a, int b) {
        X = a;
        Y = b;
    }

    public Area(Area S) {
        X = S.X;
        Y = S.Y;
    }

    public void parameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length and breadth of the triangle: ");
        X = scanner.nextInt();
        Y = scanner.nextInt();
        scanner.close();
    }

    public int calculateArea() {
        return (int) (0.5 * X * Y);
    }
}

class Main {
    public static void main(String[] args) {
        Area A1 = new Area();
        Area A2 = new Area(40, 20);
        Area A3 = new Area(A1);

        System.out.println("Area of A1: " + A1.calculateArea());
        System.out.println("Area of A2: " + A2.calculateArea());
        System.out.println("Area of A3: " + A3.calculateArea());
    }
}

