import java.util.*;
public class PhoneKeyPads 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String phoneNumber = input.nextLine();

        char ch;

        for(int i = 0; i < phoneNumber.length(); i++)
        {
            ch = phoneNumber.charAt(i);
            if(ch == '-')
            {
                System.out.print("-");
            }
            else
                System.out.print("" + getNumber(ch));
        }

        input.close();
    }

    public static int getNumber(char upperCaseLetter)
    {
        int number;

        switch(Character.toUpperCase(upperCaseLetter))
        {
            case '0': number = 0; break;
            case '1': number = 1; break;
            case 'A': case 'B': case 'C': case '2': number = 2; break;
            case 'D': case 'E': case 'F': case '3': number = 3; break;
            case 'G': case 'H': case 'I': case '4': number = 4; break;
            case 'J': case 'K': case 'L': case '5': number = 5; break;
            case 'M': case 'N': case 'O': case '6': number = 6; break;
            case 'P': case 'Q': case 'R': case 'S': case '7': number = 7; break;
            case 'T': case 'U': case 'V': case '8': number = 8; break;
            case 'W': case 'X': case 'Y': case 'Z': case '9': number = 9; break;
            default : number = 0; break;
        }
        return number;
    }
}