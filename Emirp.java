public class Emirp 
{
    public static void main(String [] args)
    {
        int count = 0;
        int number = 2;
        for(int i = number; i <= 50000; i++)
        {
            if(isPrime(i) && isEmirp(i) && !isPalindrome(i))
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

    public static boolean isEmirp(int number)
    {
        String reversed = "";
        String str = number + "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reversed += str.charAt(i);
        }     
        
        int emirp = Integer.parseInt(reversed);
        

        for(int divisor = 2; divisor <= emirp / 2; divisor++)
        {
            if(emirp % divisor == 0)
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