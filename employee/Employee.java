/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;
/*1. Create class Employee with name and salary.
2. Create subclasses Teacher, Receptionist, Director
3. Teacher teach(), Receptionist greet(), Director guide()
4. Interfaces Advisable, Driving
5. Advisable has method giveAdvice(), Driving has method drive().
6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
7a. Add abstract method work() in Employee.
7b. Each work() method will call the special method each Subclass has.
7c. Ask each employee to work().
8. Separate those that can drive from those that can advice.

*/

/**
 *
 * @author chatz
 */
public abstract class Employee  {
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

   
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    public abstract void work();
    
    
     @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }

    
}
