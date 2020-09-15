import java.util.*;
public class CountLetters 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = input.nextLine();

        System.out.println("The number of letters in the string is: " + countLetters(word.toUpperCase()));
        input.close();

    }    
    public static int countLetters(String word)
    {
        int count = 0;
        char ch;
        for(int i = 0; i <= word.length() - 1; i++)
        {
            ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
            {
                count++;
            }
        }
        return count;
    }
}