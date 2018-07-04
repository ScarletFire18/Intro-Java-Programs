import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int[] inputArray = new int[10];
        for(int i = 0; i<=9; i++)
        {
            System.out.println("Enter integer " +(i+1)+ ":");
            inputArray[i] = in.nextInt();
        }
System.out.print(Arrays.toString(inputArray));

    }
}
