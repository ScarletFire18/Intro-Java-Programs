/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Domain;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author nkeyapo
 */
public class AmazonUserDemo {
    
    public static void main(String[] args) throws Exception {
        
        AmazonUser Userdemo = new AmazonUser();
        Scanner keyboard = new Scanner(System.in);
        
        
        String name = JOptionPane.showInputDialog("Enter username: ");
        String pass = JOptionPane.showInputDialog("Enter password: ");
        
        try
        {
            
            Userdemo.setUsername(name);
            Userdemo.setPassword(pass);
            
            System.out.println(Userdemo.getUsername());
            System.out.println(Userdemo.getPassword());
            
            
        }
        catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
             
    }
    
}
