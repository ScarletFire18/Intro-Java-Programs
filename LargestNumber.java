
import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)
    {
        //**Declare variables**//

        int input1 = 0, input2 = 0, input3 = 0, largest = 0;

        //**Prompt for 3 integers and store as input1, input 2, and input3**//

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        input1 = in.nextInt();
        System.out.print("Please enter second integer: ");
        input2 = in.nextInt();
        System.out.print("Please enter third integer: ");
        input3 = in.nextInt();

        //**Compares integers and prints the largest**//

        if ((input1 > input2) && (input1 > input3))
        {
            System.out.print("First integer, " + input1 + ", is the largest,");
        }
        else if ((input2 > input1) && (input2 > input3))
        {
            System.out.print("Second integer, " + input2 + ", is the largest,");
        }
        else if ((input3 > input1) && (input3 > input2))
        {
            System.out.print("Third integer, " + input3 + ", is the largest,");
        }
        else
            System.out.print("Integers were all equal");
    }

}
