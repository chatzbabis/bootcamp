/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chatz
 */
public class InterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee teacher1 = new Teacher("Nick", 1000);
        Employee teacher2 = new Teacher("Mary", 800);
        Employee receptionist = new Receptionist("Peter", 1200);
        Employee director1 = new Director("Andy", 2000);
        Employee director2 = new Director("Jonathan", 2400);
        Director director3 = new Director("Panagiwths", 3000);
        director3.slowDown();

        List<Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist);
        employees.add(director1);
        employees.add(director2);

        for (Employee e : employees) {
            e.work();
        }

        List<Employee> advisers = new ArrayList();
        List<Employee> drivers = new ArrayList();

        boolean isAdvisable = teacher1 instanceof Advisable;
        System.out.println("is teacher1 advisable=" + isAdvisable);

        for (Employee employee : employees) {
            if (employee instanceof Advisable) {
                advisers.add(employee);
            }
            if (employee instanceof Driving) {
                drivers.add(employee);
            }

        }
        System.out.println("----------------");
        System.out.println("Advisers:");
        for (Employee adviser : advisers) {
            System.out.println(adviser.getName());

        }

        System.out.println("----------------");
        System.out.println("drivers:");
        for (Employee driver : drivers) {
            System.out.println(driver.getName());
        }

    }
}
