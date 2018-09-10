/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author nkeyapo
 */
public class AmazonUser {
    
    private String username;
    private String password;
    
    /**
     * Default Constructor of the Class AmazonUser
     * @throws Exception 
     */
    public AmazonUser() throws Exception {
        
        username = "";
        password = "";
        
    }
    
    /**
     * 
     * @param name
     * @param pass
     * @throws Exception 
     */
    public AmazonUser(String name, String pass) throws Exception {
        
        setUsername(name);
        setPassword(pass);
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)throws Exception{
        
        /**
         * Stored the password in the array with toCharArray
         * 
         */
        
        if( password.length() >=6 && password.matches(".*\\d+.*") && !password.equals(password.toLowerCase()) && !password.equals(password.toUpperCase()))
        { 
            this.password = password ;
        }
        
        else
        {
            if(password.length() < 6)
            {throw new Exception("Invalid password! Your password must contain at least six characters.");}
            if(!password.matches(".*\\d+.*"))
            {throw new Exception("Invalid password! Your password must contain at least a digit.");}  
            if(password.equals(password.toLowerCase()))
            {throw new Exception("Invalid password! Your password must contain at least an uppercase letter.");} 
            if(password.equals(password.toUpperCase()))
            {throw new Exception("Invalid password! Your password must contain at least a lower letter.");} 
          
        }
            
            
        
                
    } //End of the Setter setPassword

} //End of Class AmazonUser
