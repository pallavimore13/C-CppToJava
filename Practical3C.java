class ArithmeticOp
{
	public static void main(String[] args)
	{
		int a = 40;
		int b = 20;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		System.out.println("Addition of a and b is =" + add);
		System.out.println("subtraction of a and b is =" + sub);
		System.out.println("Multiplication of a and b is =" + mul);
		System.out.println("Division of a and b is =" + div);
		System.out.println("Modulo of a and b is =" + mod);
		
		
	}
}
class LogicalOp
{
	public static void main(String[] args)
	{
		int m = 40, n = 20;
		if(m>n && m != 0){
		System.out.println("m is greater than n and not equal to zero");
		}
	}
}

class BitwiseOp
{
	public static void main(String[] args)
	{
		int m = 40,n = 20, A, O, XOR;
		
		 A = (m & n);
		 O = (m|n);
		 XOR = (m^n);
		
		System.out.println("And operator value = " +A);
		System.out.println("OR operator value = " +O);
		System.out.println("XOR operator value = " +XOR);
		
	}
}

class conditionalOp
{
	public static void main(String[] args)
	{
		int x = 1, y;
		y = (x == 1?2:0);
		System.out.println("X value is" +x);
		System.out.println("Y value is" +y);
	}
}
















