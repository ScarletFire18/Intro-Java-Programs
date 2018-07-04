import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first string: ");
        String stringCompare1 = in.next();

        System.out.println("Enter your second string: ");
        String stringCompare2 = in.next();

        if (stringCompare1.equals(stringCompare2))
            {
                System.out.print("The strings are equal");
            }
        else
            {
                System.out.print("The strings are not equal");
            }
    }
}