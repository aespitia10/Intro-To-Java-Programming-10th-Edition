import java.util.*;
public class FutureTuition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double tuition = 10000;
        int year = 0;
        do
        {
            tuition = tuition * 1.07;
            year++;
        } while(tuition <= 20000);
        System.out.println("Year: " + year);
        System.out.printf("Tuition will be $%.2f " + "in %d years",tuition,year);
        input.close();
    }
}