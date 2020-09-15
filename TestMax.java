public class TestMax 
{
    public static int max(int num1, int num2)
    {
        int result = 0;
        if(num1 > num2)
        {
            result = num1;
        }
        else
        {
            result = num2;
        }
        return result;
       // return (num1 > num2) ? num1: num2; This is the simplified form
    }
    public static void main(String [] args)
    {
        int i = 2;
        int j = 5;
        int k = max(i,j);
        System.out.println("The max of " + i + " and " + j + " is " + k );
    }
}