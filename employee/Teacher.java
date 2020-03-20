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
public class Teacher extends Employee implements Advisable{

    public void teach() {
        System.out.println(getName()+"teacher is teaching");
    }

    public Teacher(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void giveAdvise() {
            System.out.println(getName()+"Teacher is giving advice!");
    }

    @Override
    public void work() {
        teach();
        
    }
    
}
