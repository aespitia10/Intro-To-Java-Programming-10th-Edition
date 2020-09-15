import java.util.*;
import java.util.Arrays;
public class OccuranceInArrays 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100 (and 0 when done): ");

        int[] myArray = new int[1000];
        int number;
        int count = 0;
13ae

        do
        {
            number = input.nextInt();
            myArray[count] = number;
            count++;
        }while(number != 0);

        int[] mySort = new int[count - 1];

        for(int i = 0; i < (count - 1); i++)
        {
            mySort[i] = myArray[i];
        }

        Arrays.sort(mySort);
        
        input.close();
    }

    public static void printOccurance(int[] myArray)
    {
        int[] finalArray = myArray;
        int n = 0;
        for(int i = 0; i <= finalArray.length - 1;i++)
        {
            int occurance = 0;
            if(n >= finalArray[i])
            {
                continue;
            }
            else
            {
                n = finalArray[i];
                for(int j = 0; j < finalArray.length; j++)
                    if(n == finalArray[i])
                    {
                        occurance++;
                    }

                    System.out.print(n + " occurs " + occurance);
                    {
                        if(occurance == 1)
                        {
                            System.out.println(" time");
                        }
                        else
                        {
                            System.out.println(" times");
                        }
                    }
                
            }

        }
    }

}