/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.addMenus;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import model.Cart;
import model.Drink;
import model.Food;

/**
 * @Class Name: CartView
 * @author anthonylyons
 */
public class CartView extends javax.swing.JPanel{
    //private Vector<JCheckBox> checkBoxes;
    private Cart cart;
    public static Vector<Food> foodItems;
    public static Vector<Drink> drinkItems;
    
    public CartView(Cart cartt){
        initComponents();
         setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.cart = cartt;
        
         foodItems = cartt.getFoodItems();
        drinkItems = cartt.getDrinkItems();
        
        JLabel foodLabel = new JLabel("<HTML><B>Food</B></HTML>");
        add(foodLabel);
        for(int i=0;i<cartt.getFoodItems().size();i++){
            String name = foodItems.get(i).getName();
            double price = foodItems.get(i).getPrice();
            //checkBoxes.add(new JCheckBox(name+" "+price));
            //add(checkBoxes.get(i));
            JCheckBox foodCheck = new JCheckBox(name);
            foodCheck.setActionCommand("food");
            add(foodCheck);
        }
        
        JLabel drinksLabel = new JLabel("<HTML><B>Beverages</B></HTML>");
        add(drinksLabel);
        for(int i=0;i<cart.getDrinkItems().size();i++){
            String name = drinkItems.get(i).getName();
            double price = drinkItems.get(i).getPrice();
            //checkBoxes.add(new JCheckBox(name+" "+price));
            //add(checkBoxes.get(i));
            add(new JCheckBox(name));
        }
        JLabel totalPrice = new JLabel("<HTML><B>Total:</B> $"+roundTwoDecimals(cart.getTotal())+"</HTML>");
        add(totalPrice);
        
        JButton deleteButton = new JButton("DELETE SELECTED");
        deleteButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Component[] components = getComponents();
                for (int i = 0; i < components.length; i++) {
                    if(components[i] instanceof JCheckBox){
                        
                    JCheckBox cb = (JCheckBox)components[i];
                    
                    if (cb.isSelected()){
                        System.out.println("With " + cb.getText(  ));
                        
                        if(cb.getActionCommand().equals("food")){
                        for(int j = 0;j<foodItems.size();j++){
                            if(cb.getText().equals(foodItems.get(j).getName())){
                                cart.subtractFromTotal(foodItems.get(j).getPrice());
                                cart.removeFoodItem(foodItems.get(j));
                                remove(cb);
                                break;
                            }
                        }
                        }
                        
                        
                        for(int l = 0;l<drinkItems.size();l++){
                            if(cb.getText().equals(drinkItems.get(l).getName())){
                                cart.subtractFromTotal(drinkItems.get(l).getPrice());
                                cart.removeDrinkItem(drinkItems.get(l));
                                remove(cb);
                                break;
                            }
                        }
                    }
                }
                    repaint();
                }
                
            }
        });
        add(deleteButton);
        
        
    }
    
    double roundTwoDecimals(double d) {
            DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
}
    
     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
    }
    
}
