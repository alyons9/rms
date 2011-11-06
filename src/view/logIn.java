/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.xml.parsers.ParserConfigurationException;
import model.XmlPersistence.adminDao;
import model.admin;
import org.xml.sax.SAXException;
/**
 *
 * @author SAMIR
 */
class logIn {//begin class
    
    
    public static boolean authentication(String username, String password) throws SAXException, ParserConfigurationException{
    //variable for the xml user    
    String fileUserName = null;
    String filePassword = null;
    
    admin user;
    adminDao data = new adminDao();//creating admin database parser
    
    user = data.getUserByUserName(username);//get element by node
    fileUserName = user.getUserName();//get the username from database
    filePassword = user.getPassword();//get the password from database
        
    if(username.equals(fileUserName)&& password.equals(filePassword)){
            return true; 
        }
        else{
            return false;
        }
   
    
    }
    
    public static void addTo(String fName, String lName, String uName, String pWord) throws SAXException, ParserConfigurationException{
        adminDao newUser = new adminDao();
        newUser.addNewUser(fName, lName, uName, pWord);
    }
    
}//end class
