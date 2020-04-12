/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author chatz
 */
public class PrintMenus {
    
    public static void menu() {

        System.out.println("1) Create a Student");
        System.out.println("2) Create a Course");
        System.out.println("3) Create an Assignemt");
        System.out.println("4) Create a Trainer");

        System.out.println("5) to continue to next actions");
        System.out.print("Please enter your choice: ");
    }

    public static void menuForInsterts() {
        System.out.println("1) Insert a student to a course");
        System.out.println("2) Insert a trainer to a course");
        System.out.println("3) to continue to printing menu");
       
        System.out.print("Please enter your choice: ");

    }

    public static void menuForPrintings() {
        System.out.println("1) For print all Students");
        System.out.println("2) For print all Trainers");
        System.out.println("3) For print all Assignments");
        System.out.println("4) For print all Courses");
        System.out.println("5) For print all the students per course");
        System.out.println("6) For print all the trainers per course");
        System.out.println("7) For print all all the assignments per course");
        System.out.println("8) For print all the assignments per student");
        System.out.println("9) For printings a list of students that belong to more than one courses");
        System.out.println("10)For printings a list Of Students With NotSubmit Assignment ");
        System.out.println("11)For Exit");
        System.out.print("Please enter your choice: ");

    }
}
