/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author SAMIR
 */
public class signUpAdmin extends JDialog {
   private JLabel userNameAdd;
  private JLabel passwordAdd;
  private JLabel fNameAdd;
  private JLabel lNameAdd;
  
  private JTextField userNameAddValue;
  private JTextField passwordAddValue;
  private JTextField fNameAddValue;
  private JTextField lNameAddValue;
  
  private JButton okButton;
  private JButton cancelButton;
  
  public signUpAdmin(){
       JPanel dialogPanel2 = new JPanel(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();
      
      constraints.fill = GridBagConstraints.HORIZONTAL;
      
      //adding the the label for the Username
      
      fNameAdd = new JLabel("First Name: ");
      constraints.gridx = 0;
      constraints.gridy = 0;
      constraints.gridwidth = 2;
      dialogPanel2.add(fNameAdd, constraints);
      
       fNameAddValue = new JTextField(20);
      constraints.gridx = 1;
      constraints.gridy = 0;
      constraints.gridwidth = 2;
      dialogPanel2.add(fNameAddValue,constraints);
      
       lNameAdd = new JLabel("Last Name: ");
      constraints.gridx = 0;
      constraints.gridy = 1;
      constraints.gridwidth = 2;
      dialogPanel2.add(lNameAdd, constraints);
      
       lNameAddValue = new JTextField(20);
      constraints.gridx = 1;
      constraints.gridy = 1;
      constraints.gridwidth = 2;
      dialogPanel2.add(lNameAddValue,constraints);
      
      
      userNameAdd = new JLabel("User Name: ");
      constraints.gridx = 0;
      constraints.gridy = 2;
      constraints.gridwidth = 2;
      dialogPanel2.add(userNameAdd, constraints);
      
      //addint the text field for the username
      userNameAddValue = new JTextField(20);
      constraints.gridx = 1;
      constraints.gridy = 2;
      constraints.gridwidth = 2;
      dialogPanel2.add(userNameAddValue,constraints);
      
      //adding the Jlabel for the password
      passwordAdd = new JLabel("Password: ");
      constraints.gridx = 0;
      constraints.gridy = 3;
      constraints.gridwidth = 1;
      dialogPanel2.add(passwordAdd,constraints);
      
      //adding the  password filed to the message
      passwordAddValue = new JPasswordField(20);
      constraints.gridx = 1;
      constraints.gridy = 3;
      constraints.gridwidth = 2;
      dialogPanel2.add(passwordAddValue,constraints);
  
      //adding a border around th panel
      dialogPanel2.setBorder(new LineBorder(Color.BLUE));
      
      okButton = new JButton("SUBMIT");
      
      ActionListener okButtonAction = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    //   throw new UnsupportedOperationException("Not supported yet.");
                           logIn.addTo(getFirstNameValue(),getLastNameValue(),getUserNameValue(),getPasswordValue());
                           System.out.println("Im in signupadmin");
                           dispose();
                           adminLogInDialog dialogBox = new adminLogInDialog(new JPanel());
                           dialogBox.setVisible(true);
                } catch (SAXException ex) {
                    Logger.getLogger(signUpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(signUpAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
  
      };//end of actionListener
      
      //add action listener
      okButton.addActionListener(okButtonAction);
      
      JPanel buttonPanel = new JPanel();
      buttonPanel.add(okButton);
      
      getContentPane().add(dialogPanel2, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
        
        pack();
        setResizable(false);
      
      
  }//end constructor
    //method to get the username
  public String getFirstNameValue(){
      String temp;
      temp = fNameAddValue.getText();
      return temp;
  }
  
   public String getLastNameValue(){
      String temp;
      temp = lNameAddValue.getText();
      return temp;
  }
  public String getUserNameValue(){
      String temp;
      temp = userNameAddValue.getText().trim();
      return temp;
  }
  
  //method to get the password
  public String getPasswordValue(){
      String temp;
      temp = passwordAddValue.getText().trim();
      return temp;
  }
  
 
  
  //method to check if login was successful

}
