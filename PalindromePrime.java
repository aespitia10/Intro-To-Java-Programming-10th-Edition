public class PalindromePrime 
{
    public static void main(String []args)
    {
        int count = 0;
        for(int i = 2; i <= 80000; i++)
        {
            if(isPrime(i) && isPalindrome(i))
            {
                if(count % 10 == 0)
                {
                    System.out.println();
                }
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int number)
    {
        for(int divisor = 2; divisor <= number / 2; divisor++)
        {
            if(number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number)
    {
        String reversed = "";
        String str = number + "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }

        if(str.equals(reversed))
        {
            return true;
        }
        else 
            return false;
    }

}
