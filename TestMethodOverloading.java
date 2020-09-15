public class TestMethodOverloading 
{

    public static int max(int num1, int num2)
    {
        return (num1 > num2) ? num1 : num2;
    }
    public static double max(double num1, double num2)
    {
        return (num1 > num2) ? num1 : num2;
    }
    public static double max(double num1, double num2, double num3)
    {
        return max(max(num1,num2), num3);
    }
    public static void main(String [] args)
    {
        System.out.println("The maximum of 3 and 4 is " + max(3,4));
        System.out.println("The maximum of 3 and 4 is " + max(3.0,5.4));
        System.out.println("The maximum of 3 and 4 and 10.14 is " + max(3.0,5.4,10.14));
        
    }
}