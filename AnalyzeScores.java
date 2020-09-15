import java.util.*;
public class AnalyzeScores 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        double []myArray = new double[100];
        int count = 0;
        double number = 0.0;

        do
        {
            System.out.println("Enter a number: ");
            number = input.nextDouble();
            myArray[count] = number;
            count++;
        }while(number > 0.0);

        double []newArray = new double[count];

        for(int j = 0; j <= myArray.length - 1; j++)
        {
            if(myArray[j] > 0)
            {
                newArray[j] = myArray[j];
            }
            else
            {
                break;
            }
        }
        System.out.print("The average score is: " + scoreAverage(newArray, (double)(newArray.length-1)));
        input.close();
    }    

    public static double scoreAverage(double []scores, double divisor)
    {
        double sum = 0.0;
        double average = 0.0;
        for(int i = 0; i <= scores.length - 1; i++)
        {
            if(scores[i] > 0)
            {
                sum += scores[i];
                System.out.println(sum);
            }
            else 
            {
                break;
            }
        }
        average = sum / divisor;
        aboveAndBelow(scores, average);
        return average;

    }

    public static void aboveAndBelow(double [] scores, double average)
    {
        int above = 0;
        int below = 0;

        for(int i = 0; i <= scores.length - 1; i++)
        {
            if(scores[i] >= average)
            {
                above++;
            }
            else if(scores[i] < 0.0)
            {
                below--;
            }
            else
            {
                below++;
            }
        }
        System.out.println("There are " + above + " scores equal or above the average!");
        System.out.println("There are " + below + " scores below the average!");
    }
}