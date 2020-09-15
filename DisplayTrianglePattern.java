import java.util.*;
public class DisplayTrianglePattern 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to see displayed: ");
        int userNum = input.nextInt();

        displayPattern(userNum);
        input.close();
    }

    public static void displayPattern(int n) // n = 2
    {
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            } 
            for(int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}