public class RunCrapsTenThousandTimes 
{
    public static void main(String []args)
    {
        final int NUMBER_OF_GAMES_PLAYED = 10000;        
        int game = 1;
        int count = 1;

        do
        {
            int dice1 = (int)(1 + Math.random() * 5);
            int dice2 = (int)(1 + Math.random() * 5);

            if(win(dice1, dice2))
            {
                //System.out.println("You rolled " + dice1 + " + "+ dice2 + " = " + (dice1 + dice2) + "\nYou win");
                count++;
            }
            else if(lose(dice1, dice2))
            {
                //System.out.println("You rolled " + dice1 + " + "+ dice2 + " = " + (dice1 + dice2) + "\nYou lose");
            }
            else if(dice1 + dice2 >= 4 || dice1 + dice2 <= 10) // if you roll anything between 4 & 10 you get a second chance
            {
                System.out.println("You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                int point = (dice1 + dice2);
                System.out.println("point is " + point);

                dice1 = (int)(1 + Math.random() * 5);
                dice2 = (int)(1 + Math.random() * 5);

                System.out.println(checkPoint(dice1,dice2,point) ? "You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2) + "\nYou Win" + (count++): 
                                                                   "You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2) +"\nYou lose");
            }
            game++;
        }while(game <= NUMBER_OF_GAMES_PLAYED);

        System.out.println("Number of winning games is: " + count);
         
    }

    public static boolean checkPoint(int dice1, int dice2, int point)
    {
        if((dice1 + dice2) == point || (dice1 + dice2) == 7 || (dice1 + dice2) == 11)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean win(int dice1, int dice2)
    {
        boolean win = false;
        if(dice1 + dice2 == 7 || dice1 + dice2 == 11)
        {
            win = true;
        }
        return win;
    }
    public static boolean lose(int dice1, int dice2)
    {
        boolean lose = false;
        
        if(dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12)
        {
            lose = true;
        }
        return lose;
    }    
    
}