/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief;

/**
 *
 * @author chatz
 */
public class Trainer {
    private String fistName;
    private String lastName;
    private String subject;

    public Trainer() {
    }

    public Trainer(String fistName, String lastName, String subject) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.subject = subject;
    }

    
    
    public String getFirstName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String Subject) {
        this.subject = Subject;
    }

    @Override
    public String toString() {
        return "{" + "fistName=" + fistName + ", lastName=" + lastName + ", subject=" + subject + '}';
    }
    
    
    
}
