import java.text.DecimalFormat;
import java.util.*;
public class FinancialApplication 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("The amount invested: ");
        double investment = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double annualRate = input.nextDouble();

        double monthlyRate = (annualRate / 100.0) / 12.0;

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        System.out.println("Years\t\tFutureValue");

        for(int i = 1; i <= years; i++)
        {
            System.out.println(i + "\t\t" + df.format(futureInvestmentValue(investment, monthlyRate, i)));
        }
        input.close();
    }
    
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
    {
        double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        return futureValue;
    }
}