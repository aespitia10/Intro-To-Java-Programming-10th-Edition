import java.util.*;
public class CountSingleDigits
{
	public static void main(String[] args)
	{
		int []count = {0,0,0,0,0,0,0,0,0,0};
		int []random = new int[100];

		for(int i = 0; i <= random.length - 1; i++)
		{
		    random[i] = (int)(Math.random() * 10);
		}
		int[] finalCount = countArray(random, count);
		printArray(finalCount);
	}
	public static int[] countArray(int[] random, int[] count)
	{
		for(int i = 0; i <= random.length - 1; i++)
		{
			count[random[i]]++;
		}
		return count;
	}
	public static void printArray(int [] count)
	{
		for(int i = 0; i <= count.length - 1; i++)
		{
			System.out.println(count[i] + " is the count of " + i + "'s in the element: " + i);		
		}
	}
}