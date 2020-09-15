public class FormatAnInteger 
{
    public static void main(String [] args)
    {
        System.out.println("The new string is " + format(34, 4));
        System.out.println("The new string is " + format(34, 5));
    }

    public static String format(int number, int width)
    {
        String result = number + "";
        String zeros = "";

        if(result.length() >= width)
        {
            return result;
        }
        else
            for(int i = result.length() + 1; i <= width; i++)
            {
                zeros += "0";
            }
            return (zeros) + number;
    }
}