/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chatz
 */
public class inputForSelects {
    
    public static int whichCourse(Database db){
        

        int i;
        int j = 1;
        
        int indexOfCourse;
        
                    
                        i = 1;
//                        for (Student s : studentList) {
//
//                            System.out.println(i + ")" + s.getFirstName() + " " + s.getLastName());
//                            i++;
//                        }
                        ResultSet resultSet = db.getResultSet("select courses.title from courses");
                //+ "where students.id="+studentId+" and courses.id="+courseId+";");
                        
                        try {
            i =1;
            while (resultSet.next()) {
                System.out.println(i+") first Name: " + resultSet.getString(1));
                i++;
                        
                        
            }
            System.out.print("enter the number of student : ");
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
                            do{
                            indexOfCourse = InsertCheckValues.correctInt();
                            }while (indexOfCourse<1 || indexOfCourse>i);
                        return indexOfCourse;
                            
                }
    public static int whichStudent(List<Student> studentList,Database db){
        

        int i;
        int j = 1;
        
        int indexOfStudent;
        
                    
                        i = 1;
//                        for (Student s : studentList) {
//
//                            System.out.println(i + ")" + s.getFirstName() + " " + s.getLastName());
//                            i++;
//                        }
                        ResultSet resultSet = db.getResultSet("SELECT students.firstName,students.lastName,courses.title, student_courses_assignments.assignment_title,student_courses_assignments.totalMark \n"
                + "fROM individualprojectpartb.student_courses_assignments\n"
                + "join students on students.id=student_courses_assignments.student_id\n"
                + "join courses on courses.id=student_courses_assignments.course_id group by students.id ;\n");
                //+ "where students.id="+studentId+" and courses.id="+courseId+";");
                        System.out.print("enter the number of student : ");
                        try {
            i =1;
            while (resultSet.next()) {
                System.out.println(i+") first Name: " + resultSet.getString(1)
                        + ", Last Name: " + resultSet.getString(2));
                i++;
                        
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
                            do{
                            indexOfStudent = InsertCheckValues.correctInt();
                            }while (indexOfStudent<1 || indexOfStudent>i);
                        return indexOfStudent;
                            
                }
    
    public static int whichCourseOfStudent(List<Student> studentList,int k,Database db){
        int i;
        int indexOfCourse;
      
        int j = 1;
        
        
        
                    
                        i = 1;
//                        for (Student s : studentList) {
//
//                            System.out.println(i + ")" + s.getFirstName() + " " + s.getLastName());
//                            i++;
//                        }
                        ResultSet resultSet = db.getResultSet("SELECT students.firstName,students.lastName,courses.title, student_courses_assignments.assignment_title,student_courses_assignments.totalMark \n"
                + "fROM individualprojectpartb.student_courses_assignments\n"
                + "join students on students.id=student_courses_assignments.student_id\n"
                + "join courses on courses.id=student_courses_assignments.course_id group by courses.id;\n");
                //+ "where students.id="+studentId+" and courses.id="+courseId+";");
                        System.out.print("enter the number of student : ");
                        try {
            i =1;
            while (resultSet.next()) {
                System.out.println(i+") first Name: " + resultSet.getString(3));
                        
                i++;
                        
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
                            do{
                            indexOfCourse = InsertCheckValues.correctInt();
                            }while (indexOfCourse<1 || indexOfCourse>i);
                        return indexOfCourse;
                            
                }
    
    
    
    
    
    
    
    
    
    
    
}