import java.util.Scanner;

public class While {
    public static void main(String[] args)
    {
        int input = 0;
        int sum = 0;

        while(input >= 0)
        {
            sum = sum + input;
            System.out.println("Running total: " + sum );
            System.out.println("Please enter a positive integer to be added. To exit enter a negative integer: ");
            Scanner in = new Scanner (System.in);
            input = in.nextInt();

        }
        System.out.println("Goodbye!" );
    }


}