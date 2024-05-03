import java.util.Scanner;

class AreaOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double num = sc.nextInt();
		
		double result = Area(num);
		System.out.println("Area of circle is =" +result);
		

	}
		public static double Area(double radius)
		{
			if(radius > 0)
			{
				return 3.14*radius*radius;
			}
			else
			{
				return 0;
			}
		}

}

class SumOfTwo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		
		int result = Sum(num1,num2);
		System.out.println("Sum of two numbers is =" +result);
	}
	public static int Sum(int a,int b)
	{
		return a + b;
	}
}

class Tempreture
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tempreture");
		double temp = sc.nextDouble();
		
		double result = FarenhitToCelsius(temp);
		System.out.println("The converted temprature is" +result);
	}
	public static double FarenhitToCelsius(double x)
	{
		return 5 / 9 * ( x - 32 );
	}
}



















