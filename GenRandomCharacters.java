public class GenRandomCharacters 
{
    public static void main(String [] args)
    {
        for(int i = 1; i <= 200; i++)
        {
            if(i % 10 == 0)
            {
                System.out.println();
            }

            if(i <= 100)
            {
                System.out.print(printChars() + " ");
            }
            else 
            System.out.print(printDigits() + " ");
        }
    }

    public static char printChars()
    {
        return (char)(65 + Math.random() * 25);
    }
    public static char printDigits()
    {
        return (char)(48 + Math.random() * 9);
    }
}