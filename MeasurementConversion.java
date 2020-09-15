import java.text.DecimalFormat;

public class MeasurementConversion 
{
    public static void main(String [] args)
    {
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Feet\tMeters\t\t|\t\tMeters\tFeet");
        System.out.println("----------------------------------------------------------");

        double meters = 20.0;

        for(double feet = 1.0; feet <= 10.0; feet++)
        {
            System.out.println(feet + "\t" + df.format(footToMeter(feet)) + "\t\t|\t\t" + meters + "\t" + df.format(meterToFoot(meters)));
            meters += 5.0;
        }
    }   
    
    public static double footToMeter(double foot)
    {
        return (0.305 * foot);
    }

    public static double meterToFoot(double meter)
    {
        return (3.279 * meter);
    }
}