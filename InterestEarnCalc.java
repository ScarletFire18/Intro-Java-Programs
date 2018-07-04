import java.util.Scanner;

public class InterestEarnCalc
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
        System.out.println("Please enter your starting balance: ");
        float Balance = in.nextFloat();
        System.out.println("Please enter your annually earned interest rate");
        System.out.println("For example an interest rate of 4.99% would be entered as .0499: ");
        float interestRate = in.nextFloat();
        interestRate = interestRate + 1;
        System.out.println("Please enter number of years: ");
        int i = in.nextInt();
        int counter = 1;
        for (counter=1; counter <= i; counter++)
            {
                float Solution = Math.round((Balance * interestRate) * 100) / 100;
                System.out.println("At year "+counter+" your balance will be "+Solution);
                Balance = Solution;
            }
            }
}
