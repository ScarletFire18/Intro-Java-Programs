
import java.util.Scanner;

public class Larger
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

        if (input1 > input2)
        {
            System.out.print("First integer was greater");
        }
        else if (input1 < input2)
        {
            System.out.print("Second integer was greater");
        }
        else
            System.out.print("Integers were equal");
        }

    }

