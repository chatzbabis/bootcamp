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
public class Android extends phone {
    
    public Android(String brand) {
        super(brand);
    }
     @Override
    public double getPrice(){
    return 24.99;
    }
    
}
