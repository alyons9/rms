/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author SAMIR
 */
class logIn {//begin class
    
    
    public static boolean authentication(String username, String password){
    String fileUserName = null;
    String filePassword = null;
    
        if(username.equals(fileUserName)&& password.equals(filePassword)){
            return true; 
        }
        else{
            return false;
        }
   
    
    }
    
}//end class
