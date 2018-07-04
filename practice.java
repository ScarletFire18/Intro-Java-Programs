import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int product = 1;
        int input = 0;
        int counter = 0;
        Scanner in = new Scanner(System.in);
        for (counter = 0; counter < 25; counter++) {
            System.out.println("Please enter an integer from 1-500, or '-1' to quit: ");
            input = in.nextInt();
            if
                (input > 0 && input < 101)
            {
                product = product * input;
                System.out.println(" " + product);
            }
            else
                System.exit(0) ;

        }
    }
}
