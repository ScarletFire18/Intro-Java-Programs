//Use switch statements when there are many cases to evaluate

import java.util.Scanner;

public class SwitchStatement_Age
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = in.nextInt();

        switch (age)
        {
            case 1:       //Note that cases use colons and not semicolons or braces!!  Do this when age = 1
                System.out.println("You can crawl.");
                break;
            case 2:      //Do this when age = 2
                System.out.println("You can walk.");
                break;
            case 3:
                System.out.println("You can talk.");
                break;
            case 4:
                System.out.println("You can get in trouble.");
                break;
            case 5:
                System.out.println("You can read.");
                break;
            case 6:
                System.out.println("You can crawl.");
                break;
            default:  //If none of the cases above evaluate to true, do this
                System.out.println("You are old enough to be in school");
        }
    }
}
