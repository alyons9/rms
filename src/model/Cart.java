/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Vector;

/**
 * @Class Name: Cart
 * @author anthonylyons
 */
public class Cart {
    private Vector<Food> items = new Vector<Food>();
    private double total;

    public Vector<Food> getItems() {
        return items;
    }

    public void setItems(Vector<Food> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void addToTotal(double price){
        total+=price;
    }
    
    public void subtractFromTotal(double price){
        total-=price;
    }
    public void addItem(Food item){
        items.add(item);
    }
    
    public void removeItem(Food item){
        items.remove(item);
    }
}
