import java.util.*;
public class Occurrences 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: "); // ask's user for a input of a string
        String word = input.nextLine(); // stores string into "word"

        System.out.print("Enter the char you would want to count: "); //asks user to enter a string
        String character = input.nextLine(); //stores the string into "character"

        char ch = character.charAt(0); // gets the char from the string character at position 0
        System.out.println("The number of times that the character " + ch + " appears in the string " + word + " is: " + count(word, ch));


    }
    public static int count(String str, char a)
    {
        int count = 0;
        for(int i = 0; i <= str.length() - 1; i++)
        {
            str.charAt(i); 
            if(str.charAt(i) == a)
            {
                count++;
            }
        }
        return count;    
    }
    
}