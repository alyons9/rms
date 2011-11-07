/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addAppetizerMenu.java
 *
 * Created on Nov 6, 2011, 5:07:46 PM
 */
package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.xml.parsers.ParserConfigurationException;
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
    private JTextField[] quantaty;
    private JLabel[] prices;
    
    /** Creates new form addAppetizerMenu */
    public addAppetizerMenu() throws SAXException, ParserConfigurationException {
        initComponents();
        
      //setLayout(new GridLayout(sizeOfList*sizeOfList,3));
     
     //setLayout(new FlowLayout());
     setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
      
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
    quantaty = new JTextField[sizeOfList];
    prices = new JLabel[sizeOfList];
    
   // System.out.println(food[0].getPic());
    //Icon a = new ImageIcon("/Images/bonelessWings.png");
   // System.out.print(a);
   // JLabel b = new JLabel("test");
   // b.setIcon(new javax.swing.ImageIcon(getClass().getResource("Breakfast Button.png")));
   // add(b);
   
     for(int i=0; i <sizeOfList; i++){
      //  appIconName[i] = food[i].getPic();
      //  appIconPic[i] = new ImageIcon(appIconName[i]);
        nameLabels[i] = new JLabel(food[i].getName());//,appIconPic[i],JLabel.CENTER);
        buttons[i] = new JButton("ADD");
        buttons[i].setSize(70,30);
        buttons[i].setActionCommand(food[i].getName());
        buttons[i].addActionListener(null);
        appDesLabels[i] = new JLabel(food[i].getDescription());
        quantaty[i] = new JTextField(2);
        quantaty[i].setSize(1, 2);
        prices[i] = new JLabel(""+food[i].getPrice());
        System.out.println(i);
        add(nameLabels[i]);
        add(appDesLabels[i]);
        add(quantaty[i]);
        add(prices[i]);
        add(buttons[i]);
        //JSeperator a = new JSeperator();
     
     }
   
   
    
    
    
    //get all of the appetizers from the xml file
        //and store it in a food variable of array
       food =nodeList.getAllAppetizers();
        
        
        
          
    
    
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
