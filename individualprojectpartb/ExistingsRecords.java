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
public class ExistingsRecords {

    public static void getExistingsRecordsFromDatabase(List<Student> studentList, List<Course> courseList, List<Trainer> trainerList, List<Assignment> assignmentList,Database db) {
            ResultSet resultSet = db.getResultSet("Select * from `individualprojectpartb`.`assignments`");
        try {
            while (resultSet.next()) {
                
                Assignment a=new Assignment(resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4));
                assignmentList.add(a);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        resultSet = db.getResultSet("Select * from `individualprojectpartb`.`trainers`");
        try {
            while (resultSet.next()) {
                
                Trainer t=new Trainer(resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4));
                trainerList.add(t);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        resultSet = db.getResultSet("Select * from `individualprojectpartb`.`students`");
        try {
            while (resultSet.next()) {
                Student student=new Student(resultSet.getString(2),resultSet.getString(3),Integer.parseInt(resultSet.getString(4)),resultSet.getString(5));
                studentList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        resultSet = db.getResultSet("Select * from `individualprojectpartb`.`courses`");
        try {
            while (resultSet.next()) {
                Course c=new Course(resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6));
                courseList.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
