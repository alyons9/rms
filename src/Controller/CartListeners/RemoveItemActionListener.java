/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.CartListeners;

import java.awt.event.*;
import model.Cart;
import model.Food;

/**
 * @Class Name: RemoveItemActionListener
 * @author anthonylyons
 */
public class RemoveItemActionListener implements ActionListener{
    private Cart cart;
    private Food item;
    public RemoveItemActionListener(Food item, Cart cart){
        this.item = item;
        this.cart = cart;
    }
    
    public void actionPerformed(ActionEvent e){
        cart.removeItem(item);
        cart.subtractFromTotal(item.getPrice());
        for(int i=0;i<cart.getItems().size();i++){
            System.out.println(cart.getItems().get(i).getName());
            System.out.println(cart.getTotal());
        }
    }
    
}
