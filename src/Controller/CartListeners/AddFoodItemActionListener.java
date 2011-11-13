/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CartListeners;

import java.awt.event.*;
import model.Cart;
import model.Food;
/**
 * @Class Name: AddFoodItemActionListener
 * @author anthonylyons
 */
public class AddFoodItemActionListener implements ActionListener{
    private Cart cart;
    private Food item;
    public AddFoodItemActionListener(Food item, Cart cart){
        this.item = item;
        this.cart = cart;
    }
    
    public void actionPerformed(ActionEvent e){
        cart.addFoodItem(item);
        cart.addToTotal(item.getPrice());
        for(int i=0;i<cart.getFoodItems().size();i++){
            System.out.println(cart.getFoodItems().get(i).getName());
            System.out.println(cart.getTotal());
        }
        
    }
    
}
