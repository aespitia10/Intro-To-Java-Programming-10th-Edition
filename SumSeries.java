import java.text.DecimalFormat;

public class SumSeries 
{
    public static void main(String [] args)
    {
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("i\tm(i)");
        System.out.println("______________________");
        for(int i = 1; i <= 20; i++)
        {
            System.out.println(i + "\t" + df.format(seriesSummation(i)));
        }
    }   
    
    public static double seriesSummation(int number)
    {
        double result = 0.0;
        for(double i = 1.0; i <= number; i++)
        {
            result += i / (i + 1.0);
        }
        return result;
    }
}