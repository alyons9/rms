/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anthonylyons
 */
public class Drink {
    private String name;
    private String type; //lunch, dinner, appetizer
    private String Description;
    private double price;
    private int quantity;
    private String picture;

    public Drink() {
    }
    
    public Drink(String name,String type, String Description, double price, int quantity, String picture){
        this.name = name;
        this.Description = Description;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
        this.picture = picture;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
     public String getPic(){
        return picture;
    }
    
}
