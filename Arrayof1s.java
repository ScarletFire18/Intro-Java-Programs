import java.util.Arrays;
import java.util.Scanner;

public class Arrayof1s {
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int[] inputArray = new int[10];
        for(int i = 0; i<=9; i++)
        {
            inputArray[i] = 1;
        }
        System.out.print(Arrays.toString(inputArray));

    }
}
