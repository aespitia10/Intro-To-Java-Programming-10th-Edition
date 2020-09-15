import javax.swing.text.DefaultEditorKit.CutAction;

public class ConvertTime 
{
    public static void main(String [] args)
    {
        System.out.println("For 5500 milliseconds = " + convertMillis(5500));
        System.out.println("For 100000 milliseconds = " + convertMillis(100000));
        System.out.println("For 555550000 milliseconds = " + convertMillis(555550000));
    }   
    
    public static String convertMillis(long millis)
    {
        long millisecondsToHours = millis / 3600000;
        long currentHour = millisecondsToHours % 3600000;

        long millisecondsToMinutes = millis / 60000;
        long currentMinute = millisecondsToMinutes % 60;

        long millisecondsToSeconds = millis / 1000;
        long currentSeconds = millisecondsToSeconds % 60;

        return   currentHour + ":" + currentMinute + ":" + currentSeconds;
    }
}