import java.util.Scanner;

public class Sumof10Integers
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter first integer: ");
        int integer1 = in.nextInt();
        System.out.println("Please enter second integer: ");
        int integer2 = in.nextInt();
        System.out.println("Please enter third integer: ");
        int integer3 = in.nextInt();
        System.out.println("Please enter fourth integer: ");
        int integer4 = in.nextInt();
        System.out.println("Please enter fifth integer: ");
        int integer5 = in.nextInt();
        System.out.println("Please enter sixth integer: ");
        int integer6 = in.nextInt();
        System.out.println("Please enter seventh integer: ");
        int integer7 = in.nextInt();
        System.out.println("Please enter eighth integer: ");
        int integer8 = in.nextInt();
        System.out.println("Please enter ninth integer: ");
        int integer9 = in.nextInt();
        System.out.println("Please enter tenth integer: ");
        int integer10 = in.nextInt();

        int sum = (integer1+integer2+integer3+integer4+integer5+integer6+integer7+integer8+integer9+integer10);
        System.out.println("The sum of the 10 integers that were entered is " + sum + ".");



    }

}
