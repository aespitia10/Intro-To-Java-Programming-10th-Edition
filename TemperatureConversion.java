import java.text.DecimalFormat;
public class TemperatureConversion 
{
    
    public static void main(String [] args)
    {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Celsius\tFahrenheit\t\t|\t\tFahrenheit\tCelsius");
        System.out.println("-----------------------------------------------------------------------");

        double f = 120.0;
        for(double c = 40.0; c >= 31; c--)
        {
            System.out.println(c + "\t" + df.format(celcuisToFahrenheit(c)) + "\t\t\t|\t\t" + f + "\t\t"+ df.format(fahrenheitToCelsius(f)));
            f -= 10;
        }
    }

    public static double celcuisToFahrenheit(double celsius)
    {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    
}