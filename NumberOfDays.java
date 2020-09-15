public class NumberOfDays 
{
    public static void main(String [] args)
    {
        for(int i = 2000; i <= 2020; i++)
        {
            System.out.println("The year " + i + " has " + numberOfDaysInYear(i) + " in a year");
        }
    }   
    
    public static int numberOfDaysInYear(int year)
    {
        if(year % 4 == 0)
        {
            return 366;
        }
        else
            return 365;
    }
}