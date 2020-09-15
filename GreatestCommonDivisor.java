import java.util.*;
public class GreatestCommonDivisor 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter integer 2: ");
        int n2 = input.nextInt();
        int gcd = 1;
        for(int k = 2; k <= n1 && k <= n2; k++)
        {
            if(n1 % k == 0 && n2 % k == 0)
            {
                gcd = k;
            }
        }
        System.out.println("The gcd for " + n1 + " & " + n2 + " is: " + gcd);

        input.close();
        
    }
}