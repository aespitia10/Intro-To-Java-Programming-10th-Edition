import java.util.*;
public class SumDigitsToIntegers 
{
    public static int sumDigits(long n)
    {
        long dividen = n;
        long remainder = dividen % 10;
        int sum = (int)remainder;

        while(dividen > 0)
        {
            dividen = n / 10;

            remainder = dividen % 10;

            sum += remainder; 

            n = dividen;
        }
        return sum;
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();
        System.out.println("The sumation is: " + sumDigits(userNum));
        input.close();
    }    
}