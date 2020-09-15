import java.util.*;
public class FinancialTaxApplication 
{
    public static void main(String [] args)
    {
        System.out.println("Taxable\t\tSingle\t\tMarried\t\tMarried\t\tHead of");
        System.out.println("Income\t\t\t\tJoint\t\tSperate\t\tHouse");
        System.out.println("---------------------------------------------------------------------");
        
        for(int i = 50000; i <= 60000; i += 50)
        {
            System.out.print(i);
            for(int j = 0; j <= 3; j++)
            {
                System.out.print("\t\t" + Math.round(computeTax(j, i)));
            }
            System.out.println();
        }
    }

    public static double computeTax(int status, double taxableIncomce)
    {
        switch (status)
        {
            case 0: return 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncomce - 33950) * 0.25;// single
            case 1: return 16700 * 0.10 + (taxableIncomce - 16701) * 0.15 ;  // Married
            case 2: return 8350 * 0.10 + (33950 - 8351) * 0.15 + (taxableIncomce - 33951) * 0.25;// Married Seperate
            case 3: return 11950 * 0.10 + (45500 - 11951) * 0.15 + (taxableIncomce - 45501) * 0.25;// Head of a house
        }

        return 0.0;
    }
}