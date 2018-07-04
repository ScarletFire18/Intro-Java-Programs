public class Random1to20
{
    public static void main (String[] args)
    {
        int random = 1 + (int) (Math.random() * 20);
        System.out.print("Your random integer between 1 and 20 is: " + random + "    ");
    }
}
