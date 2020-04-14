/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chatz
 */
public class InsertToDatabase {

    public static int insertRecordToStudents(Student s, Database db) {
        int result = 0;
        

            String student_data = "'" + s.getFirstName() + "','" + s.getLastName() +  "','" + s.getTuitionFees()+"','"+ s.getDateOfBirth()+"'";
            String sql = "INSERT INTO `individualprojectpartb`.`students` (`firstName`,`lastName`,`tuitionFees`,`dateOfBirth`) VALUES (" + student_data + ");";
            db.setStatementNonStatic();
            Statement st = db.getStatement();
            try {
                result += st.executeUpdate(sql);
                
            } catch (SQLException ex) {
                Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

            }

        
        return result;
    }

    public static int insertRecordToCourses(Course c, Database db) {
        int result = 0;
        

            String course_data = "'" + c.getTitle() + "','" + c.getStream() + "','" + c.getType() + "','" + c.getStart_Date() + "','" + c.getEnd_Date()+"'";
            String sql = "INSERT INTO `individualprojectpartb`.`courses` (`title`,`stream`,`type`,`start_date`,`end_date`) VALUES (" + course_data + ");";
            db.setStatementNonStatic();
            Statement st = db.getStatement();
            try {
                result += st.executeUpdate(sql);
                
            } catch (SQLException ex) {
                Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

            }

        
        return result;
    }

    public static int insertRecordToAssignments(Assignment a, Database db) {
        int result = 0;
        

            String assignment_data = "'" + a.getTitle() + "','" + a.getDescription() + "','" + a.getSubDateTime() + "','" + a.getTotalMark()+"'";
            String sql = "INSERT INTO`individualprojectpartb`.`assignments` (`title`,`description`,`subDateTime`,`totalMark`) VALUES (" + assignment_data + ");";
            db.setStatementNonStatic();
            Statement st = db.getStatement();
            try {
                result += st.executeUpdate(sql);
                
            } catch (SQLException ex) {
                Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

            }

        
        return result;
    }

    public static int insertRecordToTrainers(Trainer t, Database db) {
        int result = 0;
        

            String student_data = "'" + t.getFirstName() + "','" + t.getLastName() + "','" + t.getSubject()+"'";
            String sql = "INSERT INTO `individualprojectpartb`.`trainers` (`firstName`,`lastName`,`subject`) VALUES (" + student_data + ");";
            db.setStatementNonStatic();
            Statement st = db.getStatement();
            try {
                result += st.executeUpdate(sql);
                
            } catch (SQLException ex) {
                Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

            }

        
        return result;
    }

//    public static int insertStudentsToCourse(List<Course> courseList, List<Student> studentList, Database db) {
//        int result = 0;
//        String data;
//        String sql;
//        ResultSet resultSet;
//        for (Course c : courseList) {
//            for (Student s : c.getStudent()) {
//                data = "'" + s. + "','" + t.getLastName() + "','" + t.getSubject();
//            }
//            sql = "INSERT INTO `Customers` (`course_id`,`student_id`) VALUES (" + data + ");";
//            db.setStatementNonStatic();
//            Statement st = db.getStatement();
//            try {
//                result = st.executeUpdate(sql);
//                result++;
//            } catch (SQLException ex) {
//                Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);
//
//            }
//        }
    }

