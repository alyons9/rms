/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addAppetizerMenu.java
 *
 * Created on Nov 6, 2011, 5:07:46 PM
 */
package view.editMenus;

import view.addMenus.addAppetizerMenu;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.xml.parsers.ParserConfigurationException;
import model.Food;


import model.XmlPersistence.DinnerDao;
import org.xml.sax.SAXException;

import view.changePrice.changeDinnerPrice;
import view.removeMenuItem.removeDessertItemDialog;
import view.removeMenuItem.removeDinnerItemDialog;

/**
 *
 * @author SAMIR
 */
public class adminEditDinnerMenu extends javax.swing.JPanel implements ActionListener {
    private DinnerDao nodeList;
    private Vector <Food> food;
    private int sizeOfList;
    private Vector <JLabel> nameLabels;
    private Vector <JComboBox> buttons;
    private Vector <String> appIconName;
    private Vector <Icon> appIconPic;
    private Vector <JLabel> appDesLabels;
    private Vector <JSpinner> spinner;
    private Vector <JLabel> prices;
    private Vector <ImageIcon> icon;
    private String list[];
    private DinnerDao secList;
    public JPanel dialog;
    /** Creates new form addAppetizerMenu */
    public adminEditDinnerMenu () throws SAXException, ParserConfigurationException {
       
            initComponents();
           // setPreferredSize(new Dimension(300,12000));
         // setLayout(new GridLayout(sizeOfList*sizeOfList,5));
         
      // setLayout(new FlowLayout());
         //setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
         
          setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
          
          setUpComponents();
        
    
  
    
    }
    
    
    public void setUpComponents() throws SAXException, ParserConfigurationException{
        
          DinnerDao nodeList = new DinnerDao();
        
        //getting the size of list of appetizers
       sizeOfList = nodeList.length();
        
        //initializing the food array of that list
        food = new Vector(sizeOfList);
        System.out.println(sizeOfList);
                
        //store all the food in to the food array variable
        food = nodeList.getVectorAllDinners();
        //initializing the arrays of size of the list
        buttons = new Vector(sizeOfList);
        
        nameLabels = new Vector(sizeOfList);
        appDesLabels = new Vector(sizeOfList);
        spinner = new Vector(sizeOfList);
        prices = new Vector(sizeOfList);
        icon = new Vector(sizeOfList);
        list = new String[2];
        list[0] = "CHANGE PRICE";
        list[1] = "REMOVE";
        
    
    System.out.println(food.get(0).getPic());
//   JLabel b = new JLabel("test");
//    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/Images/pizza.jpg")));
//    add(b);
   for(int i=0; i <sizeOfList; i++){
//        appIconName[i] = food[i].getPic();
//        System.out.println(appIconName[i]);
//        appIconPic[i] = new ImageIcon(appIconName[i]);
      //  icon[i] = createImageIcon(food[i].getPic());
        nameLabels.add(i, new JLabel(food.get(i).getName()));//appIconPic[i],JLabel.CENTER);
        //nameLabels[i].setIcon(icon[i]);
        nameLabels.get(i).setIcon(new javax.swing.ImageIcon(getClass().getResource(food.get(i).getPic())));
        buttons.add(i, new JComboBox(list));
        buttons.get(i).setPreferredSize(new Dimension(70,30));
        buttons.get(i).setFocusCycleRoot(true);
         buttons.get(i).setActionCommand(food.get(i).getName());
         buttons.get(i).addActionListener(this);
       
        prices.add(i,new JLabel(""+food.get(i).getPrice()));
        System.out.println(i);
        add(nameLabels.get(i));
        add(prices.get(i));
        add(buttons.get(i));
        JSeparator a = new JSeparator();
        add(a);
     
     } 
        
    }
    
    protected ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet.");
     JComboBox temp =(JComboBox) ae.getSource();
     String selection = (String)temp.getSelectedItem();
     String aCommand = ae.getActionCommand();
     System.out.println(aCommand);
     
        if(selection.equals("REMOVE")){
            removeDinnerItemDialog c = null;
            try {
                DinnerDao secList = new DinnerDao();
                c = new removeDinnerItemDialog(secList,this,aCommand);
                repaint();
            } catch (SAXException ex) {
                Logger.getLogger(adminEditAppetizerMenu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(adminEditAppetizerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.setVisible(true);
//          dialog.add(c);
//          add(dialog);
            add(c);
            repaint();
            setFocusable(true);
            System.out.println("im trying to display the dialgo");
        }  
        else{
             changeDinnerPrice price = null;
            try {
                DinnerDao secList2 = new DinnerDao();
                price = new changeDinnerPrice(secList2,this, aCommand);
                repaint();
            } catch (SAXException ex) {
                Logger.getLogger(adminEditDinnerMenu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(adminEditDinnerMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            price.setVisible(true);
//          dialog.add(c);
//          add(dialog);
            add(price);
            repaint();
            setFocusable(true);
                        System.out.println("im trying to display the Change Dialog");
            
        }
    }

    
}
