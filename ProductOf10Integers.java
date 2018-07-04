import java.util.Scanner;

public class ProductOf10Integers
{
    public static void main (String[] args)
    {

        //**used longs instead of integers because the numbers get too large and outside the range of ints. Normally would use arrays here but this is Chapter 1 code//
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter first integer: ");
        long integer1 = in.nextLong();
        System.out.println("Please enter second integer: ");
        long integer2 = in.nextLong();
        System.out.println("Please enter third integer: ");
        long integer3 = in.nextLong();
        System.out.println("Please enter fourth integer: ");
        long integer4 = in.nextLong();
        System.out.println("Please enter fifth integer: ");
        long integer5 = in.nextLong();
        System.out.println("Please enter sixth integer: ");
        long integer6 = in.nextLong();
        System.out.println("Please enter seventh integer: ");
        long integer7 = in.nextLong();
        System.out.println("Please enter eighth integer: ");
        long integer8 = in.nextLong();
        System.out.println("Please enter ninth integer: ");
        long integer9 = in.nextLong();
        System.out.println("Please enter tenth integer: ");
        long integer10 = in.nextLong();

        long product = (integer1*integer2*integer3*integer4*integer5*integer6*integer7*integer8*integer9*integer10);
        System.out.println("The product of the 10 integers that were entered is " + product + ".");



    }

}