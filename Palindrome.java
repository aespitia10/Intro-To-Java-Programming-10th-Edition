import java.util.*;
public class Palindrome 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int low = 0;
        int high = word.length() - 1;
        boolean isPalindrome = true;
        while(low < high)
        {
            if(Character.toLowerCase(word.charAt(low)) != Character.toLowerCase(word.charAt(high)))
            {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome)
        {
            System.out.print(word + " is a palindrome");
        }
        else 
        {
            System.out.print(word + " is not a palindrome");
        }
        
    }
}