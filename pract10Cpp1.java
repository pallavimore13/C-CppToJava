class Complex {
    private float x;
    private float y;

    public Complex() { }

    public Complex(float real, float imag) {
        x = real;
        y = imag;
    }

    public Complex add(Complex c) {
        Complex temp = new Complex();
        temp.x = x + c.x;
        temp.y = y + c.y;
        return temp;
    }

    public Complex subtract(Complex s) {
        Complex temp = new Complex();
        temp.x = x - s.x;
        temp.y = y - s.y;
        return temp;
    }

    public void display() {
        System.out.println(x + " + i" + y);
        System.out.println(x + " - i" + y);
    }
}

class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.2f, 6.4f);
        Complex c2 = new Complex(6.1f, 8.3f);
        
        Complex c3 = c1.add(c2);
        System.out.println("c3 = ");
        c3.display();
        
        c3 = c2.subtract(c1);
        System.out.println("c3 = ");
        c3.display();
    }
}

