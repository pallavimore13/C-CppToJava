import java.util.Scanner;

class student
{
	static char name;
	static int rollnum;
	static float marks;
	static float totalmarks;
	static char grade;
	
	public static void main(String[] args)
	{
	student s1 = new student();
	s1.getdata();
	s1.calculateGrade();
	}
public void getdata()
{
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their roll number
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        // Display the inputs
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
	
} 
public void calculateGrade()
{
	Scanner scan = new Scanner(System.in);
	
	int[] marks = new int[5];
	
	System.out.println("Enter your marks for 5 subject");
	
	for(int i = 0; i<5;i++)
	{
		System.out.println("Enter marks for subject" +(i+1) +":");
		marks[i] = scan.nextInt();
	}
	
	scan.close();
	
	int totalmarks = 0;
	for(int i =0;i<5;i++)
	{
		totalmarks += marks[i];
	}
	if(totalmarks >= 90){
		grade = 'A';
		System.out.println("Grade" +grade);
	}
	else if(totalmarks >= 80)
	{
		grade = 'B';
		System.out.println("Grade" +grade);
	}
	else if(totalmarks >= 70)
	{
		grade = 'C';
		System.out.println("Grade" +grade);
	}
	else if(totalmarks >= 60)
	{
		grade = 'D';
		System.out.println("Grade" +grade);
	}
	else
	{
		grade = 'F';
		System.out.println("Grade" +grade);
	}
	
}
}
