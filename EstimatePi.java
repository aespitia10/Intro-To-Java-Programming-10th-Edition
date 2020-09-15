import java.text.DecimalFormat;

public class EstimatePi 
{
    public static void main(String [] args)
    {
        System.out.println("i\tm(i)");

        for(int i = 1; i <= 901; i += 100)
        {
            System.out.printf("%d" + "\t" + "%.4f\n", i, (4 * m(i)));
        }        
    }

    public static double m(int number)
    {
        double result = 0.0;

        for(double i = 1; i <= number; i++)
        {
            result += (Math.pow(-1.0, i + 1.0) / (2.0 * i - 1.0));
        }
        
        return result;
    }
}