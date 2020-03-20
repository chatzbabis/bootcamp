/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author chatz
 */
public interface Driving {
    //variables: compiler will add public final static
    //methods : compiler will add public abstract
      int speed=12;
     void drive();
    public default void slowDown(){
        System.out.println("slowing down");
   
   }
    public default void speedUp(){
        System.out.println("speeding up");
    }
    
    public static int getSpeed(){
            return speed;
    }
    
    
}
