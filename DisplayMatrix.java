import java.util.*;
public class DisplayMatrix 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int userNum = input.nextInt();

        printMatrix(userNum);
        input.close();
    }

    public static void printMatrix(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for(int column = 1; column <= n;column++)
            {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}