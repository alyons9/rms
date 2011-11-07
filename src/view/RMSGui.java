/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RMSGui.java
 *
 * Created on Nov 4, 2011, 11:16:20 PM
 */
package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Jamel Jenkins
 */

public class RMSGui extends javax.swing.JFrame {
private JLabel Logo2 = new JLabel();
private JButton dineIn = new JButton();
private JButton CarryOut = new JButton();
private JButton appetizers = new JButton();
private JButton breakfast = new JButton();
private JButton lunch = new JButton();
private JButton dinner = new JButton();
private JButton desserts = new JButton();
private JButton drinks = new JButton();
private JButton home = new JButton();
private JButton back = new JButton();
private JButton next = new JButton();
private JButton viewcart = new JButton();
    /** Creates new form RMSGui */
    public RMSGui() {
        initComponents();
        dineIn.addActionListener(new DineIn());
        CarryOut.addActionListener(new Carryout());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablet = new javax.swing.JPanel();
        AdminLogin = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        enterMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Management");
        setName("rmsBorder"); // NOI18N
        setResizable(false);

        Tablet.setBackground(java.awt.Color.gray);
        Tablet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 30, true));
        Tablet.setForeground(new java.awt.Color(0, 153, 153));
        Tablet.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Tablet.setMaximumSize(new java.awt.Dimension(32697, 32697));
        Tablet.setName("Tablet"); // NOI18N

        AdminLogin.setBackground(new java.awt.Color(255, 255, 255));
        AdminLogin.setFont(new java.awt.Font("Times New Roman", 1, 16));
        AdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin.setText("AdminLogin");
        AdminLogin.setBorder(null);
        AdminLogin.setName("AdminLogin"); // NOI18N
        AdminLogin.setOpaque(false);
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cnerds Cafe.png"))); // NOI18N
        Logo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Logo.setAlignmentY(0.0F);
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Logo.setMaximumSize(new java.awt.Dimension(99999, 99999));
        Logo.setPreferredSize(new java.awt.Dimension(387, 387));
        Logo.setRequestFocusEnabled(false);

        enterMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cnerds Button.png"))); // NOI18N
        enterMenu.setText("jButton1");
        enterMenu.setIconTextGap(0);
        enterMenu.setOpaque(false);
        enterMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabletLayout = new javax.swing.GroupLayout(Tablet);
        Tablet.setLayout(TabletLayout);
        TabletLayout.setHorizontalGroup(
            TabletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabletLayout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabletLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(129, 129, 129))
            .addGroup(TabletLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(enterMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 198, Short.MAX_VALUE)
                .addGap(237, 237, 237))
        );
        TabletLayout.setVerticalGroup(
            TabletLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabletLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addGap(225, 225, 225)
                .addComponent(enterMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, Short.MAX_VALUE)
                .addGap(129, 129, 129))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed

    adminLogInDialog a = new adminLogInDialog();
    a.setVisible(true);
    
   // AdminEditMenu adminMenu = new AdminEditMenu();
    //adminMenu.setVisible(true);
    //adminMenu.setSize(600,700);
    //Tablet.add(adminMenu);
         

    /*
    AdminEditMenu adminMenu = new AdminEditMenu();
    adminMenu.setVisible(true);
    adminMenu.setSize(600,700);
         */

    }//GEN-LAST:event_AdminLoginActionPerformed

    private void enterMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterMenuActionPerformed
 /*
    JPanel homePage = new JPanel();
    homePage.setSize(576,757);
    homePage.setLocation(30,30);
    homePage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
    homePage.setBackground(Color.gray);
    */
    Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cnerds Cafes.png")));
    Logo2.setVisible(true);
    Logo2.setSize(200,200);
    Logo2.setLocation(20,20);
    dineIn.setVisible(true);
    dineIn.setLocation(210,420);
    dineIn.setSize(185,88);
    dineIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/DineIn Button.png")));
    CarryOut.setVisible(true);
    CarryOut.setLocation(210,550);
    CarryOut.setSize(185,88);
    CarryOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CarryOut Button.png")));
    Logo.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    Tablet.add(Logo2);
    Tablet.add(dineIn);
    Tablet.add(CarryOut);
    //Logo.setLocation(0,0);
    //homePage.setVisible(true);
    //Tablet.add(homePage);
    //repaint();
    }//GEN-LAST:event_enterMenuActionPerformed
    
    /**
     * @param args the command line arguments
     */
    class DineIn implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
    JPanel separator = new JPanel();
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Logo.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    separator.setVisible(true);
    separator.setSize(20,760);
    separator.setLocation(220,30);
    separator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    separator.setBackground(new java.awt.Color(0, 0, 0));
    JLabel DineInLogo = new JLabel();
    DineInLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/DineIn Logo.png")));
    Tablet.add(separator);
    Tablet.add(DineInLogo);
    DineInLogo.setSize(272,88);
    DineInLogo.setLocation(290,10);
    appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Appetizers Button.png")));
    appetizers.setVisible(true);
    appetizers.setSize(170,87);
    appetizers.setLocation(40,48);
    Tablet.add(appetizers);
    breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Breakfast Button.png")));
    breakfast.setVisible(true);
    breakfast.setSize(170,87);
    breakfast.setLocation(40,165);
    Tablet.add(breakfast);
    lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lunch Button.png")));
    lunch.setVisible(true);
    lunch.setSize(170,87);
    lunch.setLocation(40,282);
    Tablet.add(lunch);
    dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dinner Button.png")));
    dinner.setVisible(true);
    dinner.setSize(170,87);
    dinner.setLocation(40,399);
    Tablet.add(dinner);
    desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Desserts Button.png")));
    desserts.setVisible(true);
    desserts.setSize(170,87);
    desserts.setLocation(40,516);
    Tablet.add(desserts);
    drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Drinks Button.png")));
    drinks.setVisible(true);
    drinks.setSize(170,87);
    drinks.setLocation(40,633);
    Tablet.add(drinks);
    home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    home.setVisible(true);
    home.setSize(75,40);
    home.setLocation(245,743);
    Tablet.add(home);
    back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    back.setVisible(true);
    back.setSize(75,40);
    back.setLocation(335,743);
    Tablet.add(back);
    next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Next Button.png")));
    next.setVisible(true);
    next.setSize(75,40);
    next.setLocation(430,743);
    Tablet.add(next);
    viewcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/iamges/ViewCart Button.png")));
    viewcart.setVisible(true);
    viewcart.setSize(75,40);
    viewcart.setLocation(525,743);
    Tablet.add(viewcart);
    repaint();
     }}
    
    class Carryout implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
    JPanel separator = new JPanel();
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Logo.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    separator.setVisible(true);
    separator.setSize(20,760);
    separator.setLocation(220,30);
    separator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    separator.setBackground(new java.awt.Color(0, 0, 0));
    JLabel CarryOutLogo = new JLabel();
    CarryOutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CarryOut Logo.png")));
    Tablet.add(separator);
    Tablet.add(CarryOutLogo);
    CarryOutLogo.setSize(272,88);
    CarryOutLogo.setLocation(290,10);
    appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Appetizers Button.png")));
    appetizers.setVisible(true);
    appetizers.setSize(170,87);
    appetizers.setLocation(40,48);
    Tablet.add(appetizers);
    breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Breakfast Button.png")));
    breakfast.setVisible(true);
    breakfast.setSize(170,87);
    breakfast.setLocation(40,165);
    Tablet.add(breakfast);
    lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lunch Button.png")));
    lunch.setVisible(true);
    lunch.setSize(170,87);
    lunch.setLocation(40,282);
    Tablet.add(lunch);
    dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dinner Button.png")));
    dinner.setVisible(true);
    dinner.setSize(170,87);
    dinner.setLocation(40,399);
    Tablet.add(dinner);
    desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Desserts Button.png")));
    desserts.setVisible(true);
    desserts.setSize(170,87);
    desserts.setLocation(40,516);
    Tablet.add(desserts);
    drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Drinks Button.png")));
    drinks.setVisible(true);
    drinks.setSize(170,87);
    drinks.setLocation(40,633);
    Tablet.add(drinks);
    home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    home.setVisible(true);
    home.setSize(75,40);
    home.setLocation(245,743);
    Tablet.add(home);
    back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    back.setVisible(true);
    back.setSize(75,40);
    back.setLocation(335,743);
    Tablet.add(back);
    next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Next Button.png")));
    next.setVisible(true);
    next.setSize(75,40);
    next.setLocation(430,743);
    Tablet.add(next);
    viewcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ViewCart Button.png")));
    viewcart.setVisible(true);
    viewcart.setSize(75,40);
    viewcart.setLocation(525,743);
    Tablet.add(viewcart);
    repaint();
      }}
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RMSGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Tablet;
    private javax.swing.JButton enterMenu;
    // End of variables declaration//GEN-END:variables

}
