import java.util.*;
public class CheckPassword 
{    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password:");
        String password = input.nextLine();

        System.out.println((numberOfCharacters(password.toUpperCase()) && numberOfDigit(password.toUpperCase())) ? "Valid Password" : "Invalid Password");
        
        input.close();

    }

    public static boolean numberOfCharacters(String password)
    {
        int characterCount = 0;
        if(password.length() == 8)
        {
            char ch;
            for(int i = 0; i <= password.length() - 1; i++)
            {
                ch = password.charAt(i);

                if(ch >= 'A' && ch <= 'Z')
                {
                    characterCount++;
                }
            }

            if(characterCount == 6)
            { 
                return true; 
            }
            else 
                return false;
        }
        else
            return false;
    }

    public static boolean numberOfDigit(String password)
    {
        int digitCount = 0;

        if(password.length() == 8)
        {
            char ch;
            for(int i = 0; i <= password.length() - 1; i++)
            {
                ch = password.charAt(i);
                
                if(ch >= '0' && ch <= '9')
                {
                    digitCount++;
                }                
            }

            if(digitCount == 2)
            { 
                return true; 
            }
            else 
                return false;
        }
        else
            return false;
    }
}