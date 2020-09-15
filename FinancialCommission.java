import java.util.*;
public class FinancialCommission 
{
    public static void main(String [] args)
    {
        System.out.println("Sales Amount\tCommission");
        System.out.println("--------------------------------");
        
        for(int i = 10000; i <= 100000; i+= 5000)
        {
            System.out.println(i + "\t\t" + computeCommission(i));
        }
        
    }

    public static double computeCommission(double saleAmount)
    {
        double commissionRate, balance;
        commissionRate = 0; balance = 0;

            if(saleAmount > 10000.01)
            {
                commissionRate += (balance = saleAmount - 10000) * 0.12;
            }
            if(saleAmount > 5000.01)
            {
                commissionRate += (balance -= saleAmount - 5000) * 0.10;
            }
            if(saleAmount > 0.01)
            {
                commissionRate += balance * 0.08;
            }

        return commissionRate;
    }
}