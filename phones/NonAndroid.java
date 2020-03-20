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
public class NonAndroid extends phone {
    
    public NonAndroid(String brand) {
        super(brand);
        
    }
    @Override
    public double getPrice(){
    return 37.99;
    }
}
