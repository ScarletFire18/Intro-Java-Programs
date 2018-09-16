import java.io.*;  // Needed for IOException

/**
   This program uses the WeeklySalesReader class
   to read sales from a file and get
   their averages.
*/

public class Sales
{
   public static void main(String[] args)
                      throws IOException
{               
      double average;         // Weekly sales average
      double sum;             //Weekly sales sum
      double salesWeek = 1;  // Control variable
      double totalSum = 0;  //adds weekly sums together
      double weeklyAverage = 0;  //Average sales per week
      
      // Create a WeeklySalesReader object.
      SalesReader saleReader =
                  new SalesReader("SalesData.txt");
      // Display the averages
      while (saleReader.readNextLine())
      {
         // Get the weekly average and weekly sum from the WeeklySalesReader.
         average = saleReader.getAverage();
         sum = saleReader.getWeeklySum();
         
         //Tally Total Sales
         totalSum = totalSum + sum;
         
         // Display the weekly sales average.
         System.out.println("Average for sales for week " +
                            salesWeek + " is " +
                            average);  
         //Display the weekly sum.
         System.out.println("Total sales for week " +
                            salesWeek + " is " +
                            Math.round((sum) * 100) / 100d); 
         
         // Increment the sales week.
         salesWeek++;
         
      }
      
      weeklyAverage = Math.round((totalSum / (salesWeek-1)) * 100) / 100d;
        
      // Print out total sum and weeklyAverage, and close the saleReader.
      saleReader.close();
      System.out.println("\nGrand total sales for all weeks is " + totalSum + "." + 
      "\nAverage weekly sales for all weeks is " + weeklyAverage + "." +
      "\nNo more sales.");
   }
}