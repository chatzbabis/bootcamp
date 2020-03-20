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
public class Receptionist extends Employee implements Driving {

    
    public void greet() {
        System.out.println(getName()+"receptionist is greeting");
    }

    public Receptionist(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void drive() {
        System.out.println(getName()+"receptionist is driving");
    }

    @Override
    public void work() {
       greet();
    }
    
}
