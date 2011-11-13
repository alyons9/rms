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
    private Vector<Food> foodItems = new Vector<Food>();
    private Vector<Drink> drinkItems = new Vector<Drink>();
    
    private double total;
    
    public Vector<Food> getFoodItems(){
        return foodItems;
    }

    public void setDrinkItems(Vector<Drink> drinkItems) {
        this.drinkItems = drinkItems;
    }

    public void setFoodItems(Vector<Food> foodItems) {
        this.foodItems = foodItems;
    }
    
    public Vector<Drink> getDrinkItems(){
        return drinkItems;
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
    public void addFoodItem(Food item){
        foodItems.add(item);
    }
    
    public void removeFoodItem(Food item){
        foodItems.remove(item);
    }
    
    public void addDrinkItem(Drink item){
        drinkItems.add(item);
    }
    
    public void removeDrinkItem(Drink item){
        drinkItems.remove(item);
    }
}
