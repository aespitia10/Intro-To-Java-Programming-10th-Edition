import java.util.*;
public class ArrayDeviation
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
		System.out.println("The mean is: " + mean(myArray));
		System.out.println("The standard deviation is: " + deviation(myArray));

	}
	public static double mean(double[] x)
	{
		double sum = 0.0;
		for(int i = 0; i <= x.length - 1; i++)
		{
			sum += (double)(x[i]);
		}
		return ((double)(sum) / (double)(x.length));
	}
	public static double deviation(double[] x)
	{
		double numerator = 0.0;
		double mean = mean(x);
		for(int i = 0; i <= x.length - 1; i++)
		{
			numerator += Math.pow(x[i] - mean, 2);
		}
		return (Math.sqrt(numerator / (x.length - 1)));
	}
}