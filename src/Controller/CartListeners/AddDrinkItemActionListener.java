/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CartListeners;

import java.awt.event.*;
import model.Cart;
import model.Drink;
/**
 * @Class Name: AddDrinkItemActionListener
 * @author anthonylyons
 */
public class AddDrinkItemActionListener implements ActionListener {
    private Cart cart;
    private Drink item;
    
    public AddDrinkItemActionListener(Drink item, Cart cart){
        this.item = item;
        this.cart = cart;
    }
    
    public void actionPerformed(ActionEvent e){
        cart.addDrinkItem(item);
        cart.addToTotal(item.getPrice());
        for(int i=0;i<cart.getDrinkItems().size();i++){
            System.out.println(cart.getDrinkItems().get(i).getName());
            System.out.println(cart.getTotal());
        }
        
    }
}
