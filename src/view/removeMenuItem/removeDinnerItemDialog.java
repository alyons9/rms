/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.removeMenuItem;

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
import model.XmlPersistence.DinnerDao;


/**
 *
 * @author SAMIR
 */
public class removeDinnerItemDialog extends JInternalFrame {//being
    
    private JTextField removeNameValue;
    
    private JLabel removeName;
    
    private JButton confirm;
    private JButton cancel;
   
    private JPanel adminEdit;
    private boolean succeeded;
    
    

    public removeDinnerItemDialog(final DinnerDao list, final JPanel panel) throws SAXException, ParserConfigurationException {//begin constructor

//        setRootPaneCheckingEnabled(false);
//    javax.swing.plaf.InternalFrameUI ifu= this.getUI();
//    ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
       
        setVisible(true);
        JPanel dialogPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
       
        constraints.fill = GridBagConstraints.HORIZONTAL;

        //adding the the label for the Username
        removeName = new JLabel("ITEM NAME: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        dialogPanel.add(removeName, constraints);

        //addint the text field for the username
        removeNameValue = new JTextField(20);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        dialogPanel.add(removeNameValue, constraints);

       

         //adding a border around th panel
        dialogPanel.setBorder(new LineBorder(Color.gray));

        confirm = new JButton("CONFIRM");

        ActionListener confirmButtonAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //System.out.print(getRemoveName());
                succeeded =false;
                succeeded = list.removeDinnerByName(getRemoveName());
                System.out.println(""+succeeded);
                    if(succeeded==true){
                        JOptionPane.showMessageDialog(removeDinnerItemDialog.this,
                                "YOU HAVE SUCCESSFULLY DELETED THE ITEM.", "ITEM DELETION",
                                JOptionPane.INFORMATION_MESSAGE);
                        
                        dispose();
                        panel.repaint();
                    }
                    else{
                         JOptionPane.showMessageDialog(removeDinnerItemDialog.this, "PROBLEM DELETING ITEM",
                                "ITEM DELETION", JOptionPane.ERROR_MESSAGE);
                        removeNameValue.setText("");     
                        
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

       

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirm);
        buttonPanel.add(cancel);
       

        getContentPane().add(dialogPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);


        pack();
        setResizable(true);

        // setLocationRelativeTo(frame);

    }//end of constructor

    //method to get the username
    public String getRemoveName() {
        String temp;
        temp = removeNameValue.getText().trim();
        return temp;
    }

    
}//end class
