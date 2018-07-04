import javax.swing.JOptionPane;  //JOptionPane makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something.

public class DialogViewerInputWhileLoop {
    public static void main(String[] args)
    {
        int g = -1;
        while (g < 0)
        {
            String input = JOptionPane.showInputDialog("Please enter your name: ");  //here showInpputDialog is the method used.
            if(input.length() > 0)
            {
                g++;
                System.out.println("Thank You");

            }
            else
            {
                System.out.println("Enter your name!: ");
            }
        }

    }
}