/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chatz
 */
public class AddingData {

    public static void addStudent(List<Student> studentList,Database db) {
        LocalDate newDate;
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter First Name: ");
        student.setFirstName(sc.next());

        System.out.print("Enter Last Name: ");
        student.setLastName(sc.next());

        System.out.print("Enter the Tuition Fees: ");
        student.setFees(InsertCheckValues.correctInt());

        System.out.println("Enter the Date of Birth: ");
        newDate = dateInput("Enter a date (like: 1991/06/17): ");
        student.setDateOfBirth(newDate);

        studentList.add(student);
        //insertRecordToStudent(student,db);
        InsertToDatabase.insertRecordToStudents(student, db);
        
        System.out.println("Student added");
        System.out.println("Do you want to enter another student?");
        if (InsertCheckValues.typeDataOrNot().equals("y")) {
            addStudent(studentList,db);
        }

    }
    
    

    public static void addCourse(List<Course> courseList,Database db) {
        LocalDate newDate;
        Scanner sc = new Scanner(System.in);
        Course course = new Course();
        System.out.print("Enter the Title of Course: ");
        course.setTitle(sc.next());

        System.out.print("Enter the Stream of Course: ");
        course.setStream(sc.next());

        System.out.print("Enter the type of Course: ");
        course.setType(sc.next());

        System.out.println("Enter the starting Date:");
        newDate = dateInput("Enter a date (like: 1991/06/17): ");
        course.setStart_Date(newDate);

        System.out.println("Enter the Ending Date:");
        newDate = dateInput("Enter a date (like: 1991/06/17): ");
        course.setEnd_Date(newDate);

        //Local Date
        courseList.add(course);
        InsertToDatabase.insertRecordToCourses(course, db);
        System.out.println("Course added");
        System.out.println("Do you want to enter another course?");
        if (InsertCheckValues.typeDataOrNot().equals("y")) {
            addCourse(courseList,db);
        }

    }

    public static void addAssingnment(List<Assignment> assignmentList,Database db) {
        LocalDate newDate;
        Scanner sc = new Scanner(System.in);
        Assignment assig = new Assignment();

        System.out.print("Enter the Title of Assignment: ");
        assig.setTitle(sc.next());

        System.out.print("Enter the Description of Assignment: ");
        assig.setDescription(sc.next());

//                    System.out.print("Enter the Mark of Assignment: ");
//                    assig.setTotalMark(correctDouble());
        System.out.println("Enter the Ending Date:");
        newDate = dateInput("Enter a date (like: 1991/06/17): ");
        assig.setSubDateTime(newDate);

        assignmentList.add(assig);
        InsertToDatabase.insertRecordToAssignments(assig, db);
        System.out.println("Assignment added");
        System.out.println("Do you want to enter another Assignment?");
        if (InsertCheckValues.typeDataOrNot().equals("y")) {
            addAssingnment(assignmentList,db);
        }
    }

    public static void addTrainer(List<Trainer> trainerList,Database db) {
        LocalDate newDate;
        Scanner sc = new Scanner(System.in);
        Trainer trainer = new Trainer();
        System.out.print("Enter the First Name of Trainer: ");
        trainer.setFistName(sc.next());
        System.out.print("Enter the Last Name of Trainer: ");
        trainer.setLastName(sc.next());
        System.out.print("Enter the Subject of Trainer: ");
        trainer.setSubject(sc.next());

        trainerList.add(trainer);
        InsertToDatabase.insertRecordToTrainers(trainer, db);
        System.out.println("Trainer added");
        System.out.println("Do you want to enter another Trainer?");
        if (InsertCheckValues.typeDataOrNot().equals("y")) {
            addTrainer(trainerList,db);
        }

    }

    public static LocalDate dateInput(String userInput) {
        boolean flag = true;
        String stringDate;
        LocalDate date = null;
        while (flag) {
            try {
                System.out.println(userInput);
                Scanner sc = new Scanner(System.in);
                String x = sc.next();

                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/M/d");
                date = LocalDate.parse(x, dateFormat);

                System.out.println(date);
                
                flag = false;
            }
        
        catch(DateTimeParseException ex){
                 System.out.println("Please enter a date in the correct format: (yyyy/mm/dd)");
                 }
        }
         return date;
    }

//    boolean flag = true;
//    String startDateInput;
//    LocalDate startDate = null;
//
//    while (flag) {
//
//            startDateInput = sc.nextLine();
//        try {
//            startDate = LocalDate.parse(startDateInput, formatter);
//            boolean secondFlag = true;
//            while (secondFlag) {
//                if (startDate.isBefore(today)) {
//                    System.out.println("Start date must be in the future and in the correct format (dd/mm/yyyy).");
//                    startDateInput = sc.nextLine();
//                    startDate = LocalDate.parse(startDateInput, formatter);
//                } else {
//
//                    secondFlag = false;
//                }
//            }
//            flag = false;
//        } catch (DateTimeParseException ex) {
//            System.out.println("Please enter a date in the correct format: (dd/mm/yyyy)");
//        }
//    }

}
