import java.util.Scanner;
class LargestNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter the elements of an array");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		//sc.close;
		
		for(int i=0;i<size;i++){
			if(arr[0] < arr[i]){
				arr[0] = arr[i];
			}
		}
		System.out.println("Largest number" +arr[0]);
		
		sc.close();
	}
}
