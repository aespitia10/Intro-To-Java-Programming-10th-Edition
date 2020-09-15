public class LinearSearch 
{
    public static void main(String [] args)
    {
        int[] list = {1,4,4,2,5,-3,6,2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, 2);
        int k = linearSearch(list, -4);
        int l = linearSearch(list, 1);
        int m = linearSearch(list, -5);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
        System.out.println("l: " + l);
        System.out.println("m: " + m);



    }

    public static int linearSearch(int[] list, int key)
    {
        for(int i = 0; i < list.length; i++)
        {
            if(key == list[i])
            {
                return i;
            }
        }
        return -1;
    }
}