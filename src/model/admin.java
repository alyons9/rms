/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author SAMIR
 */
public class admin {
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    
    public admin(){
        
    }
    public admin(String fName, String lName, String uName, String pWord){
        firstName = fName;
        lastName = lName;
        userName = uName;
        password = pWord;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
     public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   public String getUserName(){
       return userName;
   }
 
   public void setUserName(String userName){
       this.userName =userName;
   }
  
   public String getPassword(){
       return password;
   }
   
   public void setPassword(String password){
       this.password = password;
   }
    
    
}
