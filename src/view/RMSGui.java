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
import view.addMenus.addDrinkMenu;
import view.addMenus.addAppetizerMenu;
import view.addMenus.addDessertMenu;
import view.addMenus.addDinnerMenu;
import view.addMenus.addBreakfastMenu;
import view.addMenus.addLunchMenu;
import Controller.FoodListeners.viewFoodMenuActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.xml.parsers.ParserConfigurationException;
import model.Cart;
import org.xml.sax.SAXException;
import view.Constants.ApplicationConstants;
import view.addMenus.CartView;
import view.adminLogInDialog;
/**
 *
 * @author Jamel Jenkins
 */

public class RMSGui extends javax.swing.JFrame {
//Buttons and labels for GUI    
public static JLabel Logo2 = new JLabel();
public static JButton dineIn = new JButton();
public static JButton CarryOut = new JButton();
public static JButton Reservations = new JButton();
public static JButton appetizers = new JButton();
public static JButton breakfast = new JButton();
public static JButton lunch = new JButton();
public static JButton dinner = new JButton();
public static JButton desserts = new JButton();
public static JButton drinks = new JButton();
public static JButton home = new JButton();
public static JButton home2 = new JButton();
public static JButton back = new JButton();
public static JButton confirm = new JButton();
public static JButton confirm2 = new JButton();
public static JButton viewback = new JButton();
public static JButton confirmback = new JButton();
public static JButton next = new JButton();
public static JButton viewcart = new JButton();
public static JLabel Logo3 = new JLabel();
public static JDialog confirmframe;
public static PaymentOption paymentOption = new PaymentOption();


//Cart object 
public static Cart cart = new Cart();

//Food Button actions
public static addAppetizerMenu appetizerMenu = new addAppetizerMenu(cart);
public static addBreakfastMenu breakfastMenu = new addBreakfastMenu(cart);
public static addLunchMenu lunchMenu = new addLunchMenu(cart);
public static addDinnerMenu dinnerMenu = new addDinnerMenu(cart);
public static addDessertMenu dessertMenu = new addDessertMenu(cart);
public static addDrinkMenu drinksMenu = new addDrinkMenu(cart);
public static JScrollPane appetizersPane = new JScrollPane(appetizerMenu);
public static JScrollPane breakfastPane = new JScrollPane(breakfastMenu);
public static JScrollPane dessertPane = new JScrollPane(dessertMenu);
public static JScrollPane lunchPane = new JScrollPane(lunchMenu);
public static JScrollPane dinnerPane = new JScrollPane(dinnerMenu);
public static JScrollPane drinksPane = new JScrollPane(drinksMenu);

public static CartView cartView;
    

public static JPanel separator = new JPanel();
public static JLabel MenuLogo = new JLabel();
public static JLabel CartLogo = new JLabel();
public static JLabel PaymentLogo = new JLabel();
public static JPanel viewPanel = new JPanel();
public static JScrollPane viewScrollPane = new JScrollPane(cartView);
public static JScrollPane paymentScrollPane = new JScrollPane(paymentOption);
//private JLabel DineInLogo = new JLabel();
//private JLabel CarryOutLogo = new JLabel();



    /** Creates new form RMSGui */
    public RMSGui() {
        initComponents();
        dineIn.addActionListener(new DineInAction());
        CarryOut.addActionListener(new Carryout());
        
        //Appetizers ActionListeners
        appetizers.addActionListener(new appetizers());
        appetizers.addActionListener(foodListener);
        
        //Breakfast ActionListeners
        breakfast.addActionListener(new viewFoodMenuActionListener(breakfastPane,Tablet));
        breakfast.addActionListener(foodListener);
        
        //Lunch ActionListeners
        lunch.addActionListener(new viewFoodMenuActionListener(lunchPane,Tablet));
        lunch.addActionListener(foodListener);
        
        //Dinner ActionListeners
        dinner.addActionListener(new viewFoodMenuActionListener(dinnerPane,Tablet));
        dinner.addActionListener(foodListener);
        
        //Desserts ActionListeners
        desserts.addActionListener(new viewFoodMenuActionListener(dessertPane,Tablet));
        desserts.addActionListener(foodListener);
        
        //Drinks ActionListeners
        drinks.addActionListener(new viewFoodMenuActionListener(drinksPane,Tablet));
        drinks.addActionListener(foodListener);
        
        //Application ActionListeners
        home.addActionListener(homeListener);
        home2.addActionListener(homeListener);
        back.addActionListener(backListener);
        viewcart.addActionListener(viewcartListener);
        viewback.addActionListener(viewbackListener);
        confirm.addActionListener(cartConfirmListener);
        
        //action command labels
        appetizers.setActionCommand(Character.toString(ApplicationConstants.APPETIZERS));
        breakfast.setActionCommand(Character.toString(ApplicationConstants.BREAKFAST));
        lunch.setActionCommand(Character.toString(ApplicationConstants.LUNCH));
        dinner.setActionCommand(Character.toString(ApplicationConstants.DINNER));
        drinks.setActionCommand(Character.toString(ApplicationConstants.DRINKS));
        desserts.setActionCommand(Character.toString(ApplicationConstants.DESSERTS));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    /* This is where the border of the tablet is create. Also, this is where the
     * click here to go to menu button is created and the cnerds cafe logo. There
     * is also an admin login button in the top right corner the administrator can
     * login to view the admin edit menu or they can signup as an administrator.
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
        setBounds(new java.awt.Rectangle(375, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("rmsBorder"); // NOI18N
        setResizable(false);

        Tablet.setBackground(new java.awt.Color(0, 51, 255));
        Tablet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 30, true));
        Tablet.setForeground(new java.awt.Color(0, 0, 255));
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
                .addContainerGap(559, Short.MAX_VALUE)
                .addComponent(AdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabletLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addGap(129, 129, 129))
            .addGroup(TabletLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(enterMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE)
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

        Logo.getAccessibleContext().setAccessibleName("Logo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed

    adminLogInDialog loginPanel = new adminLogInDialog(Tablet);
    loginPanel.setVisible(true);
    loginPanel.setLocation(200,380);
    Tablet.add(loginPanel);
    dineIn.setVisible(false);
    CarryOut.setVisible(false);
    Logo3.setVisible(false);
    // AdminEditMenu adminMenu = new AdminEditMenu();
    //adminMenu.setVisible(true);
    //adminMenu.setSize(600,700);
    //Tablet.add(adminMenu);
    }//GEN-LAST:event_AdminLoginActionPerformed
   
    /*This is the action listener to enter to the menu and then it builds the next screen
     * so that the user can select whether they want to do dine in or carry out.
     */
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
    Logo2.setSize(400,300);
    Logo2.setLocation(179,47);
    dineIn.setVisible(true);
    dineIn.setLocation(270,360);
    dineIn.setSize(185,88);
    dineIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/DineIn Button.png")));
    CarryOut.setVisible(true);
    CarryOut.setLocation(270,480);
    CarryOut.setSize(185,88);
    CarryOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CarryOut Button.png")));
    Reservations.setVisible(true);
    Reservations.setLocation(270,600);
    Reservations.setSize(185,88);
    Reservations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Reservations Button.png")));
    Logo.setVisible(false);
    AdminLogin.setVisible(false);
    viewScrollPane.setVisible(false);
    enterMenu.setVisible(false);
    Tablet.add(Logo2);
    Tablet.add(dineIn);
    Tablet.add(CarryOut);
    Tablet.add(Reservations);
    CartLogo.setVisible(false);
    home2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    home2.setVisible(true);
    home2.setSize(75,40);
    home2.setLocation(40,710);
    Logo3.setVisible(false);
    Tablet.add(home2);
    //Logo.setLocation(0,0);
    //homePage.setVisible(true);
    //Tablet.add(homePage);
    repaint();
    }//GEN-LAST:event_enterMenuActionPerformed
    
    /**This is the action listener for the Dine in button. If the user choose dine in. 
     * It will take them to the menu and it will allow them to place their order for
     * dining in the restaurant
     *
     */
    class DineInAction implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Reservations.setVisible(false);
    Logo.setVisible(false);
    Logo2.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    separator.setVisible(true);
    separator.setSize(20,750);
    separator.setLocation(150,30);
    separator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    separator.setBackground(new java.awt.Color(0, 0, 0));
    MenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Menu Logo.png")));
    home2.setVisible(false);
    //DineInLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/DineIn Logo.png")));
    Tablet.add(separator);
    Tablet.add(MenuLogo);
    MenuLogo.setVisible(true);
    MenuLogo.setSize(272,88);
    MenuLogo.setLocation(290,10);
    //Tablet.add(DineInLogo);
    //DineInLogo.setVisible(true);
    //DineInLogo.setSize(272,88);
    //DineInLogo.setLocation(290,10);
    appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Appetizers Button.png")));
    appetizers.setVisible(true);
    appetizers.setSize(110,62);
    appetizers.setLocation(35,48);
    Tablet.add(appetizers);
    breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Breakfast Button.png")));
    breakfast.setVisible(true);
    breakfast.setSize(110,62);
    breakfast.setLocation(35,165);
    Tablet.add(breakfast);
    lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lunch Button.png")));
    lunch.setVisible(true);
    lunch.setSize(110,62);
    lunch.setLocation(35,282);
    Tablet.add(lunch);
    dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dinner Button.png")));
    dinner.setVisible(true);
    dinner.setSize(110,62);
    dinner.setLocation(35,399);
    Tablet.add(dinner);
    desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Desserts Button.png")));
    desserts.setVisible(true);
    desserts.setSize(110,62);
    desserts.setLocation(35,516);
    Tablet.add(desserts);
    drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Drinks Button.png")));
    drinks.setVisible(true);
    drinks.setSize(110,62);
    drinks.setLocation(35,633);
    Tablet.add(drinks);
    home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    home.setVisible(true);
    home.setSize(75,40);
    home.setLocation(220,710);
    Tablet.add(home);
    back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    back.setVisible(true);
    back.setSize(75,40);
    back.setLocation(400,710);
    viewback.setVisible(false);
    Tablet.add(back);
    viewcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ViewCart Button.png")));
    viewcart.setVisible(true);
    viewcart.setSize(75,40);
    viewcart.setLocation(580,710);
    CartLogo.setVisible(false);
    Logo3.setVisible(false);
    viewScrollPane.setVisible(false);
    Tablet.add(viewcart);
    repaint();
     }}
    
    /*This is the action listener for the Dine in button. If the user choose dine in. 
     * It will take them to the menu and it will allow them to place their order for
     * dining in the restaurant
     */
    class Carryout implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Reservations.setVisible(false);
    Logo.setVisible(false);
    Logo2.setVisible(false);
    Logo3.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    separator.setVisible(true);
    separator.setSize(20,750);
    separator.setLocation(150,30);
    separator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    separator.setBackground(new java.awt.Color(0, 0, 0));
    MenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Menu Logo.png")));
    //CarryOutLogo.setVisible(true);
    //CarryOutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CarryOut Logo.png")));
    Tablet.add(separator);
    Tablet.add(MenuLogo);
    MenuLogo.setVisible(true);
    MenuLogo.setSize(272,88);
    MenuLogo.setLocation(290,10);
    home2.setVisible(false);
    //Tablet.add(CarryOutLogo);
    //CarryOutLogo.setSize(272,88);
    //CarryOutLogo.setLocation(290,10);
    appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Appetizers Button.png")));
    appetizers.setVisible(true);
    appetizers.setSize(110,62);
    appetizers.setLocation(35,48);
    Tablet.add(appetizers);
    breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Breakfast Button.png")));
    breakfast.setVisible(true);
    breakfast.setSize(110,62);
    breakfast.setLocation(35,165);
    Tablet.add(breakfast);
    lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lunch Button.png")));
    lunch.setVisible(true);
    lunch.setSize(110,62);
    lunch.setLocation(35,282);
    Tablet.add(lunch);
    dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dinner Button.png")));
    dinner.setVisible(true);
    dinner.setSize(110,62);
    dinner.setLocation(35,399);
    Tablet.add(dinner);
    desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Desserts Button.png")));
    desserts.setVisible(true);
    desserts.setSize(110,62);
    desserts.setLocation(35,516);
    Tablet.add(desserts);
    drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Drinks Button.png")));
    drinks.setVisible(true);
    drinks.setSize(110,62);
    drinks.setLocation(35,633);
    Tablet.add(drinks);
    home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    home.setVisible(true);
    home.setSize(75,40);
    home.setLocation(220,710);
    Tablet.add(home);
    back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    back.setVisible(true);
    back.setSize(75,40);
    back.setLocation(400,710);
    Tablet.add(back);
    viewback.setVisible(false);
    viewcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ViewCart Button.png")));
    viewcart.setVisible(true);
    viewcart.setSize(75,40);
    viewcart.setLocation(580,710);
    viewScrollPane.setVisible(false);
    CartLogo.setVisible(false);
    Tablet.add(viewcart);
    repaint();
      }}
    
    /*This class brings the appetizers into the Gui once the appetizer button is pressed
     * by the user.
     */
    class appetizers implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //addAppetizerMenu a = new addAppetizerMenu();
            //foodPane.add(a);
            appetizersPane.setVisible(true);
            appetizersPane.setSize(524, 600);
            appetizersPane.setLocation(170, 70);
            appetizersPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            appetizersPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            home2.setVisible(false);
            Tablet.add(appetizersPane);
            repaint();
        }
    }

    /*This Action Listener will take the user back to the home screen once the home
     * button is pressed
     */
    ActionListener homeListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    paymentScrollPane.setVisible(false);
    PaymentLogo.setVisible(false);
    confirm2.setVisible(false);
    confirmback.setVisible(false);
    confirm.setVisible(false);
    Logo.setVisible(true);
    AdminLogin.setVisible(true);
    enterMenu.setVisible(true);
    Logo2.setVisible(false);
    home.setVisible(false);
    Logo3.setVisible(false);
    home2.setVisible(false);
    back.setVisible(false);
    viewback.setVisible(false);
    viewcart.setVisible(false);
    drinks.setVisible(false);
    separator.setVisible(false);
    breakfast.setVisible(false);
    lunch.setVisible(false);
    dinner.setVisible(false);
    desserts.setVisible(false);
    MenuLogo.setVisible(false);
    CartLogo.setVisible(false);
    viewScrollPane.setVisible(false);
    //CarryOutLogo.setVisible(false);
    //DineInLogo.setVisible(false);
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Reservations.setVisible(false);
    appetizers.setVisible(false);
    appetizersPane.setVisible(false);
    breakfastPane.setVisible(false);
    lunchPane.setVisible(false);
    dinnerPane.setVisible(false);
    dessertPane.setVisible(false);
    drinksPane.setVisible(false);
    repaint();
    }};
    
    ActionListener backListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    Logo.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    Logo2.setVisible(true);
    home.setVisible(false);
    back.setVisible(false);
    viewback.setVisible(false);
    viewcart.setVisible(false);
    drinks.setVisible(false);
    separator.setVisible(false);
    breakfast.setVisible(false);
    lunch.setVisible(false);
    dinner.setVisible(false);
    Logo3.setVisible(false);
    desserts.setVisible(false);
    MenuLogo.setVisible(false);
    CartLogo.setVisible(false);
    viewScrollPane.setVisible(false);
    //CarryOutLogo.setVisible(false);
    //DineInLogo.setVisible(false);
    CarryOut.setVisible(true);
    dineIn.setVisible(true);
    Reservations.setVisible(true);
    appetizers.setVisible(false);
    appetizersPane.setVisible(false);
    breakfastPane.setVisible(false);
    lunchPane.setVisible(false);
    dinnerPane.setVisible(false);
    dessertPane.setVisible(false);
    drinksPane.setVisible(false);
    home2.setVisible(true);
    repaint();
    }};
    
    ActionListener viewcartListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    //appetizerMenu.setVisible(false);
    //breakfastMenu.setVisible(false);
    //lunchMenu.setVisible(false);
    //dinnerMenu.setVisible(false);
    //dessertMenu.setVisible(false);
    //drinksMenu.setVisible(false);
    appetizersPane.setVisible(false);
    breakfastPane.setVisible(false);
    dessertPane.setVisible(false);
    lunchPane.setVisible(false);
    dinnerPane.setVisible(false);
    drinksPane.setVisible(false);
    Logo.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    Logo2.setVisible(false);
    home.setVisible(true);
    back.setVisible(false);
    viewback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    viewback.setVisible(true);
    viewback.setSize(75,40);
    viewback.setLocation(400,710);
    Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cnerds Cafe Side.png")));
    Logo3.setVisible(true);
    Logo3.setSize(400,650);
    Logo3.setLocation(50,70);
    Tablet.add(Logo3);
    Tablet.add(viewback);
    viewcart.setVisible(false);
    drinks.setVisible(false);
    separator.setVisible(true);
    breakfast.setVisible(false);
    lunch.setVisible(false);
    dinner.setVisible(false);
    desserts.setVisible(false);
    MenuLogo.setVisible(false);
    CartLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cart Button.png")));
    Tablet.add(CartLogo);
    CartLogo.setLocation(280,10);
    CartLogo.setVisible(true);
    CartLogo.setSize(320,88);
    viewPanel.setVisible(false);
    home2.setVisible(false);
    //CarryOutLogo.setVisible(false);
    //DineInLogo.setVisible(false);
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Reservations.setVisible(false);
    appetizers.setVisible(false);
    appetizersPane.setVisible(false);
    breakfastPane.setVisible(false);
    lunchPane.setVisible(false);
    dinnerPane.setVisible(false);
    dessertPane.setVisible(false);
    drinksPane.setVisible(false);
    cartView = new CartView(cart);
    viewScrollPane = new JScrollPane(cartView); 
    viewScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    viewScrollPane.setVisible(true);
    //viewScrollPane.setBackground(new java.awt.Color(0, 0, 0));
    viewScrollPane.setSize(522,625);
    viewScrollPane.setLocation(173,78);
    //viewScrollPane.add(cartView);
    Tablet.add(viewScrollPane);
    confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Confirm Button.png")));
    confirm.setVisible(true);
    confirm.setSize(75,40);
    confirm.setLocation(580,710);
    Tablet.add(confirm);
    repaint();
    }};
    
    /* The viewbackListener is for the back button when the cart is opened.
     * Once the back button is pressed it will return to the menu.
     */
    ActionListener viewbackListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    home2.setVisible(false);
    confirm.setVisible(false);
    CarryOut.setVisible(false);
    dineIn.setVisible(false);
    Reservations.setVisible(false);
    appetizers.setVisible(false);
    Logo.setVisible(false);
    Logo2.setVisible(false);
    Logo3.setVisible(false);
    AdminLogin.setVisible(false);
    enterMenu.setVisible(false);
    separator.setVisible(true);
    separator.setSize(20,750);
    separator.setLocation(150,30);
    separator.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    separator.setBackground(new java.awt.Color(0, 0, 0));
    MenuLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Menu Logo.png")));
    //CarryOutLogo.setVisible(true);
    //CarryOutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/CarryOut Logo.png")));
    Tablet.add(separator);
    Tablet.add(MenuLogo);
    appetizersPane.setVisible(false);
    MenuLogo.setVisible(true);
    MenuLogo.setSize(272,88);
    MenuLogo.setLocation(290,10);
    //Tablet.add(CarryOutLogo);
    //CarryOutLogo.setSize(272,88);
    //CarryOutLogo.setLocation(290,10);
    appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Appetizers Button.png")));
    appetizers.setVisible(true);
    appetizers.setSize(110,62);
    appetizers.setLocation(35,48);
    Tablet.add(appetizers);
    breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Breakfast Button.png")));
    breakfast.setVisible(true);
    breakfast.setSize(110,62);
    breakfast.setLocation(35,165);
    Tablet.add(breakfast);
    lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Lunch Button.png")));
    lunch.setVisible(true);
    lunch.setSize(110,62);
    lunch.setLocation(35,282);
    Tablet.add(lunch);
    dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Dinner Button.png")));
    dinner.setVisible(true);
    dinner.setSize(110,62);
    dinner.setLocation(35,399);
    Tablet.add(dinner);
    desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Desserts Button.png")));
    desserts.setVisible(true);
    desserts.setSize(110,62);
    desserts.setLocation(35,516);
    Tablet.add(desserts);
    drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Drinks Button.png")));
    drinks.setVisible(true);
    drinks.setSize(110,62);
    drinks.setLocation(35,633);
    Tablet.add(drinks);
    home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Home Button.png")));
    home.setVisible(true);
    home.setSize(75,40);
    home.setLocation(220,710);
    Tablet.add(home);
    back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
    back.setVisible(true);
    back.setSize(75,40);
    back.setLocation(400,710);
    Tablet.add(back);
    viewback.setVisible(false);
    viewcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ViewCart Button.png")));
    viewcart.setVisible(true);
    viewcart.setSize(75,40);
    viewcart.setLocation(580,710);
    viewScrollPane.setVisible(false);
    CartLogo.setVisible(false);
    Tablet.add(viewcart);
    repaint();
    }};
    
    ActionListener cartConfirmListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    int confirmPane = JOptionPane.showConfirmDialog(
                      confirmframe, "Is Your Order Correct?",
                      "Order Confirmation",
                      JOptionPane.YES_NO_OPTION);
    
   if (confirmPane == JOptionPane.YES_OPTION) {
           CartLogo.setVisible(false);
           viewScrollPane.setVisible(false);
           viewcart.setVisible(false);
           paymentScrollPane.setVisible(true);
           paymentScrollPane.setSize(522,625);
           paymentScrollPane.setLocation(173,78);
           Tablet.add(paymentScrollPane);
           PaymentLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Payment Logo.png")));
           Tablet.add(PaymentLogo);
           PaymentLogo.setLocation(280,10);
           PaymentLogo.setVisible(true);
           PaymentLogo.setSize(320,88);
           confirm.setVisible(false);
           confirm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Confirm Button.png")));
           confirm2.setVisible(true);
           confirm2.setSize(75,40);
           confirm2.setLocation(580,710);
           Tablet.add(confirm2);
           home.setVisible(false);
           viewback.setVisible(false);
           confirmback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cancel Button.png")));
           confirmback.setVisible(false);
           confirmback.setSize(75,40);
           confirmback.setLocation(405,710);
           Tablet.add(confirmback);
            } else if (confirmPane == JOptionPane.NO_OPTION) {
            paymentScrollPane.setVisible(false);
            PaymentLogo.setVisible(false);
            confirm2.setVisible(false);
            confirmback.setVisible(false);
            Logo.setVisible(false);
            AdminLogin.setVisible(false);
            enterMenu.setVisible(false);
            Logo2.setVisible(false);
            home.setVisible(true);
            back.setVisible(false);
            viewback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Back Button.png")));
            viewback.setVisible(true);
            viewback.setSize(75,40);
            viewback.setLocation(400,710);
            Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cnerds Cafe Side.png")));
            Logo3.setVisible(true);
            Logo3.setSize(400,650);
            Logo3.setLocation(50,70);
            Tablet.add(Logo3);
            Tablet.add(viewback);
            viewcart.setVisible(false);
            drinks.setVisible(false);
            separator.setVisible(true);
            breakfast.setVisible(false);
            lunch.setVisible(false);
            dinner.setVisible(false);
            desserts.setVisible(false);
            MenuLogo.setVisible(false);
            CartLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Cart Button.png")));
            Tablet.add(CartLogo);
            CartLogo.setLocation(280,10);
            CartLogo.setVisible(true);
            CartLogo.setSize(320,88);
            viewPanel.setVisible(false);
            home2.setVisible(false);
            //CarryOutLogo.setVisible(false);
            //DineInLogo.setVisible(false);
            CarryOut.setVisible(false);
            dineIn.setVisible(false);
            Reservations.setVisible(false);
            appetizers.setVisible(false);
            appetizersPane.setVisible(false);
            viewScrollPane.setVisible(true);
            viewScrollPane.setBackground(new java.awt.Color(0, 0, 0));
            viewScrollPane.setSize(522,625);
            viewScrollPane.setLocation(173,78);
            Tablet.add(viewScrollPane);
            confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Confirm Button.png")));
            confirm.setVisible(true);
            confirm.setSize(75,40);
            confirm.setLocation(580,710);
            Tablet.add(confirm);
            PaymentLogo.setVisible(false);
            repaint();
                  }
        }};
    
    ActionListener foodListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
            switch(e.getActionCommand().charAt(0)){
                case ApplicationConstants.APPETIZERS:
                    breakfastPane.setVisible(false);
                    lunchPane.setVisible(false);
                    dinnerPane.setVisible(false);
                    drinksPane.setVisible(false);
                    dessertPane.setVisible(false);
                    break;
                case ApplicationConstants.BREAKFAST:
                    appetizersPane.setVisible(false);
                    lunchPane.setVisible(false);
                    dinnerPane.setVisible(false);
                    drinksPane.setVisible(false);
                    dessertPane.setVisible(false);
                    break;
                case ApplicationConstants.LUNCH: 
                    appetizersPane.setVisible(false);
                    breakfastPane.setVisible(false);
                    dinnerPane.setVisible(false);
                    drinksPane.setVisible(false);
                    dessertPane.setVisible(false);
                    break;
                case ApplicationConstants.DINNER: 
                    appetizersPane.setVisible(false);
                    breakfastPane.setVisible(false);
                    lunchPane.setVisible(false);
                    drinksPane.setVisible(false);
                    dessertPane.setVisible(false);
                    break;
                case ApplicationConstants.DESSERTS:
                    appetizersPane.setVisible(false);
                    breakfastPane.setVisible(false);
                    lunchPane.setVisible(false);
                    drinksPane.setVisible(false);
                    dinnerPane.setVisible(false);
                    break;
                case ApplicationConstants.DRINKS: 
                    appetizersPane.setVisible(false);
                    breakfastPane.setVisible(false);
                    lunchPane.setVisible(false);
                    dinnerPane.setVisible(false);
                    dessertPane.setVisible(false);
                    break;
                default: 
                    appetizersPane.setVisible(false);
                    breakfastPane.setVisible(false);
                    lunchPane.setVisible(false);
                    dinnerPane.setVisible(false);
                    dessertPane.setVisible(false);
                    drinksPane.setVisible(false);
                    break;
                
            }
            
            //System.out.println(e.getActionCommand());
        }
    };

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RMSGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton AdminLogin;
    public static javax.swing.JLabel Logo;
    public static javax.swing.JPanel Tablet;
    public static javax.swing.JButton enterMenu;
    // End of variables declaration//GEN-END:variables

}
