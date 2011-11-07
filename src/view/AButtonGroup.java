package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;	
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class AButtonGroup {
  public static void main(String args[]) {
    Runnable runner = new Runnable() {
      public void run() {
        final JFrame frame = new JFrame("Button Group");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Border border =
          BorderFactory.createTitledBorder("Examples");
       JPanel  b = new JPanel();
       
        JButton ab = new JButton("test");
           ab.setSize(30,30);
        b.add(ab);
        frame.add(b);
        
        frame.setSize(100, 100);
        frame.setVisible(true);
        
          ActionListener cancelButtonAction = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
             //   throw new UnsupportedOperationException("Not supported yet.");
              //addAppetizerMenu a;
                        try {
                            JFrame newframe = new JFrame();
                            newframe.setSize(600,700);
                            newframe.setVisible(true);
                            addAppetizerMenu a = new addAppetizerMenu();
                             newframe.add(a);
                          
             // a.setVisible(true);
              
              
                        } catch (SAXException ex) {
                            Logger.getLogger(AButtonGroup.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ParserConfigurationException ex) {
                            Logger.getLogger(AButtonGroup.class.getName()).log(Level.SEVERE, null, ex);
                        }
             
            }
              
      };//end of actionListener
        ab.addActionListener(cancelButtonAction);
        
      }
     
    };
    
     
    EventQueue.invokeLater(runner);
  }
 
}

