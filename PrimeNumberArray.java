public class PrimeNumberArray
{
	public static void main(String [] args)
	{
		final int NUMBER_OF_PRIMES = 50;
		int [] myArray = new int[NUMBER_OF_PRIMES];

		int count = 0;
		for(int i = 2; count <= myArray.length - 1; i++)
		{
			if(isPrime(i))
			{
				myArray[count] = i;
				count++;
			}
		}
		printArray(myArray);

	}

	public static void printArray(int [] primeArray)
	{
		for(int i = 0; i <= primeArray.length - 1; i++)
		{
			System.out.println(primeArray[i] + " is a primeNumber");
		}
	}

	public static boolean isPrime(int number)
	{
		boolean isPrime = true;
		for(int i = 2; i <= Math.sqrt(number); i++)
		{
			if(number % i == 0)
			{
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}
}