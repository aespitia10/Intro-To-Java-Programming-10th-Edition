import java.util.*;
public class SmallestElement
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		double []myArray = new double[10];
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i <= myArray.length - 1; i++)
		{
			myArray[i] = input.nextDouble();
		}
		System.out.println("The minimum number is: " + min(myArray));
	}

	public static double min(double [] array)
	{
		double min = array[0];
		for(int i = 1; i <= array.length - 1; i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		return min;
	}
}