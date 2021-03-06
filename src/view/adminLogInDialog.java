/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author SAMIR
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Controller.FoodListeners.viewAddMenuActionListener;
import view.Constants.ApplicationConstants;
import view.editMenus.adminEditDrinkMenu;
import view.editMenus.adminEditAppetizerMenu;
import view.editMenus.adminEditDessertMenu;
import view.editMenus.adminEditDinnerMenu;
import view.editMenus.adminEditBreakfastMenu;
import view.editMenus.adminEditLunchMenu;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.awt.*;
import Controller.FoodListeners.viewFoodEditMenuActionListener;
import java.awt.event.KeyEvent;
import view.addItemToMenu.addItemToAppetizerMenu;
import view.addItemToMenu.addItemToBreakfastMenu;
import view.addItemToMenu.addItemToDessertMenu;
import view.addItemToMenu.addItemToDinnerMenu;
import view.addItemToMenu.addItemToDrinkMenu;
import view.addItemToMenu.addItemToLunchMenu;
import view.addMenus.addBreakfastMenu;

/**
 *
 * @author SAMIR
 */
public class adminLogInDialog extends JInternalFrame {//being

    private JTextField userNameValue;
    private JPasswordField passwordValue;
    private JLabel userName;
    private JLabel password;
    private JButton confirm;
    private JButton cancel;
    private JButton signUp;
    private JPanel adminEdit;
    private boolean succeeded;
    private JLabel separator = new JLabel();
    private JLabel AdminEditLogo = new JLabel();
    private JButton appetizers = new JButton();
    private JButton breakfast = new JButton();
    private JButton lunch = new JButton();
    private JButton dinner = new JButton();
    private JButton desserts = new JButton();
    private JButton drinks = new JButton();
    private JButton Logout = new JButton();
    
    public static adminEditAppetizerMenu appetizerMenu;
    public static adminEditBreakfastMenu breakfastMenu;
    public static adminEditLunchMenu lunchMenu;
    public static adminEditDinnerMenu dinnerMenu;
    public static adminEditDessertMenu dessertMenu;
    public static adminEditDrinkMenu drinksMenu;
    
    public static JScrollPane appetizersEditPane;
    public static JScrollPane breakfastEditPane ;
    public static JScrollPane dessertEditPane;
    public static JScrollPane lunchEditPane ;
    public static JScrollPane dinnerEditPane;
    public static JScrollPane drinksEditPane ;
    
    public static addItemToAppetizerMenu addAppMenu;
    public static addItemToBreakfastMenu addBreakMenu;
    public static addItemToDessertMenu addDessertMenu;
    public static addItemToDinnerMenu addDinnerMenu;
    public static addItemToDrinkMenu addDrinkMenu;
    public static addItemToLunchMenu addLunchMenu;
    
    public static JScrollPane addAppetizerPane;
    public static JScrollPane addBreakfastPane;
    public static JScrollPane addDessertPane;
    public static JScrollPane addDinnerPane;
    public static JScrollPane addDrinkPane;
    public static JScrollPane addLunchPane;
    
    public adminLogInDialog(JPanel a) throws SAXException, ParserConfigurationException {//begin constructor
        
        appetizerMenu = new adminEditAppetizerMenu();
        breakfastMenu = new adminEditBreakfastMenu();
        lunchMenu = new adminEditLunchMenu();
        dinnerMenu = new adminEditDinnerMenu();
        dessertMenu = new adminEditDessertMenu();
        drinksMenu = new adminEditDrinkMenu();
    
        appetizersEditPane = new JScrollPane(appetizerMenu);
        breakfastEditPane = new JScrollPane(breakfastMenu);
        dessertEditPane = new JScrollPane(dessertMenu);
        lunchEditPane = new JScrollPane(lunchMenu);
        dinnerEditPane = new JScrollPane(dinnerMenu);
        drinksEditPane = new JScrollPane(drinksMenu);
        
       
        addAppMenu = new addItemToAppetizerMenu();
        addAppetizerPane = new JScrollPane(addAppMenu);
        
        addBreakMenu = new addItemToBreakfastMenu();
        addBreakfastPane = new JScrollPane(addBreakMenu);
        
        addDessertMenu = new addItemToDessertMenu();
        addDessertPane = new JScrollPane(addDessertMenu);
        
        addDinnerMenu = new addItemToDinnerMenu();
        addDinnerPane = new JScrollPane(addDinnerMenu);
        
        addDrinkMenu = new addItemToDrinkMenu();
        addDrinkPane = new JScrollPane(addDrinkMenu);
        
         addLunchMenu = new addItemToLunchMenu();
        addLunchPane = new JScrollPane(addLunchMenu);
        
        
        
        
        
        ActionListener LogoutListener = new ActionListener(){
    public void actionPerformed(ActionEvent e){
       appetizers.setVisible(false);
       breakfast.setVisible(false);
       lunch.setVisible(false);
       dinner.setVisible(false);
       desserts.setVisible(false);
       drinks.setVisible(false);
       Logout.setVisible(false);
       AdminEditLogo.setVisible(false);
       separator.setVisible(false);
       appetizersEditPane.setVisible(false);
       breakfastEditPane.setVisible(false);
       dessertEditPane.setVisible(false);
       lunchEditPane.setVisible(false);
       dinnerEditPane.setVisible(false);
       drinksEditPane.setVisible(false);
       RMSGui.Logo.setVisible(true);
       RMSGui.enterMenu.setVisible(true);
       RMSGui.AdminLogin.setVisible(true);
        //new RMSGui().setVisible(true); 
        addAppetizerPane.setVisible(false);
        addBreakfastPane.setVisible(false);
        addLunchPane.setVisible(false);
        addDinnerPane.setVisible(false);
        addDrinkPane.setVisible(false);
        addDessertPane.setVisible(false);
    
    }};
        ActionListener foodListener = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
            switch(e.getActionCommand().charAt(0)){
                case ApplicationConstants.APPETIZERS:
                    breakfastEditPane.setVisible(false);
                    lunchEditPane.setVisible(false);
                    dinnerEditPane.setVisible(false);
                    drinksEditPane.setVisible(false);
                    dessertEditPane.setVisible(false);
                    /*for add method menu*/
                    addBreakfastPane.setVisible(false);
                    addDessertPane.setVisible(false);
                    addDinnerPane.setVisible(true);
                    addDrinkPane.setVisible(true);
                    addLunchPane.setVisible(true);
               
               
                    
                    break;
                case ApplicationConstants.BREAKFAST:
                    appetizersEditPane.setVisible(false);
                    lunchEditPane.setVisible(false);
                    dinnerEditPane.setVisible(false);
                    drinksEditPane.setVisible(false);
                    dessertEditPane.setVisible(false);
                    /*for add method menu*/
                    addAppetizerPane.setVisible(false);
                    addLunchPane.setVisible(false);
                    addDinnerPane.setVisible(false);
                    addDessertPane.setVisible(false);
                    addDrinkPane.setVisible(false);
                    break;
                case ApplicationConstants.LUNCH: 
                    appetizersEditPane.setVisible(false);
                    breakfastEditPane.setVisible(false);
                    dinnerEditPane.setVisible(false);
                    drinksEditPane.setVisible(false);
                    dessertEditPane.setVisible(false);
                    /*for add method menu*/
                    addAppetizerPane.setVisible(false);
                    addBreakfastPane.setVisible(false);
                    addDinnerPane.setVisible(false);
                    addDrinkPane.setVisible(false);
                    addDessertPane.setVisible(false);
                    break;
                case ApplicationConstants.DINNER: 
                    appetizersEditPane.setVisible(false);
                    breakfastEditPane.setVisible(false);
                    lunchEditPane.setVisible(false);
                    drinksEditPane.setVisible(false);
                    dessertEditPane.setVisible(false);
                    /*for add method menu*/
                     addAppetizerPane.setVisible(false);
                    addBreakfastPane.setVisible(false);
                    addLunchPane.setVisible(false);
                    addDrinkPane.setVisible(false);
                    addDessertPane.setVisible(false);
                    
                    break;
                case ApplicationConstants.DESSERTS:
                    appetizersEditPane.setVisible(false);
                    breakfastEditPane.setVisible(false);
                    lunchEditPane.setVisible(false);
                    drinksEditPane.setVisible(false);
                    dinnerEditPane.setVisible(false);
                    /* for add method menu*/
                    addAppetizerPane.setVisible(false);
                    addBreakfastPane.setVisible(false);
                    addLunchPane.setVisible(false);
                    addDrinkPane.setVisible(false);
                    addDinnerPane.setVisible(false);
                    break;
                case ApplicationConstants.DRINKS: 
                    appetizersEditPane.setVisible(false);
                    breakfastEditPane.setVisible(false);
                    lunchEditPane.setVisible(false);
                    dinnerEditPane.setVisible(false);
                    dessertEditPane.setVisible(false);
                    /* for add method menu*/
                     addAppetizerPane.setVisible(false);
                    addBreakfastPane.setVisible(false);
                    addLunchPane.setVisible(false);
                    addDinnerPane.setVisible(false);
                    addDessertPane.setVisible(false);
         
                    break;
                default: 
                    appetizersEditPane.setVisible(false);
                    breakfastEditPane.setVisible(false);
                    lunchEditPane.setVisible(false);
                    dinnerEditPane.setVisible(false);
                    dessertEditPane.setVisible(false);
                    drinksEditPane.setVisible(false);
                    /*for add method menu*/
                     addAppetizerPane.setVisible(false);
                    addBreakfastPane.setVisible(false);
                    addLunchPane.setVisible(false);
                    addDinnerPane.setVisible(false);
                    addDrinkPane.setVisible(false);
                    addDessertPane.setVisible(false);
                    break;
                
            }
            
            //System.out.println(e.getActionCommand());
        }
    };
        class appetizers implements ActionListener{
        public void actionPerformed(ActionEvent e){
            //addAppetizerMenu a = new addAppetizerMenu();
            //foodPane.add(a);
            appetizersEditPane.setSize(524, 312);
            appetizersEditPane.setLocation(170, 78);
            appetizersEditPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            appetizersEditPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            RMSGui.home2.setVisible(false);
            RMSGui.Tablet.add(appetizersEditPane);
            repaint();
        }
    } 
        Logout.addActionListener(LogoutListener);
        appetizers.addActionListener(new viewFoodEditMenuActionListener(appetizersEditPane,RMSGui.Tablet));
        appetizers.addActionListener(foodListener);
        appetizers.addActionListener(new viewAddMenuActionListener(addAppetizerPane,RMSGui.Tablet));
        
        
        //Breakfast ActionListeners
        breakfast.addActionListener(new viewFoodEditMenuActionListener(breakfastEditPane,RMSGui.Tablet));
        breakfast.addActionListener(foodListener);
        breakfast.addActionListener(new viewAddMenuActionListener(addBreakfastPane,RMSGui.Tablet));
        //Lunch ActionListeners
        lunch.addActionListener(new viewFoodEditMenuActionListener(lunchEditPane,RMSGui.Tablet));
        lunch.addActionListener(foodListener);
        lunch.addActionListener(new viewAddMenuActionListener(addLunchPane,RMSGui.Tablet));
        //Dinner ActionListeners
        dinner.addActionListener(new viewFoodEditMenuActionListener(dinnerEditPane,RMSGui.Tablet));
        dinner.addActionListener(foodListener);
        dinner.addActionListener(new viewAddMenuActionListener(addDinnerPane,RMSGui.Tablet));
        
        //Desserts ActionListeners
        desserts.addActionListener(new viewFoodEditMenuActionListener(dessertEditPane,RMSGui.Tablet));
        desserts.addActionListener(foodListener);
        desserts.addActionListener(new viewAddMenuActionListener(addDessertPane,RMSGui.Tablet));
        //Drinks ActionListeners
        drinks.addActionListener(new viewFoodEditMenuActionListener(drinksEditPane,RMSGui.Tablet));
        drinks.addActionListener(foodListener);
        drinks.addActionListener(new viewAddMenuActionListener(addDrinkPane,RMSGui.Tablet));
        
        appetizers.setActionCommand(Character.toString(ApplicationConstants.APPETIZERS));
        breakfast.setActionCommand(Character.toString(ApplicationConstants.BREAKFAST));
        lunch.setActionCommand(Character.toString(ApplicationConstants.LUNCH));
        dinner.setActionCommand(Character.toString(ApplicationConstants.DINNER));
        drinks.setActionCommand(Character.toString(ApplicationConstants.DRINKS));
        desserts.setActionCommand(Character.toString(ApplicationConstants.DESSERTS));

     
        
        
        
        
        // super(frame,"ADMINISTRATOR LOGIN",true);
        JPanel dialogPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        adminEdit = a;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        //adding the the label for the Username
        userName = new JLabel("Username: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        dialogPanel.add(userName, constraints);

        //addint the text field for the username
        userNameValue = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        userNameValue.requestFocusInWindow();
        dialogPanel.add(userNameValue, constraints);
        

        //adding the Jlabel for the password
        password = new JLabel("Password: ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        dialogPanel.add(password, constraints);

        //adding the  password filed to the message
        passwordValue = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
       
        dialogPanel.add(passwordValue, constraints);

        //adding a border around th panel
        dialogPanel.setBorder(new LineBorder(Color.gray));

        confirm = new JButton("CONFIRM");
        confirm.setMnemonic(KeyEvent.VK_ENTER);
        ActionListener confirmButtonAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //throw new UnsupportedOperationException("Not supported yet.");
                    //authenticating the username and password
                    if (logIn.authentication(getUserName(), getPassword())) {
                        JOptionPane.showMessageDialog(adminLogInDialog.this,
                                "Hello " + getUserName() + "!! YOU HAVE SUCCESSFULLY LOGGED IN.", "LOGIN",
                                JOptionPane.INFORMATION_MESSAGE);
                        succeeded = true;
                        dispose();
                        //AdminEditMenu adminMenu = new AdminEditMenu();
                        //adminMenu.setVisible(true);
                        //adminMenu.setSize(600,723);
                        //adminMenu.setLocation(62,32);
                        //adminEdit.add(adminMenu);
                        RMSGui.Tablet.add(separator);
                        RMSGui.Logo.setVisible(false);
                        RMSGui.enterMenu.setVisible(false);
                        RMSGui.AdminLogin.setVisible(false);
                        appetizers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Edit Appetizers.png")));
                        appetizers.setVisible(true);
                        appetizers.setSize(110,62);
                        appetizers.setLocation(35,48);
                        breakfast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Edit Breakfast.png")));
                        breakfast.setVisible(true);
                        breakfast.setSize(110,62);
                        breakfast.setLocation(35,165);
                        RMSGui.Tablet.add(breakfast);
                        lunch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Edit Lunch.png")));
                        lunch.setVisible(true);
                        lunch.setSize(110,62);
                        lunch.setLocation(35,282);
                        RMSGui.Tablet.add(lunch);
                        dinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Edit Dinner.png")));
                        dinner.setVisible(true);
                        dinner.setSize(110,62);
                        dinner.setLocation(35,399);
                        RMSGui.Tablet.add(dinner);
                        desserts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Edit Desserts.png")));
                        desserts.setVisible(true);
                        desserts.setSize(110,62);
                        desserts.setLocation(35,516);
                        RMSGui.Tablet.add(desserts);
                        drinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Edit Drinks.png")));
                        drinks.setVisible(true);
                        drinks.setSize(110,62);
                        drinks.setLocation(35,633);
                        RMSGui.Tablet.add(drinks);
                        RMSGui.Tablet.add(appetizers);
                        separator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/separator.png")));
                        separator.setVisible(true);
                        separator.setSize(20,750);
                        separator.setLocation(150,30);
                        AdminEditLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/AdminEditLogo.png")));
                        AdminEditLogo.setVisible(true);
                        AdminEditLogo.setSize(350,88);
                        AdminEditLogo.setLocation(275,10);
                        RMSGui.Tablet.add(AdminEditLogo);
                        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Logout Button.png")));
                        Logout.setVisible(true);
                        Logout.setSize(60,30);
                        Logout.setLocation(630,710);
                        RMSGui.Tablet.add(Logout);
                        //appetizersEditPane.setVisible(true);
                        //appetizersEditPane.setSize(522,312);
                        //appetizersEditPane.setLocation(173,78);
                        RMSGui.Tablet.add(appetizersEditPane);
                        
                        
                        
                        repaint();
                    
                    } else {//displaying a false if a username and password are incorrect
                        JOptionPane.showMessageDialog(adminLogInDialog.this, "INVALID USERNAME OR PASSWORD",
                                "LOGIN", JOptionPane.ERROR_MESSAGE);
                        userNameValue.setText("");
                        passwordValue.setText("");
                        succeeded = false;
                    }
                } catch (SAXException ex) {
                    Logger.getLogger(adminLogInDialog.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(adminLogInDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };//end of actionListener
        //attaching the actionListener for confirm button
        confirm.addActionListener(confirmButtonAction);

        cancel = new JButton("CANCEL");

        //actionlistener for cancel button
        ActionListener cancelButtonAction = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                //   throw new UnsupportedOperationException("Not supported yet.");
                dispose();
            }
        };//end of actionListener

        cancel.addActionListener(cancelButtonAction);

        signUp = new JButton("SIGN UP");

        ActionListener signUpButtonAction = new ActionListener() {//signUP start

            @Override
            public void actionPerformed(ActionEvent ae) {
                //   throw new UnsupportedOperationException("Not supported yet.");
                signUpAdmin newUser = new signUpAdmin();
                System.out.println("im in adminlogin dialog");
                newUser.setVisible(true);
                dispose();
            }//action ended
        };//end of sign upactionListener

        signUp.addActionListener(signUpButtonAction);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(confirm);
        buttonPanel.add(cancel);
        buttonPanel.add(signUp);

        getContentPane().add(dialogPanel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.PAGE_END);


        pack();
        setResizable(false);

        // setLocationRelativeTo(frame);

    }//end of constructor

    //method to get the username
    public String getUserName() {
        String temp;
        temp = userNameValue.getText().trim();
        return temp;
    }

    //method to get the password
    public String getPassword() {
        String temp;
        temp = passwordValue.getText().trim();
        return temp;
    }

    //method to check if login was successful
    public boolean isSuccessful() {

        return succeeded;
    }
    
}//end class
