package model;

/*
 *Basic Food class Object
 */

/**
 *
 * @author anthonylyons
 */
public class Food {
    private String name;
    private String type; //lunch, dinner, appetizer
    private String Description;
    private double price;
    private int quantity;
    private String picture;

    public Food() {
    }
    
    public Food(String name,String type, String Description, double price, int quantity, String picture){
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
