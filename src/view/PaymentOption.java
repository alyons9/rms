/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PaymentOption.java
 *
 * Created on Nov 12, 2011, 3:13:10 PM
 */
package view;
import javax.swing.*;
import java.awt.*;
import model.Cart;
import model.Drink;
import model.Food;
/**
 *
 * @author Jamel Jenkins
 */
public class PaymentOption extends javax.swing.JPanel {
public static JDialog cashframe;
public static JDialog debitframe;
public static String[] types = {"Visa", "Discover", "MasterCard", "AmericanExpress"};
public static JLabel cardPics = new JLabel();
public static JLabel debit = new JLabel("Debit/Credit Cards");
public static JLabel billing = new JLabel("Billing Information");
public static JLabel name = new JLabel("Name on Card:");
public static JLabel street = new JLabel("Street Address:");
public static JLabel city = new JLabel("City:");
public static JLabel stateZip = new JLabel("State and Zip:");
public static JLabel country = new JLabel("Country:");
public static JLabel email = new JLabel("Email:");
public static JLabel emailConfirm = new JLabel("Confirm Email:");
public static JTextField nameField = new JTextField(30);
public static JTextField numberField = new JTextField(30);
public static JTextField securityField = new JTextField(3);
public static JTextField streetField = new JTextField(30);
public static JTextField cityField = new JTextField(30);
public static JTextField zipField = new JTextField(30);
public static JTextField emailField = new JTextField(30);
public static JTextField emailConfirmField = new JTextField(30);
public static JLabel card = new JLabel("Card Type:");
public static JComboBox cardType = new JComboBox(types);
public static JLabel Expiration = new JLabel("Expiration Date:");
public static String[] months = {"1", "2", "3", "4", "5", "6", "7","8", "9", "10", "11", "12"};
public static JComboBox expMonth = new JComboBox(months);
public static String[] states = {"","Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut","Delaware", "Florida", "Georgia", "Hawaii",
     "Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
     "Montana","Nebraska","Nevada","New Hampshire","New Jersey", "New MExico", "New York", "North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania",
     "Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont", "Virginia","West Virginia","Wisconsin","Wyoming"};
public static JComboBox stateslist = new JComboBox(states);
public static String[] countries = {"USA", "Canada", "United Kingdom", "India", "Guyana", "China", "Japan"};
public static JComboBox countrieslist = new JComboBox(countries);
public static String[] years = {"2011", "2012", "2013", "2014", "2015", "2016", "2017"};
public static JComboBox expYear = new JComboBox(years);
public static JLabel cardNumber = new JLabel("Card Number:");
public static JLabel cardSecure = new JLabel("Card Security Number:");
public static Cart cart;
    /** Creates new form PaymentOption */
    public PaymentOption() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selection = new javax.swing.ButtonGroup();
        Cash = new javax.swing.JRadioButton();
        Debit = new javax.swing.JRadioButton();

        Selection.add(Cash);
        Cash.setFont(new java.awt.Font("AR DARLING", 0, 18)); // NOI18N
        Cash.setText("Cash");
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        Selection.add(Debit);
        Debit.setFont(new java.awt.Font("AR DARLING", 0, 18)); // NOI18N
        Debit.setText("Debit/Credit");
        Debit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Cash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(Debit)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cash)
                    .addComponent(Debit))
                .addContainerGap(599, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
      int cashPane = JOptionPane.showConfirmDialog(
                      cashframe, "Are You Sure That You Want To Pay In Cash",
                      "Payment Option",
                      JOptionPane.YES_NO_OPTION);   
      
      if (cashPane == JOptionPane.YES_OPTION) {
      int total = JOptionPane.showConfirmDialog(null,"Your Total is: $" + RMSGui.cart.getTotal() + "\n Is This Correct?");
      if(total == JOptionPane.YES_OPTION){
      JOptionPane.showMessageDialog(null,"The Waitress/Waiter Will Be There Shortly To Receive Your Payment!"
              + " Thank You for Choosing Cnerds Cafe'");
    RMSGui.paymentScrollPane.setVisible(false);
    RMSGui.PaymentLogo.setVisible(false);
    RMSGui.confirm2.setVisible(false);
    RMSGui.confirmback.setVisible(false);
    RMSGui.confirm.setVisible(false);
    RMSGui.Logo.setVisible(true);
    RMSGui.AdminLogin.setVisible(true);
    RMSGui.enterMenu.setVisible(true);
    RMSGui.Logo2.setVisible(false);
    RMSGui.home.setVisible(false);
    RMSGui.Logo3.setVisible(false);
    RMSGui.home2.setVisible(false);
    RMSGui.back.setVisible(false);
    RMSGui.viewback.setVisible(false);
    RMSGui.viewcart.setVisible(false);
    RMSGui.drinks.setVisible(false);
    RMSGui.separator.setVisible(false);
    RMSGui.breakfast.setVisible(false);
    RMSGui.lunch.setVisible(false);
    RMSGui.dinner.setVisible(false);
    RMSGui.desserts.setVisible(false);
    RMSGui.MenuLogo.setVisible(false);
    RMSGui.CartLogo.setVisible(false);
    RMSGui.viewScrollPane.setVisible(false);
    RMSGui.CarryOut.setVisible(false);
    RMSGui.dineIn.setVisible(false);
    RMSGui.Reservations.setVisible(false);
    RMSGui.appetizers.setVisible(false);
    RMSGui.appetizersPane.setVisible(false);
    RMSGui.breakfastPane.setVisible(false);
    RMSGui.lunchPane.setVisible(false);
    RMSGui.dinnerPane.setVisible(false);
    RMSGui.dessertPane.setVisible(false);
    RMSGui.drinksPane.setVisible(false);
    repaint();
      }
      }
    }//GEN-LAST:event_CashActionPerformed

    private void DebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebitActionPerformed
     int cashPane = JOptionPane.showConfirmDialog(
                      cashframe, "Are You Sure That You Want To Pay With a Debit/Credit Card",
                      "Payment Option",
                      JOptionPane.YES_NO_OPTION);   
     if (cashPane == JOptionPane.YES_OPTION) {
         RMSGui.confirmback.setVisible(true);
         debit.setVisible(true);
         debit.setLocation(20,50);
         debit.setSize(200,100);
         debit.setForeground(new java.awt.Color(0, 0, 0));
         debit.setFont(new java.awt.Font("AR DARLING", 0, 18));
         add(debit);
         cardPics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CreditCardLogos.png")));
         cardPics.setVisible(true);
         cardPics.setLocation(250,55);
         cardPics.setSize(200,100);
         add(cardPics);
         name.setVisible(true);
         name.setLocation(60,100);
         name.setSize(200,100);
         name.setForeground(new java.awt.Color(0, 0, 0));
         name.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(name);
         nameField.setVisible(true);
         nameField.setLocation(170,143);
         nameField.setSize(300,20);
         add(nameField);
         cardType.setVisible(true);
         cardType.setLocation(155,173);
         cardType.setSize(100,20);
         add(cardType);
         card.setVisible(true);
         card.setLocation(60,130);
         card.setSize(200,100);
         card.setForeground(new java.awt.Color(0, 0, 0));
         card.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(card);
         cardNumber.setVisible(true);
         cardNumber.setLocation(60,160);
         cardNumber.setSize(200,100);
         cardNumber.setForeground(new java.awt.Color(0, 0, 0));
         cardNumber.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(cardNumber);
         numberField.setVisible(true);
         numberField.setLocation(165,203);
         numberField.setSize(300,20);
         add(numberField);
         Expiration.setVisible(true);
         Expiration.setLocation(60,190);
         Expiration.setSize(200,100);
         Expiration.setForeground(new java.awt.Color(0, 0, 0));
         Expiration.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(Expiration);
         expMonth.setVisible(true);
         expMonth.setLocation(183,233);
         expMonth.setSize(40,20);
         add(expMonth);
         expYear.setVisible(true);
         expYear.setLocation(225,233);
         expYear.setSize(70,20);
         add(expYear);
         cardSecure.setVisible(true);
         cardSecure.setLocation(60,220);
         cardSecure.setSize(200,100);
         cardSecure.setForeground(new java.awt.Color(0, 0, 0));
         cardSecure.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(cardSecure);
         securityField.setVisible(true);
         securityField.setLocation(230,263);
         securityField.setSize(70,20);
         add(securityField);
         billing.setVisible(true);
         billing.setLocation(20,265);
         billing.setSize(200,100);
         billing.setForeground(new java.awt.Color(0, 0, 0));
         billing.setFont(new java.awt.Font("AR DARLING", 0, 18));
         add(billing);
         street.setVisible(true);
         street.setLocation(60,300);
         street.setSize(200,100);
         street.setForeground(new java.awt.Color(0, 0, 0));
         street.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(street);
         city.setVisible(true);
         city.setLocation(60,330);
         city.setSize(200,100);
         city.setForeground(new java.awt.Color(0, 0, 0));
         city.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(city);
         stateZip.setVisible(true);
         stateZip.setLocation(60,360);
         stateZip.setSize(200,100);
         stateZip.setForeground(new java.awt.Color(0, 0, 0));
         stateZip.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(stateZip);
         country.setVisible(true);
         country.setLocation(60,390);
         country.setSize(200,100);
         country.setForeground(new java.awt.Color(0, 0, 0));
         country.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(country);
         email.setLocation(60,420);
         email.setSize(200,100);
         email.setForeground(new java.awt.Color(0, 0, 0));
         email.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(email);
         emailConfirm.setLocation(60,450);
         emailConfirm.setSize(200,100);
         emailConfirm.setForeground(new java.awt.Color(0, 0, 0));
         emailConfirm.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(emailConfirm);
         streetField.setVisible(true);
         streetField.setLocation(180,345);
         streetField.setSize(300,20);
         add(streetField);
         cityField.setVisible(true);
         cityField.setLocation(100,375);
         cityField.setSize(300,20);
         add(cityField);
         stateslist.setVisible(true);
         stateslist.setLocation(168,403);
         stateslist.setSize(100,20);
         add(stateslist);
         zipField.setVisible(true);
         zipField.setLocation(275,403);
         zipField.setSize(100,20);
         add(zipField);
         countrieslist.setVisible(true);
         countrieslist.setLocation(138,433);
         countrieslist.setSize(100,20);
         add(countrieslist);
         emailField.setVisible(true);
         emailField.setLocation(128,463);
         emailField.setSize(200,20);
         add(emailField);
         emailConfirmField.setVisible(true);
         emailConfirmField.setLocation(168,493);
         emailConfirmField.setSize(200,20);
         add(emailConfirmField);
         repaint();
         
     }
    }//GEN-LAST:event_DebitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cash;
    private javax.swing.JRadioButton Debit;
    private javax.swing.ButtonGroup Selection;
    // End of variables declaration//GEN-END:variables
}
