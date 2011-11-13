/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addAppetizerMenu.java
 *
 * Created on Nov 6, 2011, 5:07:46 PM
 */
package view.addMenus;

import Controller.CartListeners.AddFoodItemActionListener;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.xml.parsers.ParserConfigurationException;
import model.Cart;
import model.Food;
import model.XmlPersistence.AppetizersDao;
import org.xml.sax.SAXException;

/**
 *
 * @author SAMIR
 */
public class addAppetizerMenu extends javax.swing.JPanel {
    private AppetizersDao nodeList;
    private Food food[];
    private int sizeOfList;
    private JLabel nameLabels[];
    private JButton buttons[];
    private String[] appIconName;
    private Icon[] appIconPic;
    private JLabel[] appDesLabels;
    private JSpinner spinner[];
    private JLabel[] prices;
    private ImageIcon[] icon;
    
    /** Creates new form addAppetizerMenu */
    public addAppetizerMenu(Cart cart) {
        try {
            initComponents();
           // setPreferredSize(new Dimension(300,12000));
         // setLayout(new GridLayout(sizeOfList*sizeOfList,5));
         
      // setLayout(new FlowLayout());
         //setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
          setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
           
          
        AppetizersDao nodeList = new AppetizersDao();
        
        //getting the size of list of appetizers
        sizeOfList = nodeList.length();
        //initializing the food array of that list
        food = new Food[sizeOfList];
        System.out.println(sizeOfList);
                
        //store all the food in to the food array variable
        food = nodeList.getAllAppetizers();
        //initializing the arrays of size of the list
        buttons = new JButton[sizeOfList];
        
        nameLabels = new JLabel[sizeOfList];
        appDesLabels = new JLabel[sizeOfList];
        spinner = new JSpinner[sizeOfList];
        prices = new JLabel[sizeOfList];
        icon = new ImageIcon[sizeOfList];
        
        
    
    //System.out.println(food[0].getPic());
//   JLabel b = new JLabel("test");
//    b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/Images/pizza.jpg")));
//    add(b);
   for(int i=0; i <sizeOfList; i++){
//        appIconName[i] = food[i].getPic();
//        System.out.println(appIconName[i]);
//        appIconPic[i] = new ImageIcon(appIconName[i]);
        icon[i] = createImageIcon(food[i].getPic());
        nameLabels[i] = new JLabel(food[i].getName());//appIconPic[i],JLabel.CENTER);
        
        if(icon[i]!=null){
            nameLabels[i].setIcon(icon[i]);
        }
        //nameLabels[i].setIcon(new javax.swing.ImageIcon(getClass().getResource(food[i].getPic())));
        buttons[i] = new JButton("ADD");
        buttons[i].setPreferredSize(new Dimension(70,30));
     
        buttons[i].setActionCommand(food[i].getName());
        buttons[i].addActionListener(new AddFoodItemActionListener(food[i],cart));
        appDesLabels[i] = new JLabel(food[i].getDescription());
       // appDesLabels[i].setPreferredSize(new Dimension(30,30));
        spinner[i] = new JSpinner(new SpinnerNumberModel(0, 0, 15, 1));
     //   spinner[i].setPreferredSize(new Dimension(20,20));
        prices[i] = new JLabel(""+food[i].getPrice());
        System.out.println(i);
        add(nameLabels[i]);
        add(appDesLabels[i]);
        add(spinner[i]);
        add(prices[i]);
        add(buttons[i]);
        JSeparator a = new JSeparator();
        add(a);
     
     } 
        
        } catch (SAXException ex) {
            Logger.getLogger(addAppetizerMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(addAppetizerMenu.class.getName()).log(Level.SEVERE, null, ex);
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
}
