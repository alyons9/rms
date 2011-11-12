/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author SAMIR
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.Color;
import org.xml.sax.SAXException;
import java.awt.*;

/**
 *
 * @author SAMIR
 */
public class adminLogInDialog extends JInternalFrame {//being

    private JTextField userNameValue;
    private JPasswordField passwordValue;
    private JLabel userName;
    private JLabel password;
    private JButton confirm;
    private JButton cancel;
    private JButton signUp;
    private JPanel adminEdit;
    private boolean succeeded;

    public adminLogInDialog(JPanel a) {//begin constructor


        // super(frame,"ADMINISTRATOR LOGIN",true);
        JPanel dialogPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        adminEdit = a;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        //adding the the label for the Username
        userName = new JLabel("Username: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        dialogPanel.add(userName, constraints);

        //addint the text field for the username
        userNameValue = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        dialogPanel.add(userNameValue, constraints);

        //adding the Jlabel for the password
        password = new JLabel("Password: ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        dialogPanel.add(password, constraints);

        //adding the  password filed to the message
        passwordValue = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        dialogPanel.add(passwordValue, constraints);

        //adding a border around th panel
        dialogPanel.setBorder(new LineBorder(Color.gray));

        confirm = new JButton("CONFIRM");

        ActionListener confirmButtonAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //throw new UnsupportedOperationException("Not supported yet.");
                    //authenticating the username and password
                    if (logIn.authentication(getUserName(), getPassword())) {
                        JOptionPane.showMessageDialog(adminLogInDialog.this,
                                "Hello " + getUserName() + "!! YOU HAVE SUCCESSFULLY LOGGED IN.", "LOGIN",
                                JOptionPane.INFORMATION_MESSAGE);
                        succeeded = true;
                        dispose();
                        AdminEditMenu adminMenu = new AdminEditMenu();
                        adminMenu.setVisible(true);
                        adminMenu.setSize(600,723);
                        adminMenu.setLocation(62,32);
                        adminEdit.add(adminMenu);
                        RMSGui.Logo.setVisible(false);
                        RMSGui.enterMenu.setVisible(false);
                        RMSGui.AdminLogin.setVisible(false);
                    
                    } else {//displaying a false if a username and password are incorrect
                        JOptionPane.showMessageDialog(adminLogInDialog.this, "INVALID USERNAME OR PASSWORD",
                                "LOGIN", JOptionPane.ERROR_MESSAGE);
                        userNameValue.setText("");
                        passwordValue.setText("");
                        succeeded = false;
                    }
                } catch (SAXException ex) {
                    Logger.getLogger(adminLogInDialog.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(adminLogInDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };//end of actionListener
        //attaching the actionListener for confirm button
        confirm.addActionListener(confirmButtonAction);

        cancel = new JButton("CANCEL");

        //actionlistener for cancel button
        ActionListener cancelButtonAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //   throw new UnsupportedOperationException("Not supported yet.");
                dispose();
            }
        };//end of actionListener

        cancel.addActionListener(cancelButtonAction);

        signUp = new JButton("SIGN UP");

        ActionListener signUpButtonAction = new ActionListener() {//signUP start

            @Override
            public void actionPerformed(ActionEvent ae) {
                //   throw new UnsupportedOperationException("Not supported yet.");
                signUpAdmin newUser = new signUpAdmin();
                System.out.println("im in adminlogin dialog");
                newUser.setVisible(true);
                dispose();
            }//action ended
        };//end of sign upactionListener

        signUp.addActionListener(signUpButtonAction);


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirm);
        buttonPanel.add(cancel);
        buttonPanel.add(signUp);

        getContentPane().add(dialogPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);


        pack();
        setResizable(false);

        // setLocationRelativeTo(frame);

    }//end of constructor

    //method to get the username
    public String getUserName() {
        String temp;
        temp = userNameValue.getText().trim();
        return temp;
    }

    //method to get the password
    public String getPassword() {
        String temp;
        temp = passwordValue.getText().trim();
        return temp;
    }

    //method to check if login was successful
    public boolean isSuccessful() {

        return succeeded;
    }
}//end class
