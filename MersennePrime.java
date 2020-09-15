public class MersennePrime 
{
    public static void main(String []args)
    {
        System.out.println("p\t\t2^p-1");
        System.out.println("---------------------");
        
        for(int i = 2; i <= 31; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + "\t\t" + mersennePrime(i));
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
    
    public static int mersennePrime(int number)
    {
        return (int)(Math.pow(2,number) - 1);
    }
}