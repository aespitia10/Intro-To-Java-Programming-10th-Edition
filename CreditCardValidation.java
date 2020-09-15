import java.util.*;
public class CreditCardValidation 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as long integer: ");

        long creditCardNumber = input.nextLong();

        System.out.println(creditCardNumber + " is " + (isValid(creditCardNumber) ? "valid" : "invalid"));
        input.close();

    }    
    public static boolean isValid(long number)
    {
        if(getSize(number) >= 13 && getSize(number) <= 16 && 
          (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) && 
          sumOfDoubleEvenPlace(number) + sumOfOddPlace(number) % 10 == 0)
        {
            return true;
        }
        else 
            return false;
    }
    public static int sumOfDoubleEvenPlace(long number)
    {
        String strNumber = number + "";
        int sum = 0;

        for(int i = 0; i <= getSize(number) - 1; i += 2) 
        {
            sum += 2 * getDigit(Integer.parseInt(strNumber.charAt(i) + ""));
        }
        return sum;
    }
    public static int getDigit(int number)
    {
        if(number <= 9)
        {
            return number;
        }
        else    
            return (number / 10) + (number % 10);
    }
    public static int sumOfOddPlace(long number)
    {
        String strNumber = number + "";
        int sum = 0;

        for(int i = getSize(number) - 1; i >= 0; i -= 2)
        {
            sum += Integer.parseInt(strNumber.charAt(i) + "");
        }
        return sum;
    }
    public static boolean prefixMatched(long number, int d)
    {
        return getPrefix(number, getSize(d)) == d;
    }
    public static int getSize(long d)
    {
        String numSize = d + "";
        return numSize.length();
    }
    public static long getPrefix(long number, int k)
    {
        if(getSize(number) > k)
        {
            String num = number + "";
            return Long.parseLong(num.substring(0,k));
        }
        return number;
    }
}