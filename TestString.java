
import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class TestString {
    public static void main(String args[])   //main class, initializes password prompt
    {
        Prompt();
    }

    private static void Prompt()  //Prompts user to enter password and stores into variable called password
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a password. The password should:");
        System.out.println("1. Be at least 6 characters long.");
        System.out.println("2. Contain at least one uppercase letter.");
        System.out.println("3. Contain at least one lowercase letter.");
        System.out.println("4. Contain at least one numerical digit.");
        String password = in.next();

        if (Length(password))      //calls length checking method and displays result
            System.out.println("Valid Length");
        else
            System.out.println("Invalid Length");

        if (Digit(password))    //calls digit checking method and displays result
            System.out.println("Sufficient number of numerical digits");
        else
            System.out.println("Insufficient number of numerical digits");

        if (Upper(password))    //calls upper case checking method and displays result
            System.out.println("Sufficient number of upper case digits");
        else
            System.out.println("Insufficient number of upper case digits");

        if (Lower(password))   //calls lower case checking method and displays result
            System.out.println("Sufficient number of lower case digits");
        else
            System.out.println("Insufficient number of lower case digits");

        if ((Lower(password)) && (Upper(password)) && (Digit(password)) && (Length(password)))
            //If all checker methods evaluate true, notifies user and exits program, otherwise re-initiates prompt
        {
            System.out.println("Password meets all requirements!");
            System.out.println("Terminating...");
            System.exit(0);
        }
        else
        Prompt();
    }


    private static Boolean Length(String password) ///checks minimum length requirement, returns true or false
    {
        return password.length() >= 6;
    }

    private static Boolean Digit(String password)   ///checks for at least one numeric, returns true or false
    {
        char n;
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            n = password.charAt(i);
            if (Character.isDigit(n))
                return true;
            else if (!Character.isDigit(n))
                count++;
        }
        return false;
    }

    private static Boolean Upper(String password)   //checks for at least one upper case, returns true or false
    {
        char u;
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            u = password.charAt(i);
            if (Character.isUpperCase(u))
                return true;
            else if (!Character.isUpperCase(u))
                count++;
        }
        return false;
    }

    private static Boolean Lower(String password)  //checks for at least one lower case, returns true or false
    {
        char l;
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            l = password.charAt(i);
            if (Character.isLowerCase(l))
                return true;
            else if (!Character.isLowerCase(l))
                count++;
        }
        return false;
    }
}