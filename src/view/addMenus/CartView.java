/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.addMenus;

import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
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
    
    public CartView(Cart cart){
        initComponents();
         setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        this.cart = cart;
        Vector<Food> foodItems = cart.getFoodItems();
        Vector<Drink> drinkItems = cart.getDrinkItems();
        for(int i=0;i<cart.getFoodItems().size();i++){
            String name = foodItems.get(i).getName();
            double price = foodItems.get(i).getPrice();
            //checkBoxes.add(new JCheckBox(name+" "+price));
            //add(checkBoxes.get(i));
            add(new JCheckBox(name+" "+price));
        }
        for(int i=0;i<cart.getDrinkItems().size();i++){
            String name = drinkItems.get(i).getName();
            double price = drinkItems.get(i).getPrice();
            //checkBoxes.add(new JCheckBox(name+" "+price));
            //add(checkBoxes.get(i));
            add(new JCheckBox(name+" "+price));
        }
        
        
        
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
