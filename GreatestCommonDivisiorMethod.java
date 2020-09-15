import java.util.*;
public class GreatestCommonDivisiorMethod 
{
    public static int gcd(int n1, int n2)
    {
        int gcd = 1;
        int k = 2;

        while(k <= n1 && k <= n2)
        {
            if(n1 % k == 0 && n2 % k == 0)
            {
                gcd = k;
            }
            k++;
        }
        return gcd;
    }

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd(num1,num2));
        
        input.close();
    }
}