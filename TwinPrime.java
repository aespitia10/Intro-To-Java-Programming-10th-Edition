public class TwinPrime 
{
    public static void main(String [] args)
    {
        for(int i = 3, j = 5; i <= 1000 && j <= 1000; i++, j++)
        {
            if(isPrime(i) && isPrime(j) && (differenceByTwo(i, j)))
            {
                System.out.println("("+ i + ", " + j + ")");
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

    public static boolean differenceByTwo(int num1, int num2)
    {
        if(Math.abs(num1 - num2) == 2)
        {
            return true;
        }
        return false;
    }
}