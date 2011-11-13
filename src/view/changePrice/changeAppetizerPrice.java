/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.changePrice;

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
import model.XmlPersistence.AppetizersDao;
import view.adminLogInDialog;

/**
 *
 * @author SAMIR
 */
public class changeAppetizerPrice extends JInternalFrame {//being
    
    private JTextField priceNameValue;
    
    private JLabel priceName;
    
    private JButton confirm;
    private JButton cancel;
   
    private JPanel adminEdit;
    private boolean succeeded;
    
    

    public changeAppetizerPrice(final AppetizersDao list, final JPanel panel,final String foodName) throws SAXException, ParserConfigurationException {//begin constructor

//        setRootPaneCheckingEnabled(false);
//    javax.swing.plaf.InternalFrameUI ifu= this.getUI();
//    ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
       
    setVisible(true);
        JPanel dialogPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
       
        constraints.fill = GridBagConstraints.HORIZONTAL;

        //adding the the label for the Username
        priceName = new JLabel("ENTER PRICE TO BE CHANGED");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        dialogPanel.add(priceName, constraints);

        //addint the text field for the username
        priceNameValue = new JTextField(20);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        dialogPanel.add(priceNameValue, constraints);

       

         //adding a border around th panel
        dialogPanel.setBorder(new LineBorder(Color.gray));

        confirm = new JButton("CONFIRM");

        ActionListener confirmButtonAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              //System.out.print(getRemoveName());
                succeeded =false;
                succeeded = list.setPriceByName(foodName, Double.parseDouble(getPriceName()));
                System.out.println(""+succeeded);
                    if(succeeded==true){
                        JOptionPane.showMessageDialog(changeAppetizerPrice.this,
                                "YOU HAVE SUCCESSFULLY CHANGED THE PRICE.", "PRICE CHANGE",
                                JOptionPane.INFORMATION_MESSAGE);
                        
                        dispose();
                        panel.repaint();
                        adminLogInDialog.appetizerMenu.removeAll();
                    try {
                        adminLogInDialog.appetizerMenu.setUpComponents();
                    } catch (SAXException ex) {
                        Logger.getLogger(changeAppetizerPrice.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ParserConfigurationException ex) {
                        Logger.getLogger(changeAppetizerPrice.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                     adminLogInDialog.appetizersEditPane.revalidate();
                    
                    }
                    else{
                         JOptionPane.showMessageDialog(changeAppetizerPrice.this, "PROBLEM CHANGING PRICE",
                                "PRICE CHANGE", JOptionPane.ERROR_MESSAGE);
                        priceNameValue.setText("");     
                        
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
    public String getPriceName() {
        String temp;
        temp = priceNameValue.getText().trim();
        return temp;
    }

    
}//end class
