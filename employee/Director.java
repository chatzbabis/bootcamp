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
public class Director extends Employee implements Driving, Advisable {

    
    public void guide(){
        System.out.println(getName()+"Director is guiding");
    }
   

    public Director(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void drive() {
        System.out.println(getName()+"Director is driving");
    }

    @Override
    public void giveAdvise() {
        System.out.println(getName()+"Director is giving advice");
    }

    @Override
    public void work() {
       guide();
    }
    
}
