import java.util.*;
public class ReverseArray 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of integers you will want to enter: ");

        int size = input.nextInt();

        int[] myArray = new int[size]; 

        for(int i = 0; i <= myArray.length - 1; i++)
        {
            myArray[i] = input.nextInt();
        }

        printReverse(reverseArray(myArray));
        
        input.close();
    }    
    
    public static int[] reverseArray(int [] myArray)
    {
        int [] reverse = new int[myArray.length];

        int j = myArray.length - 1;

        for(int i = 0; i <= myArray.length - 1; i++)
        {
            reverse[i] = myArray[j];
            j--;
        }
        return reverse;
    }

    public static void printReverse(int[] reverse)
    {
        for(int i = 0; i <= reverse.length - 1; i++)
        {
            System.out.print(reverse[i] + " ");
        }
    }
}