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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db = new Database();

//        String sql2="USE individualprojectpartb;";
//    db.setStatementNonStatic();
//        Statement st = db.getStatement();
//        try {
//            
//           int result = st.executeUpdate(sql2);
//           
//
//        } catch (SQLException ex) {
//            Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);
//            
//        }
        int useSchema = Creates.useSchema(db);

        db.truncateTables();

        Scanner sc = new Scanner(System.in);
        int x;
        int x2;
        int x3;
        String x4;
        String valuesOrNo;
        boolean flag = true;
        boolean flag2;
        boolean flag3;
        boolean flag4;

        List<Student> studentList = new ArrayList();
        List<Course> courseList = new ArrayList();

        List<Trainer> trainerList = new ArrayList();
        List<Assignment> assignmentList = new ArrayList();

        ExistingsRecords.getExistingsRecordsFromDatabase(studentList, courseList, trainerList, assignmentList, db);

        System.out.println("DO you want to insert values?");

        if (InsertCheckValues.typeDataOrNot().equals("y")) {

            while (flag) {

                x = InsertCheckValues.rightChoice();

                if (x == 1) {

                    AddingData.addStudent(studentList, db);

                } else if (x == 2) {

                    AddingData.addCourse(courseList, db);

                } else if (x == 3) {

                    AddingData.addAssingnment(assignmentList, db);

                } else if (x == 4) {
                    AddingData.addTrainer(trainerList, db);

                } else if (x == 5) {
//                    InsertToDatabase.insertRecordToCourses(courseList, db);
//                    InsertToDatabase.insertRecordToStudents(studentList, db);
//                    InsertToDatabase.insertRecordToTrainers(trainerList, db);
//                    InsertToDatabase.insertRecordToAssignments(assignmentList, db);
                    flag = false;
                }

            }
        } else {

            SyntheticData.insertSyntheticData(studentList, courseList, trainerList, assignmentList, db);

        }
        flag2 = true;
//        flag4=true;
//        while (flag4){
//            System.out.println("Do you want to enter Assignment to course?");
//            x4=InsertCheckValues.typeDataOrNot();
//            if (x4.equals("y")){
        linkedClasses.insertAssignmentToCourse(courseList, assignmentList, db);
//            }
//            else{
//                flag4=false;
//            }
//        }
        while (flag2) {
            x2 = InsertCheckValues.rightChoiceForInserts();
            if (x2 == 1) {
                linkedClasses.insertStudentsToCourse(courseList, studentList, db);
            } else if (x2 == 2) {
                linkedClasses.insertTrainerToCourse(courseList, trainerList, db);

            } else if (x2 == 3) {
                flag2 = false;
            }

        }
        flag3 = true;
        while (flag3) {
            x3 = InsertCheckValues.rightChoiceForPrintings();
            if (x3 == 1) {
                PrintResults.printAllStudents(db);
            } else if (x3 == 2) {
                PrintResults.printAllTrainers(db);
            } else if (x3 == 3) {
                PrintResults.printAllAssignments(db);

            } else if (x3 == 4) {
                PrintResults.printAllCourses(db);
            } else if (x3 == 5) {
                PrintResults.printAllStudentsPerCourses(courseList, db);
            } else if (x3 == 6) {
                PrintResults.printAllTrainersPerCourse(courseList, db);
            } else if (x3 == 7) {
                PrintResults.printAllAssignmentsPerCourse(courseList, db);

            } else if (x3 == 8) {
                PrintResults.printAllAssignmentsPerStudent(studentList, db);
            } else if (x3 == 9) {
                PrintResults.printAllStudentWithMoreThanOneCourse(db);
            } else if (x3 == 10) {
                PrintResults.listWithStudentsWithNotSubmitAssignment(studentList);
            } else if (x3 == 11) {
                flag3 = false;
            }

        }
    }

}
