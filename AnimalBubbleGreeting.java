import java.util.Scanner;

public class AnimalBubbleGreeting
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        int stringLength = name.length();
        System.out.print("   /\\_/\\    ");
        for (int counter=1; counter <= stringLength; counter++)
        {
            System.out.print("_");
        }
        System.out.println();
        System.out.print("  ( ' ' )  /");
        for (int counter=1; counter <= stringLength; counter++)
        {
            System.out.print(" ");
        }
        System.out.print("\\");
        System.out.println();
        System.out.print("  (  -  )<  "+name+" >");
        System.out.println();
        System.out.print("   | | |   \\");
        for (int counter=1; counter <= stringLength; counter++)
        {
            System.out.print("_");
        }
        System.out.print("/");
        System.out.println();
        System.out.print("  (__|__)   ");

        //for (int counter=1; counter <= stringLength + 4; counter++)
        //{ System.out.print("-");}
    }
}