public class DisplayTimeAndDate 
{
    public static void main(String [] args)
    {
        System.out.println("Today is " + Zellercongruence(20, 5, 2020));
        getTime();
    }   

    public static void getTime()
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalMilliseconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + 5) % 24; 
        System.out.println("Current time is: " + currentHour + ":" + currentMinute + ":" + currentSecond + " PT");
    }

    public static String Zellercongruence(int day, int month, int year)
    {
        String Month = "";
        String Day = "";
        int count = 0;
        if(month == 1)
        {
            month = 13; 
            year--;
        }
        if(month == 2)
        {
            month = 14; 
            year--;
        }

        int q = day;
        int m = month; 
        int k = year % 100;
        int j = year / 100;
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;

        switch(h)
        {
            case 0 : Day = "Saturday"; break;
            case 1 : Day = "Sunday";break;
            case 2 : Day = "Monday";break;
            case 3 : Day = "Tuesday";break;
            case 4 : Day = "Wednesday";break;
            case 5 : Day = "Thursday";break;
            case 6 : Day = "Friday";break;
            default: Day = "Nan";break;
        }
        switch(month)
        {
            case 1: Month = "January";break;
            case 2: Month = "February";break;
            case 3: Month = "March";break;
            case 4: Month = "April";break;
            case 5: Month = "May";break;
            case 6: Month = "June";break;
            case 7: Month = "July";break;
            case 8: Month = "August";break;
            case 9: Month = "September";break;
            case 10: Month = "October";break;
            case 11: Month = "Novemeber";break;
            case 12: Month = "December";break;
            default: Month = "Nan";break;
        }

        for(int i = 1; i <= year; i++)
        {
            count++;
        }
        return (Day + " " + Month + " " + count);
    }
}