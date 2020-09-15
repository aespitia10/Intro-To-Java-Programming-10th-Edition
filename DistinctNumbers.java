import java.util.*;
public class DistinctNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int []myArray = new int[10];
		int count = 0;
		System.out.println("Enter ten numbers: ");

		do
		{
			myArray[count] = input.nextInt();
			count++;

		}while(count < 10);

		System.out.println("The number of distinct number is: " + distinctNum(myArray));
		
		int []newArray = distinctArray(myArray);

		System.out.print("The distinct numbers are: ");
		for(int i = 0; i <= newArray.length - 1; i++)
		{
			if(newArray[i] > 0)
			{
				System.out.print(newArray[i] + " ");
			}
		}
	}
	public static int distinctNum(int []numbers)
	{
		int temp = 0;
		int dupicate = 0;

		for(int i = 0; i <= numbers.length - 1; i++)
		{
			dupicate = 0;
			for(int j = 0; j <= numbers.length - 1; j++)
			{
				if(numbers[i] == numbers[j] && (i != j))
				{
					dupicate++;
				}
			}
			if(dupicate == 0)
			{
				temp = numbers[i];
			}
		}
		return temp;
	}

	public static int[] distinctArray(int []myArray)
	{
		int size = 0;
		int [] distinctArray = {0,0,0,0,0,0,0,0,0,0};

		int dupicate = 0;
		for(int i = 0; i <= myArray.length - 1; i++)
		{
			dupicate = 0;
			for(int j = 0; j <= distinctArray.length - 1; j++)
			{
				if(myArray[i] == distinctArray[j])
				{
					dupicate++;
				}
			}
			if(dupicate > 0)
			{
				continue;
			}
			else
			{
				distinctArray[i] = myArray[i];
			}
		}
		return distinctArray;
	} 
}