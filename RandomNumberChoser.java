import java.util.*;
public class RandomNumberChoser
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int [] myArray = new int[100];
		for(int i = 0; i <= myArray.length - 1; i++)
		{
			myArray[i] = (int)(1 + (Math.random() * 54));
		}
		printArray(myArray);
		System.out.println("The random number is: " + getRandom(myArray));
	}

	public static int getRandom(int... numbers)
	{
		int duplicate;
		int random;
		do
		{
			random = (int)(1 + (Math.random() * 54));
			duplicate = 0;
			for(int i = 0; i <= numbers.length - 1; i++)
			{
				if(numbers[i] == random)
				{
					duplicate++;
				}
			}
			printArray(numbers);
			System.out.println("New line!!!!!!!!!!!!!11");
		}while(duplicate <= 0);

		return random;
	}

	public static void printArray(int[] x)
	{
		for(int i = 0; i <= x.length - 1; i++)
		{
			System.out.println(x[i] + " is element: " + i);
		}
	}
}