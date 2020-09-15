import java.util.*;
public class ReverseAnArray
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int []myArray = new int[10];
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i <= myArray.length - 1; i++)
		{
			myArray[i] = input.nextInt();
		}
		reverse(myArray);
	}
	
	public static void reverse(int [] x)
	{
		int []reverse = new int[x.length];
		int count = 0;
		for(int i = x.length - 1; i >= 0;i--)
		{
			reverse[count] = x[i];
			count++;
		}
		printArray(reverse);
	}

	public static void printArray(int []x)
	{
		System.out.print("The reverse array is ");
		for(int i = 0; i <= x.length - 1; i++)
		{
			System.out.print(x[i] + " ");
		}
	}
}