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
import java.awt.event.*;
import model.Cart;
import model.Drink;
import model.Food;
import view.addMenus.CartView;
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
public static JLabel receiptSlip = new JLabel("Receipt");
public static JLabel billing = new JLabel("Billing Information");
public static JLabel name = new JLabel("Name on Card:");
public static JLabel street = new JLabel("Street Address:");
public static JLabel city = new JLabel("City:");
public static JLabel stateZip = new JLabel("State and Zip:");
public static JLabel country = new JLabel("Country:");
public static JLabel purchases = new JLabel("Items Order");
public static JLabel email = new JLabel("Email:");
//public static JLabel emailConfirm = new JLabel("Confirm Email:");
public static JTextField nameField = new JTextField(30);
public static JTextField numberField = new JTextField(30);
public static JTextField securityField = new JTextField(3);
public static JTextField streetField = new JTextField(30);
public static JTextField cityField = new JTextField(30);
public static JTextField zipField = new JTextField(30);
public static JTextField emailField = new JTextField(30);
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
        RMSGui.confirmback.addActionListener(confirmBackListener);
        RMSGui.confirm.addActionListener(cartConfirmListener);
        RMSGui.confirm2.addActionListener(paymentConfirmListener);
    }
    //method to get the Cardholder Name
    public String getName() {
        String name2;
        name2 = nameField.getText().trim();
        return name2;
    }
    
    //method to get the Card Type
     public String getCardType() {
        String temp;
        temp = cardType.getSelectedItem().toString();
        return temp;
    }
     
    //method to get the Card Number
     public String getCardNumber() {
        String temp;
        temp = numberField.getText().trim();
        return temp;
    }
     
    //method to get the Expiration Month
     public String getExpMonth() {
        String temp;
        temp = expMonth.getSelectedItem().toString();
        return temp;
    }
     
     //method to get the Expiration Year
     public String getExpYear() {
        String temp;
        temp = expYear.getSelectedItem().toString();
        return temp;
    }
     
     //method to get the Street Address
     public String getStreet() {
        String temp;
        temp = street.getText().trim();
        return temp;
    }
     
    //method to get the City
     public String getCity() {
        String temp;
        temp = city.getText().trim();
        return temp;
    }
     
    //method to get the State
     public String getState() {
        String temp;
        temp = stateslist.getSelectedItem().toString();
        return temp;
    }
    
     //method to get the Zip Code
     public String getZip() {
        String temp;
        temp = zipField.getText().trim();
        return temp;
    }
     
    //method to get the Country 
     public String getCountry() {
        String temp;
        temp = countrieslist.getSelectedItem().toString();
        return temp;
    }
    
    //method to get the Email Address
     public String getEmail() {
        String temp;
        temp = email.getText().trim();
        return temp;
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

        getAccessibleContext().setAccessibleName("PaymentPanel");
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
         debit.setVisible(false);
         cardPics.setVisible(false);
         name.setVisible(false);
         nameField.setVisible(false);
         cardType.setVisible(false);
         card.setVisible(false);
         cardNumber.setVisible(false);
         numberField.setVisible(false);
         Expiration.setVisible(false);
         expMonth.setVisible(false);
         expYear.setVisible(false);
         cardSecure.setVisible(false);
         securityField.setVisible(false);
         billing.setVisible(false);
         street.setVisible(false);
         city.setVisible(false);
         stateZip.setVisible(false);
         country.setVisible(false);
         email.setVisible(false);
         //emailConfirm.setVisible(false);
         streetField.setVisible(false);
         cityField.setVisible(false);
         stateslist.setVisible(false);
         zipField.setVisible(false);
         countrieslist.setVisible(false);
         emailField.setVisible(false);
         //emailConfirmField.setVisible(false);
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
         RMSGui.viewback.setVisible(false);
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
         email.setVisible(true);
         email.setLocation(60,420);
         email.setSize(200,100);
         email.setForeground(new java.awt.Color(0, 0, 0));
         email.setFont(new java.awt.Font("AR DARLING", 0, 16));
         add(email);
         //emailConfirm.setVisible(true);
         //emailConfirm.setLocation(60,450);
         //emailConfirm.setSize(200,100);
         //emailConfirm.setForeground(new java.awt.Color(0, 0, 0));
         //emailConfirm.setFont(new java.awt.Font("AR DARLING", 0, 16));
         //add(emailConfirm);
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
         //emailConfirmField.setVisible(true);
         //emailConfirmField.setLocation(168,493);
         //emailConfirmField.setSize(200,20);
         //add(emailConfirmField);
           RMSGui.confirm2.setVisible(true);
           RMSGui.home.setVisible(false);
           RMSGui.viewback.setVisible(false);
           RMSGui.confirmback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cancel Button.png")));
           RMSGui.confirmback.setVisible(true);
           RMSGui.confirmback.setSize(75,40);
           RMSGui.confirmback.setLocation(405,710);
         repaint();
         
     } else if (cashPane == JOptionPane.NO_OPTION) {
         repaint();
           setVisible(true);
           Cash.setVisible(true);
           Debit.setVisible(true);
           RMSGui.CartLogo.setVisible(false);
           RMSGui.viewScrollPane.setVisible(false);
           RMSGui.viewcart.setVisible(false);
           RMSGui.paymentScrollPane.setVisible(true);
           RMSGui.paymentScrollPane.setSize(522,625);
           RMSGui.paymentScrollPane.setLocation(173,78);
           RMSGui.Tablet.add(RMSGui.paymentScrollPane);
           RMSGui.PaymentLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Payment Logo.png")));
           RMSGui.Tablet.add(RMSGui.PaymentLogo);
           RMSGui.PaymentLogo.setLocation(280,10);
           RMSGui.PaymentLogo.setVisible(true);
           RMSGui.PaymentLogo.setSize(320,88);
           RMSGui.confirm.setVisible(false);
           RMSGui.confirm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Confirm Button.png")));
           RMSGui.confirm2.setVisible(false);
           RMSGui.confirm2.setSize(75,40);
           RMSGui.confirm2.setLocation(580,710);
           RMSGui.Tablet.add(RMSGui.confirm2);
           RMSGui.home.setVisible(false);
           RMSGui.viewback.setVisible(false);
           RMSGui.confirmback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cancel Button.png")));
           RMSGui.confirmback.setVisible(true);
           RMSGui.confirmback.setSize(75,40);
           RMSGui.confirmback.setLocation(580,710);
           RMSGui.Tablet.add(RMSGui.confirmback);
           PaymentOption.debit.setVisible(false);
            PaymentOption.cardPics.setVisible(false);
            PaymentOption.name.setVisible(false);
            PaymentOption.nameField.setVisible(false);
            PaymentOption.cardType.setVisible(false);
            PaymentOption.card.setVisible(false);
            PaymentOption.cardNumber.setVisible(false);
            PaymentOption.numberField.setVisible(false);
            PaymentOption.Expiration.setVisible(false);
            PaymentOption.expMonth.setVisible(false);
            PaymentOption.expYear.setVisible(false);
            PaymentOption.cardSecure.setVisible(false);
            PaymentOption.securityField.setVisible(false);
            PaymentOption.billing.setVisible(false);
            PaymentOption.street.setVisible(false);
            PaymentOption.city.setVisible(false);
            PaymentOption.stateZip.setVisible(false);
            PaymentOption.country.setVisible(false);
            PaymentOption.email.setVisible(false);
            //PaymentOption.emailConfirm.setVisible(false);
            PaymentOption.streetField.setVisible(false);
            PaymentOption.cityField.setVisible(false);
            PaymentOption.stateslist.setVisible(false);
            PaymentOption.zipField.setVisible(false);
            PaymentOption.countrieslist.setVisible(false);
            PaymentOption.emailField.setVisible(false);
            //PaymentOption.emailConfirmField.setVisible(false);
            RMSGui.paymentScrollPane.setVisible(true);
            RMSGui.confirm2.setVisible(false);
           repaint();
         
     }
    }//GEN-LAST:event_DebitActionPerformed

ActionListener confirmBackListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
          int cancelPane = JOptionPane.showConfirmDialog(
                      RMSGui.confirmframe, "Are You Sure That You Want To Cancel?",
                      "Cancel Confirmation",
                      JOptionPane.YES_NO_OPTION);  
    if (cancelPane == JOptionPane.YES_OPTION) {
    RMSGui.home2.setVisible(false);
    RMSGui.confirm.setVisible(false);
    RMSGui.CarryOut.setVisible(false);
    RMSGui.dineIn.setVisible(false);
    RMSGui.Reservations.setVisible(false);
    RMSGui.appetizers.setVisible(false);
    RMSGui.Logo.setVisible(false);
    RMSGui.Logo2.setVisible(false);
    RMSGui.Logo3.setVisible(false);
    RMSGui.AdminLogin.setVisible(false);
    RMSGui.enterMenu.setVisible(false);
    RMSGui.separator.setVisible(true);
    RMSGui.separator.setSize(20,750);
    RMSGui.separator.setLocation(150,30);
    RMSGui.separator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    RMSGui.separator.setBackground(new java.awt.Color(0, 0, 0));
    RMSGui.MenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Menu Logo.png")));
    //CarryOutLogo.setVisible(true);
    //CarryOutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CarryOut Logo.png")));
    RMSGui.Tablet.add(RMSGui.separator);
    RMSGui.Tablet.add(RMSGui.MenuLogo);
    RMSGui.appetizersPane.setVisible(false);
    RMSGui.MenuLogo.setVisible(true);
    RMSGui.MenuLogo.setSize(272,88);
    RMSGui.MenuLogo.setLocation(290,10);
    //Tablet.add(CarryOutLogo);
    //CarryOutLogo.setSize(272,88);
    //CarryOutLogo.setLocation(290,10);
    RMSGui.appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Appetizers Button.png")));
    RMSGui.appetizers.setVisible(true);
    RMSGui.appetizers.setSize(110,62);
    RMSGui.appetizers.setLocation(35,48);
    RMSGui.Tablet.add(RMSGui.appetizers);
    RMSGui.breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Breakfast Button.png")));
    RMSGui.breakfast.setVisible(true);
    RMSGui.breakfast.setSize(110,62);
    RMSGui.breakfast.setLocation(35,165);
    RMSGui.Tablet.add(RMSGui.breakfast);
    RMSGui.lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lunch Button.png")));
    RMSGui.lunch.setVisible(true);
    RMSGui.lunch.setSize(110,62);
    RMSGui.lunch.setLocation(35,282);
    RMSGui.Tablet.add(RMSGui.lunch);
    RMSGui.dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dinner Button.png")));
    RMSGui.dinner.setVisible(true);
    RMSGui.dinner.setSize(110,62);
    RMSGui.dinner.setLocation(35,399);
    RMSGui.Tablet.add(RMSGui.dinner);
    RMSGui.desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Desserts Button.png")));
    RMSGui.desserts.setVisible(true);
    RMSGui.desserts.setSize(110,62);
    RMSGui.desserts.setLocation(35,516);
    RMSGui.Tablet.add(RMSGui.desserts);
    RMSGui.drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Drinks Button.png")));
    RMSGui.drinks.setVisible(true);
    RMSGui.drinks.setSize(110,62);
    RMSGui.drinks.setLocation(35,633);
    RMSGui.Tablet.add(RMSGui.drinks);
    RMSGui.home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    RMSGui.home.setVisible(true);
    RMSGui.home.setSize(75,40);
    RMSGui.home.setLocation(220,710);
    RMSGui.Tablet.add(RMSGui.home);
    RMSGui.back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    RMSGui.back.setVisible(true);
    RMSGui.back.setSize(75,40);
    RMSGui.back.setLocation(400,710);
    RMSGui.Tablet.add(RMSGui.back);
    RMSGui.viewback.setVisible(false);
    RMSGui.viewcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ViewCart Button.png")));
    RMSGui.viewcart.setVisible(true);
    RMSGui.viewcart.setSize(75,40);
    RMSGui.viewcart.setLocation(580,710);
    RMSGui.viewScrollPane.setVisible(false);
    RMSGui.CartLogo.setVisible(false);
    RMSGui.Tablet.add(RMSGui.viewcart);
    RMSGui.confirmback.setVisible(false);
    PaymentOption.debit.setVisible(false);
    PaymentOption.cardPics.setVisible(false);
    PaymentOption.name.setVisible(false);
    PaymentOption.nameField.setVisible(false);
    PaymentOption.cardType.setVisible(false);
    PaymentOption.card.setVisible(false);
    PaymentOption.cardNumber.setVisible(false);
    PaymentOption.numberField.setVisible(false);
    PaymentOption.Expiration.setVisible(false);
    PaymentOption.expMonth.setVisible(false);
    PaymentOption.expYear.setVisible(false);
    PaymentOption.cardSecure.setVisible(false);
    PaymentOption.securityField.setVisible(false);
    PaymentOption.billing.setVisible(false);
    PaymentOption.street.setVisible(false);
    PaymentOption.city.setVisible(false);
    PaymentOption.stateZip.setVisible(false);
    PaymentOption.country.setVisible(false);
    PaymentOption.email.setVisible(false);
    //PaymentOption.emailConfirm.setVisible(false);
    PaymentOption.streetField.setVisible(false);
    PaymentOption.cityField.setVisible(false);
    PaymentOption.stateslist.setVisible(false);
    PaymentOption.zipField.setVisible(false);
    PaymentOption.countrieslist.setVisible(false);
    PaymentOption.emailField.setVisible(false);
    //PaymentOption.emailConfirmField.setVisible(false);
    PaymentOption.Debit.setVisible(false);
    PaymentOption.Cash.setVisible(false);
    RMSGui.paymentScrollPane.setVisible(false);
    RMSGui.PaymentLogo.setVisible(false);
    RMSGui.confirm2.setVisible(false);
    RMSGui.appetizersPane.setVisible(false);
    RMSGui.breakfastPane.setVisible(false);
    RMSGui.dessertPane.setVisible(false);
    RMSGui.lunchPane.setVisible(false);
    RMSGui.dinnerPane.setVisible(false);
    RMSGui.drinksPane.setVisible(false);
    setVisible(false);
    repaint();
        }
        }};

ActionListener cartConfirmListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    int confirmPane = JOptionPane.showConfirmDialog(
                      RMSGui.confirmframe, "Is Your Order Correct?",
                      "Order Confirmation",
                      JOptionPane.YES_NO_OPTION);
           repaint();
   if (confirmPane == JOptionPane.YES_OPTION) {
           repaint();
           setVisible(true);
           Cash.setVisible(true);
           Debit.setVisible(true);
           RMSGui.CartLogo.setVisible(false);
           RMSGui.viewScrollPane.setVisible(false);
           RMSGui.viewcart.setVisible(false);
           RMSGui.paymentScrollPane.setVisible(true);
           RMSGui.paymentScrollPane.setSize(522,625);
           RMSGui.paymentScrollPane.setLocation(173,78);
           RMSGui.Tablet.add(RMSGui.paymentScrollPane);
           RMSGui.PaymentLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Payment Logo.png")));
           RMSGui.Tablet.add(RMSGui.PaymentLogo);
           RMSGui.PaymentLogo.setLocation(280,10);
           RMSGui.PaymentLogo.setVisible(true);
           RMSGui.PaymentLogo.setSize(320,88);
           RMSGui.confirm.setVisible(false);
           RMSGui.confirm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Confirm Button.png")));
           RMSGui.confirm2.setVisible(false);
           RMSGui.confirm2.setSize(75,40);
           RMSGui.confirm2.setLocation(580,710);
           RMSGui.Tablet.add(RMSGui.confirm2);
           RMSGui.home.setVisible(false);
           RMSGui.viewback.setVisible(false);
           RMSGui.confirmback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cancel Button.png")));
           RMSGui.confirmback.setVisible(true);
           RMSGui.confirmback.setSize(75,40);
           RMSGui.confirmback.setLocation(580,710);
           RMSGui.Tablet.add(RMSGui.confirmback);
           repaint();
            } else if (confirmPane == JOptionPane.NO_OPTION) {
            RMSGui.paymentScrollPane.setVisible(false);
            RMSGui.PaymentLogo.setVisible(false);
            RMSGui.confirm2.setVisible(false);
            RMSGui.confirmback.setVisible(false);
            RMSGui.Logo.setVisible(false);
            RMSGui.AdminLogin.setVisible(false);
            RMSGui.enterMenu.setVisible(false);
            RMSGui.Logo2.setVisible(false);
            RMSGui.home.setVisible(true);
            RMSGui.back.setVisible(false);
            RMSGui.viewback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
            RMSGui.viewback.setVisible(true);
            RMSGui.viewback.setSize(75,40);
            RMSGui.viewback.setLocation(400,710);
            RMSGui.Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cnerds Cafe Side.png")));
            RMSGui.Logo3.setVisible(true);
            RMSGui.Logo3.setSize(400,650);
            RMSGui.Logo3.setLocation(50,70);
            RMSGui.Tablet.add(RMSGui.Logo3);
            RMSGui.Tablet.add(RMSGui.viewback);
            RMSGui.viewcart.setVisible(false);
            RMSGui.drinks.setVisible(false);
            RMSGui.separator.setVisible(true);
            RMSGui.breakfast.setVisible(false);
            RMSGui.lunch.setVisible(false);
            RMSGui.dinner.setVisible(false);
            RMSGui.desserts.setVisible(false);
            RMSGui.MenuLogo.setVisible(false);
            RMSGui.CartLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cart Button.png")));
            RMSGui.Tablet.add(RMSGui.CartLogo);
            RMSGui.CartLogo.setLocation(280,10);
            RMSGui.CartLogo.setVisible(true);
            RMSGui.CartLogo.setSize(320,88);
            RMSGui.viewPanel.setVisible(false);
            RMSGui.home2.setVisible(false);
            //CarryOutLogo.setVisible(false);
            //DineInLogo.setVisible(false);
            RMSGui.CarryOut.setVisible(false);
            RMSGui.dineIn.setVisible(false);
            RMSGui.Reservations.setVisible(false);
            RMSGui.appetizers.setVisible(false);
            RMSGui.appetizersPane.setVisible(false);
            RMSGui.viewScrollPane.setVisible(true);
            RMSGui.viewScrollPane.setBackground(new java.awt.Color(0, 0, 0));
            RMSGui.viewScrollPane.setSize(522,625);
            RMSGui.viewScrollPane.setLocation(173,78);
            RMSGui.Tablet.add(RMSGui.viewScrollPane);
            RMSGui.confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Confirm Button.png")));
            RMSGui.confirm.setVisible(true);
            RMSGui.confirm.setSize(75,40);
            RMSGui.confirm.setLocation(580,710);
            RMSGui.Tablet.add(RMSGui.confirm);
            RMSGui.PaymentLogo.setVisible(false);
            repaint();
                  }
        }};

ActionListener paymentConfirmListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
      int total = JOptionPane.showConfirmDialog(null,"Your Total is: $" + RMSGui.cart.getTotal() + "\n Is This Correct?");
      if (total == JOptionPane.YES_OPTION) {
      int paymentPane = JOptionPane.showConfirmDialog(
                      RMSGui.confirmframe, "Are You Sure That Your Card Information Is Correct?",
                      "Debit/Credit Card Confirmation",
                      JOptionPane.YES_NO_OPTION);
        if (paymentPane == JOptionPane.YES_OPTION) {
            setVisible(true);
            PaymentOption.debit.setVisible(false);
            PaymentOption.receiptSlip.setVisible(true);
            PaymentOption.receiptSlip.setLocation(20,25);
            PaymentOption.receiptSlip.setSize(200,100);
            PaymentOption.receiptSlip.setForeground(new java.awt.Color(0, 0, 0));
            PaymentOption.receiptSlip.setFont(new java.awt.Font("AR DARLING", 0, 18));
            add(PaymentOption.receiptSlip);
            PaymentOption.cardPics.setVisible(false);
            PaymentOption.name.setVisible(false);
            PaymentOption.nameField.setVisible(false);
            PaymentOption.cardType.setVisible(false);
            PaymentOption.card.setVisible(false);
            PaymentOption.cardNumber.setVisible(false);
            PaymentOption.numberField.setVisible(false);
            PaymentOption.Expiration.setVisible(true);
            PaymentOption.expMonth.setVisible(false);
            PaymentOption.expYear.setVisible(false);
            PaymentOption.cardSecure.setVisible(false);
            PaymentOption.securityField.setVisible(false);
            PaymentOption.billing.setVisible(false);
            PaymentOption.street.setVisible(false);
            PaymentOption.city.setVisible(false);
            PaymentOption.stateZip.setVisible(false);
            PaymentOption.country.setVisible(false);
            PaymentOption.email.setVisible(false);
            //PaymentOption.emailConfirm.setVisible(false);
            PaymentOption.streetField.setVisible(false);
            PaymentOption.cityField.setVisible(false);
            PaymentOption.stateslist.setVisible(false);
            PaymentOption.zipField.setVisible(false);
            PaymentOption.countrieslist.setVisible(false);
            PaymentOption.emailField.setVisible(false);
            //PaymentOption.emailConfirmField.setVisible(false);
            PaymentOption.Debit.setVisible(false);
            PaymentOption.Cash.setVisible(false);
            RMSGui.paymentScrollPane.setVisible(true);
            RMSGui.PaymentLogo.setVisible(false);
            RMSGui.confirm2.setVisible(false);
            RMSGui.confirmback.setVisible(false);
            RMSGui.ReceiptLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Receipt Logo.png")));
            RMSGui.Tablet.add(RMSGui.ReceiptLogo);
            RMSGui.ReceiptLogo.setLocation(350,10);
            RMSGui.ReceiptLogo.setVisible(true);
            RMSGui.ReceiptLogo.setSize(320,88);
            name.setVisible(true);
            name.setLocation(60,55);
            name.setSize(200,100);
            name.setForeground(new java.awt.Color(0, 0, 0));
            name.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(name);
            JLabel grabName = new JLabel(nameField.getText().trim());
            grabName.setVisible(true);
            grabName.setSize(200,200);
            grabName.setForeground(new java.awt.Color(0, 0, 0));
            grabName.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabName.setLocation(160,5);
            add(grabName);
            JLabel grabType = new JLabel(cardType.getSelectedItem().toString());
            grabType.setVisible(true);
            grabType.setSize(200,200);
            grabType.setForeground(new java.awt.Color(0, 0, 0));
            grabType.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabType.setLocation(135,25);
            add(grabType);
            JLabel grabNumber = new JLabel(numberField.getText().trim());
            grabNumber.setVisible(true);
            grabNumber.setSize(200,200);
            grabNumber.setForeground(new java.awt.Color(0, 0, 0));
            grabNumber.setFont(new java.awt.Font("AR ESSENCE", 0, 15));
            grabNumber.setLocation(155,45);
            add(grabNumber);
            JLabel grabMonth = new JLabel(expMonth.getSelectedItem().toString() + "/" + expYear.getSelectedItem().toString()); 
            grabMonth.setVisible(true);
            grabMonth.setSize(200,200);
            grabMonth.setForeground(new java.awt.Color(0, 0, 0));
            grabMonth.setFont(new java.awt.Font("AR ESSENCE", 0, 15));
            grabMonth.setLocation(165,65);
            add(grabMonth);
            JLabel grabStreet = new JLabel(streetField.getText().trim()); 
            grabStreet.setVisible(true);
            grabStreet.setSize(200,200);
            grabStreet.setForeground(new java.awt.Color(0, 0, 0));
            grabStreet.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabStreet.setLocation(165,85);
            add(grabStreet);
            JLabel grabCity = new JLabel(cityField.getText().trim()); 
            grabCity.setVisible(true);
            grabCity.setSize(200,200);
            grabCity.setForeground(new java.awt.Color(0, 0, 0));
            grabCity.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabCity.setLocation(95,105);
            add(grabCity);
            JLabel grabState = new JLabel(stateslist.getSelectedItem().toString() + " " + zipField.getText().trim()); 
            grabState.setVisible(true);
            grabState.setSize(200,200);
            grabState.setForeground(new java.awt.Color(0, 0, 0));
            grabState.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabState.setLocation(150,125);
            add(grabState);
            JLabel grabCountry = new JLabel(countrieslist.getSelectedItem().toString()); 
            grabCountry.setVisible(true);
            grabCountry.setSize(200,200);
            grabCountry.setForeground(new java.awt.Color(0, 0, 0));
            grabCountry.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabCountry.setLocation(125,145);
            add(grabCountry);
            JLabel grabEmail = new JLabel(emailField.getText().trim()); 
            grabEmail.setVisible(true);
            grabEmail.setSize(200,200);
            grabEmail.setForeground(new java.awt.Color(0, 0, 0));
            grabEmail.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabEmail.setLocation(100,165);
            add(grabEmail);
            JLabel grabTotal = new JLabel("Total: $" + RMSGui.cart.getTotal());
            grabTotal.setVisible(true);
            grabTotal.setSize(200,200);
            grabTotal.setForeground(new java.awt.Color(0, 0, 0));
            grabTotal.setFont(new java.awt.Font("AR ESSENCE", 0, 14));
            grabTotal.setLocation(100,300);
            add(grabTotal);
            //System.out.println(PaymentOption.nameField.getText().trim());
            card.setVisible(true);
            card.setLocation(60,75);
            card.setSize(200,100);
            card.setForeground(new java.awt.Color(0, 0, 0));
            card.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(card);
            card.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(card);
            cardNumber.setVisible(true);
            cardNumber.setLocation(60,95);
            cardNumber.setSize(200,100);
            cardNumber.setForeground(new java.awt.Color(0, 0, 0));
            cardNumber.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(cardNumber);
            Expiration.setVisible(true);
            Expiration.setLocation(60,115);
            Expiration.setSize(200,100);
            Expiration.setForeground(new java.awt.Color(0, 0, 0));
            Expiration.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(Expiration);
            street.setVisible(true);
            street.setLocation(60,135);
            street.setSize(200,100);
            street.setForeground(new java.awt.Color(0, 0, 0));
            street.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(street);
            city.setVisible(true);
            city.setLocation(60,155);
            city.setSize(200,100);
            city.setForeground(new java.awt.Color(0, 0, 0));
            city.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(city);
            stateZip.setVisible(true);
            stateZip.setLocation(60,175);
            stateZip.setSize(200,100);
            stateZip.setForeground(new java.awt.Color(0, 0, 0));
            stateZip.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(stateZip);
            country.setVisible(true);
            country.setLocation(60,195);
            country.setSize(200,100);
            country.setForeground(new java.awt.Color(0, 0, 0));
            country.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(country);
            email.setVisible(true);
            email.setLocation(60,215);
            email.setSize(200,100);
            email.setForeground(new java.awt.Color(0, 0, 0));
            email.setFont(new java.awt.Font("AR DARLING", 0, 14));
            add(email);
            purchases.setVisible(true);
            purchases.setLocation(20,255);
            purchases.setSize(200,100);
            purchases.setForeground(new java.awt.Color(0, 0, 0));
            purchases.setFont(new java.awt.Font("AR DARLING", 0, 18));
            add(purchases);
            repaint();
        }}
         }};


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton Cash;
    public static javax.swing.JRadioButton Debit;
    private javax.swing.ButtonGroup Selection;
    // End of variables declaration//GEN-END:variables
}
