/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chatz
 */
public class SyntheticData {

    public static void insertSyntheticData(List<Student> studentList, List<Course> courseList, List<Trainer> trainerList, List<Assignment> assignmentList,Database db) {
        
        Course course1 = new Course("java", "full time", "back end", "2020-02-01", "2020-04-25");
        Course course2 = new Course("c##", "full time", "back end", "2020-01-01", "2020-03-25");
        
        courseList.add(course1);
        courseList.add(course2);
        
       

        
        
        Assignment assig = new Assignment("individualProjectBrief", "part a", "2020-03-15");
        Assignment assig2 = new Assignment("individualProjectBriefWithSql", "part b", "2020-04-15");
        Assignment assig3 = new Assignment("project1", "part a", "2020-04-5");
        Assignment assig4 = new Assignment("project2", "part b", "2020-04-25");
        assignmentList.add(assig);
        assignmentList.add(assig2);
        assignmentList.add(assig3);
        assignmentList.add(assig4);
        
        
         
        Student student1 = new Student("Babis", "Chatz", 1000, "1991-06-27");
        Student student2 = new Student("Nick", "Kara", 500, "1991-07-27");
        Student student3 = new Student("George", "Mel", 800, "1997-01-22");
        Student student4 = new Student("Semina", "Man", 1200, "1995-11-10");
        Student student5 = new Student("Eliza", "Dalton", 1500, "1993-06-8");
        Student student6 = new Student("Kwnstantina", "Syne", 1000, "1992-03-24");
        Student student7 = new Student("George", "Prist", 900, "1991-02-27");
        Student student8 = new Student("Nick", "Richard", 850, "1999-09-27");
        Student student9 = new Student("John", "Chatz", 750, "1990-06-15");
        Student student10 = new Student("Christin", "Chatz", 300, "1997-06-1");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        // Assignment assig1=new Assignment("Individual Project Brief","");

        
         
        Trainer trainer1 = new Trainer("George", "Kavouras", "java developer");
        Trainer trainer2 = new Trainer("Nick", "Titsia", "Unknown");
        Trainer trainer3 = new Trainer("Peter", "Tosch", "Unknown");
        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);
                       for(Course c:courseList){
                    InsertToDatabase.insertRecordToCourses(c, db);}
                       for(Student s:studentList){
                    InsertToDatabase.insertRecordToStudents(s, db);}
                       for (Trainer t:trainerList){
                    InsertToDatabase.insertRecordToTrainers(t, db);}
                       
                       for (Assignment a:assignmentList){
                    InsertToDatabase.insertRecordToAssignments(a, db);
                       }
        System.out.println("*********************");
        //menu2

    }
    
    
   

}
