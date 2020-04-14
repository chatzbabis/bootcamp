/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chatz
 */
public class Student {
    private String firstName;
    private String lastName;
    private int tuitionFees;
    private LocalDate dateOfBirth;
   private List<Assignment>assignmentListOfStudent=new ArrayList();
   private List<Course>courseListOfStudent=new ArrayList();
    

    public Student() {
    }

    public Student(String firstName, String lastName, int tuitionFees, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tuitionFees = tuitionFees;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-M-d");
        this.dateOfBirth =LocalDate.parse(dateOfBirth,dateFormat) ;
    }
    
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFees() {
        return tuitionFees;
    }

    public void setFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public List<Assignment> getAssignmentListOfStudent() {
        return assignmentListOfStudent;
    }

    public void setAssignmentListOfStudent(Assignment assignment) {
        this.assignmentListOfStudent.add(assignment);
    }

    public List<Course> getCourseListOfStudent() {
        return courseListOfStudent;
    }

    public void setCourseListOfStudent(Course course) {
        this.courseListOfStudent.add(course);
    }
    
    
    

    
    @Override
    public String toString() {
        
        return "\n"+"{" + "firstName=" + firstName + ", lastName=" + lastName + ", tuitionFees=" + tuitionFees + ", dateOfBirth=" + dateOfBirth +'}';
    }
    
    
    
}
