
import java.util.Scanner;

public class Smaller
{
    public static void main(String[] args)
    {
        //**Declare variables**//

        int input1 = 0, input2 = 0;

        //**Prompt for 2 integers and store as input1 and input2**//

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first integer: ");
        input1 = in.nextInt();
        System.out.print("Please enter second integer: ");
        input2 = in.nextInt();

        //**Test for conditions and print results using if statements**//

        if (input1 < input2)
        {
            System.out.print("First integer was smaller");
        }
        else if (input2 < input1)
        {
            System.out.print("Second integer was smaller");
        }
        else
            System.out.print("Integers were equal");
    }

}
