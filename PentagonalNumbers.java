import java.util.*;
public class PentagonalNumbers 
{
    public static void getPentagonalNumber(int n)
    {
        final int NUMBER_OF_PENTAGONAL_LINES = 10;
        int result = 0;
        for(int i = 1; i <= n; i++)
        {
            result = i * ((3 * i) - 1) / 2;
            System.out.print(" " + result);

            if(i % NUMBER_OF_PENTAGONAL_LINES == 0)
            {
                System.out.println();
            }
        }
    }

    public static void main(String [] args)
    {
        getPentagonalNumber(100);
    }
}