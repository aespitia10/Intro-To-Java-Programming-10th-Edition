import java.util.*;
public class TestingArrays 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        double[] myList = new double[10];

        //System.out.print("Enter " + myList.length + " values: ");

        //Initializing Arrays with input values
        // for(int i = 0; i <= myList.length - 1; i++)
        // {
        //     myList[i] = input.nextDouble();
        // }

        //Initializing Array with random values
        // for(int i = 0; i <= myList.length - 1; i++)
        // {
        //     myList[i] = Math.random() * 100;
        // }
        
        //Displaying Array
        // for(int j = 0; j <= myList.length - 1; j++)
        // {
        //     System.out.println(myList[j]);
        // }

        //Summing all elements in the Array
        // double total = 0;
        // for(int i = 0; i <= myList.length - 1; i++)
        // {
        //     total += myList[i];
        // }

        //Finding the largest element
        // double max = myList[0];
        // for(int i = 1; i <= myList.length - 1; i++)
        // {
        //     if(myList[i] > max)
        //     {
        //         max = myList[i];
        //     }
        // }

        //Finding the smallest index of the largest element 
        // double max = myList[0];
        // int indexOfMax = 0;
        // for(int i = indexOfMax; i <= myList.length - 1; i++)
        // {
        //     if(myList[i] > max)
        //     {
        //         max = myList[i];
        //         indexOfMax = i;
        //     }
        // }

        //Random Shuffling 
        // for(int i = myList.length - 1; i > 0; i--)
        // {
        //     int j = (int)(Math.random() * (i + 1));
        //     double temp = myList[i];
        //     myList[i] = myList[j];
        //     myList[j] = temp;
        // }

        //Shifteing elements
        //double temp = myList[0];
        //for(int i = 1; i < myList.length; i++)
        //{
        //    myList[i - 1] = myList[i];
        //}
        //myList[myList.length - 1] = temp;

        //Simplifying Code
        //String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Nov", "Dec"};
        //System.out.print("Enter a month number (1 to 12): ");
        //int monthNumber = input.nextInt();
        //System.out.println("The month is " + months[monthNumber - 1]);

        //Foreach Loop 
        // for(double e: myList)
        // {
        //     System.out.println(e);
        // }

        // double [] myArray = new double[10];

        // myArray[9] = 5.5;


        // double sum = 0.0;
        // for(int i = 0; i < 2; i++)
        // {
        //     sum += myArray[i];
        // }
        // System.out.println(sum);

        // for(int i = 0; i <= myArray.length - 1; i++)
        // {
        //     sum += myArray[i];
        // }
        // System.out.println(sum);

        // double min = myArray[0];
        // for(int i = 1; i <= myArray.length - 1; i++)
        // {
        //     if(myArray[i] < min)
        //     {
        //         min = myArray[i];
        //     }
        // }

        // int index = (int)(Math.random() * myArray.length);
        // System.out.println(myArray[index]);

        // double[] newArray = {3.5, 5.5, 4.52, 5.6};


    }
}