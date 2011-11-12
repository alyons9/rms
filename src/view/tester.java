/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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

  public void actionPerformed(ActionEvent e) {
  adminEditAppetizerMenu a = new adminEditAppetizerMenu();
  a.setVisible(true);
  add(a);
  a.repaint();

 
  } 
  public static void main(String []args){
      tester b = new tester();
      b.setVisible(true);
      b.setSize(new Dimension(700,400));
          b.repaint();
         
  }
}