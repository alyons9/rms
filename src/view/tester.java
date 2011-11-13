/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import view.editMenus.adminEditAppetizerMenu;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import view.addItemToMenu.addItemToAppetizerMenu;
import view.editMenus.adminEditBreakfastMenu;

public class tester extends JFrame implements ActionListener {
  /* Declaration */
  private Container Panel;
  private LayoutManager Layout;
  private JButton Button1;
  private JButton Button2;
  private JButton Button3;
  private JTextField Command;

  public tester () {
   
      
      /* Instantiation */
    Layout = new FlowLayout();
    Panel = getContentPane ();
    Button1 = new JButton ("Red Background");
    
    
    /* Location */
    Panel.setLayout (Layout);
    Panel.add (Button1);
   
    
    /* Configuration */
    Button1.addActionListener (this);
    Button1.setActionCommand ("red");
   
   
    
    /* Decoration */
   
  }

    @Override
  public void actionPerformed(ActionEvent e) {
  adminEditAppetizerMenu a = null;
  
        try {
            a = new adminEditAppetizerMenu();
        } catch (SAXException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        }
  a.setVisible(true);
  JScrollPane temp = new JScrollPane(a);
  temp.setVisible(true);
  temp.setSize(500,500);
  add(temp);
  //add(a);
  temp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
  temp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
  a.repaint();
  repaint();
  
  addItemToAppetizerMenu temp2 = null;
  try {
          temp2 = new addItemToAppetizerMenu();
        } catch (SAXException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(tester.class.getName()).log(Level.SEVERE, null, ex);
        }
        temp2.setVisible(true);
        temp2.setSize(500,500);
        
        add(temp2);
  } 
  public static void main(String []args){
      tester b = new tester();
      b.setVisible(true);
      b.setSize(new Dimension(700,800));
          b.repaint();
         
  }
}