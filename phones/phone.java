/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phones;

/**
 *
 * @author chatz
 */
public abstract class phone {
    
    private String brand;
    private double price;

    public phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(){
        
    }
}
