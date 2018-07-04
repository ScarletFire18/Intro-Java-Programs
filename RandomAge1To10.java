import java.util.Scanner;

public class RandomAge1To10
{
    public static void main(String[] args)
    {
        int age = 1 + (int) (Math.random() * 11);
        System.out.println("Your age is  " + age);
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
                System.out.println("You can do math");
                break;
            case 7:
                System.out.println("You can do ride a bike");
                break;
            case 8:
                System.out.println("You can do chores");
                break;
            case 9:
                System.out.println("You can stay up late");
                break;
            case 10:
                System.out.println("You can learn new skills");
                break;

        }
    }
}
