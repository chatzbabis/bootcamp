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
public class Phones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android=new Android("Xiaomi");
        NonAndroid nonAndroid=new NonAndroid("iPhone");
        System.out.println("The brand of Android is:"+android.getBrand()+" and the price is:"+android.getPrice());
        System.out.println("The brand of Non Android is:"+nonAndroid.getBrand()+" and the price is:"+nonAndroid.getPrice());
    }
    
}
