import java.util.*;
public class GuessNumber 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int magic_number = (int)(Math.random() * 100);
        System.out.println("Guess a magic number between 0 and 100");
        System.out.println("Enter your guess: ");
        int guess = input.nextInt();

        while(guess != magic_number)
        {
            if(magic_number < guess)
            {
                System.out.println("Your guess is too high");
                guess = input.nextInt();
            }
            else 
            {
                System.out.println("Your guess is too low");
                guess = input.nextInt();
            }
        }
        System.out.print("Yes, the number is " + guess);
        
    }
}