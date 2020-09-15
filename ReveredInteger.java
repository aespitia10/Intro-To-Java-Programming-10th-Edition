import java.util.*;
public class ReveredInteger 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();

        reverse(userNum);
        input.close();
    } 
    public static void reverse(int number)
    {
        String strNumber = number + "";
        String reverse = "";
        for(int i = strNumber.length() - 1; i >= 0; i--)
        {
            reverse += strNumber.charAt(i);
        }
        System.out.println("The reverse integer is: " + reverse);

    }
}