import java.util.*;
public class EliminateDuplicate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int []myArray = new int[10];
		for(int i = 0; i <= myArray.length - 1; i++)
		{
			myArray[i] = input.nextInt();
		}
		printArray(eliminateDuplicates(myArray));
	}
	public static int[] eliminateDuplicates(int[] list)
	{
		int [] distinctArray = {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0; i <= list.length - 1; i++)
		{
			int duplicate = 0;
			for(int j = 0; j <= distinctArray.length - 1; j++)
			{
				if(list[i] == distinctArray[j])
				{
					duplicate++;
				}
			}
			if(duplicate == 0)
			{
				distinctArray[i] = list[i];
			}
			else 
			{
				continue;
			}
		}
		return distinctArray;
	}
	public static void printArray(int[] distinctArray)
	{
		System.out.print("The distinct numbers are: ");
		for(int i = 0; i <= distinctArray.length - 1;i++)
		{
			if(distinctArray[i] != 0)
			{
				System.out.print(distinctArray[i] + " ");
			}
		}
	}
}