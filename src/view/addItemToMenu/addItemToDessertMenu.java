/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addItemToAppetizerMenu.java
 *
 * Created on Nov 12, 2011, 7:44:12 PM
 */
package view.addItemToMenu;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import model.XmlPersistence.AppetizersDao;
import model.XmlPersistence.BreakfastDao;
import model.XmlPersistence.DessertDao;
import org.xml.sax.SAXException;
import view.adminLogInDialog;

/**
 *
 * @author SAMIR
 */
public class addItemToDessertMenu extends javax.swing.JPanel {

        private DessertDao list;
        private String Name;
        private String Description;
        private Double Price;
        private String PictureName;
        private String temp;
    
    /** Creates new form addItemToAppetizerMenu */
    public addItemToDessertMenu() throws SAXException, ParserConfigurationException {
        initComponents();
        setVisible(true);
      jLabel1.setText("Add To Your Dessert Menu");
        list = new DessertDao();
        
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        itemName = new javax.swing.JLabel();
        itemDescription = new javax.swing.JLabel();
        itemPrice = new javax.swing.JLabel();
        itemPic = new javax.swing.JLabel();
        itemNameValue = new javax.swing.JTextField();
        itemDescriptionValue = new javax.swing.JTextField();
        itemPriceValue = new javax.swing.JTextField();
        itemPictureValue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setText("Add To Your Appetizer Menu");

        itemName.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        itemName.setText("Item Name:");

        itemDescription.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        itemDescription.setText("Description:");

        itemPrice.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        itemPrice.setText("Price:");

        itemPic.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        itemPic.setText("Picture In File:");

        itemPriceValue.setText("0");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(itemDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemPic))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemNameValue)
                                    .addComponent(itemPictureValue, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(itemPriceValue, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(itemDescriptionValue, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemName)
                    .addComponent(itemNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemDescriptionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPriceValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPictureValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemPic))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     list.addDessert(getItemName(),getItemDescriptionName(), 1,getItemPrice(),getPictureName());
    //System.out.println(getItemName()+' '+getItemDescriptionName()+" " + getItemPrice()+" "+getPictureName());
        JOptionPane.showMessageDialog(this,
    "YOUR ITEM HAS BEEN ADDED!!!",
    "CONFIRMATION DIALOG",
    JOptionPane.WARNING_MESSAGE);
        try {
            adminLogInDialog.dessertMenu.setUpComponents();
        } catch (SAXException ex) {
            Logger.getLogger(addItemToDessertMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(addItemToDessertMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}//GEN-LAST:event_jButton1ActionPerformed

public String getItemName(){
    String temp;
    temp = itemNameValue.getText().trim();
    return temp;
}

public String getItemDescriptionName(){
    String temp;
    temp = itemDescriptionValue.getText().trim();
    return temp;
}

public double getItemPrice(){
    double temp;
    temp = Double.parseDouble(itemPriceValue.getText().trim());
    return temp;
}

public String getPictureName(){
    String temp;
    temp = "/Database/Images/Dessert/" + itemPictureValue.getText().trim();
    return temp;
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemDescription;
    private javax.swing.JTextField itemDescriptionValue;
    private javax.swing.JLabel itemName;
    private javax.swing.JTextField itemNameValue;
    private javax.swing.JLabel itemPic;
    private javax.swing.JTextField itemPictureValue;
    private javax.swing.JLabel itemPrice;
    private javax.swing.JTextField itemPriceValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
