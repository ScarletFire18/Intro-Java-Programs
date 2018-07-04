import java.util.Scanner;

public class IntPlusFloat
{
    public static void main (String[] args)
    {
        float sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int integer = in.nextInt();
        System.out.println("Please enter a decimal number: ");
        float decimal = in.nextFloat();
        sum = integer + decimal;
        System.out.println(" " + integer + " + " + decimal + " = " + sum);
    }
}