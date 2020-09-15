import java.util.*;
public class PlaindromeInteger 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = input.nextInt();

        System.out.println(userNum + (isPalindrom(userNum) ? " is " : " is not " ) + "a palindrome");

        input.close();
    }

    public static int reverse(int number)
    {
       String reversed = "";
       String str = number + "";
       
       for(int i = str.length() - 1; i >= 0; i--)
       {
            reversed += str.charAt(i);
       }
        return Integer.parseInt(reversed);
    }

    public static boolean isPalindrom(int number)
    {
        return (number == reverse(number)) ? true : false;
    }
}