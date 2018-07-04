import java.util.Scanner;

public class Budget 
{

	public static void main(String[] args) 
	{
		//**Prompts user for salary and stores as variable "monthlySalary"**//
		
		Scanner in = new Scanner(System.in);
	System.out.print("Please input monthly salary in dollars: ");
	int monthlySalary = in.nextInt();
	
		//**Prompts user for expenses and stores as variable "monthlyExpenses"**//
	System.out.print("Please input monthly expenses in dollars: ");
	int monthlyExpenses = in.nextInt();
	
		//**Compute total Budget using salary - expenses**//
	int monthlyBudget = (monthlySalary - monthlyExpenses);
			
		//**Print result**//
	
	System.out.printf("Your monthly budget is: %6d", monthlyBudget);
	
	while (monthlyBudget > 0)
		{
		System.out.print(monthlyBudget);
		monthlyBudget = monthlyBudget - 50;
		}
	}

}
