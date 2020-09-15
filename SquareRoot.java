import java.util.*;
public class SquareRoot 
{

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number you want the square root of: ");

        long userNum = input.nextLong();

        System.out.println("The answer is: " + sqrt(userNum));
        
        input.close();
    }

    public static double sqrt(long n)
    {        
        double lastGuess, nextGuess = 1;

        do 
        {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (double)n / lastGuess) / 2;

        } while (Math.abs(lastGuess - nextGuess) >= 0.0001);
        return nextGuess;
    }
}