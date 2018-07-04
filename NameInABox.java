import java.util.Scanner;

public class NameInABox
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        int stringLength = name.length();
        for (int counter=1; counter <= stringLength + 4; counter++)
            {
                System.out.print("-");
            }
        System.out.println();
        System.out.println("| "+ name + " |");

        for (int counter=1; counter <= stringLength + 4; counter++)
                { System.out.print("-");}
    }
}
