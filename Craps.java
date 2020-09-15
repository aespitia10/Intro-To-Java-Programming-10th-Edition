public class Craps
{
    public static void main(String []args)
    {
        int dice1 = (int)(1 + Math.random() * 5);
        int dice2 = (int)(1 + Math.random() * 5);

        // if(dice1 + dice2 == 7 || dice1 + dice2 == 11) // if you roll a 7 or 11 you WIN 
        // {
        //     System.out.println("You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2));
        //     System.out.println("You win");
        // }

        // else if(dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) // if you roll a 2,3,12 you lose
        // {
        //     System.out.println("You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2));
        //     System.out.println("You lose");
        // }

        if(dice1 + dice2 >= 4 || dice1 + dice2 <= 10) // if you roll anything between 4 & 10 you get a second chance
        {
            System.out.println("You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2));
            int point = (dice1 + dice2);
            System.out.println("point is " + point);

            dice1 = (int)(1 + Math.random() * 5);
            dice2 = (int)(1 + Math.random() * 5);

            System.out.println(checkPoint(dice1,dice2,point) ? "You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2) + "\nYou Win" : "You rolled "+ dice1 + " + " + dice2 + " = " + (dice1 + dice2) +"\nYou lose");
        }
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