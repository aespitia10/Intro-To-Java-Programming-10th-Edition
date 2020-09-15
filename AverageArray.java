import java.util.*;
public class AverageArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double [] array = new double[10];
		System.out.print("Enter 10 numbers: ");
		

		for(int i = 0; i <= array.length - 1; i++)
		{
			array[i] = input.nextDouble();
		}	

		System.out.println("The average is " + average(array));
	}
	public static int average(int[] array)
	{
		int sum = 0;
		for(int i = 0; i <= array.length - 1; i++)
		{
			sum += array[i];
		}
		System.out.println("int method is executed");
		return (sum / (array.length - 1));
	}

	public static double average(double [] array)
	{
		double sum = 0.0;
		for(int i = 0; i <= array.length - 1; i++)
		{
			sum += array[i];
		}
		System.out.println("double method is executed");
		return (double)(sum / (array.length - 1));
	}

}