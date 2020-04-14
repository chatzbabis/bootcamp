/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

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
public class linkedClasses {

    public static void insertStudentsToCourse(List<Course> courseList, List<Student> studentList,Database db) {
        /*
        print all course enter the number with  course that want insert student
        print all Student enter the number with student who want insert him/her to a course
        check if student is there to this course
        
         */
        List<Student> listOfStudentToInsert = new ArrayList();

        int i = 1;
        int j = 1;
        Scanner sc = new Scanner(System.in);
        int indexOfStudent;
        int indexOfCourse;
        double mark;
        int currentAssignment;
        String data;
        String sql;
        //do while for course
        do {
            j = 1;
            for (Course c : courseList) {
                System.out.println(j + ")" + c.getTitle());
                j++;
            }
            System.out.print("enter the number of Course who want to insert Students oR 0 to Continue: ");
            do {
                indexOfCourse = InsertCheckValues.correctInt();
            } while (indexOfCourse > courseList.size());

            //do while for to students to courses
            if (indexOfCourse != 0) {
                if (indexOfCourse <= courseList.size()) {
                    do {
                        i = 1;
                        for (Student s : studentList) {

                            System.out.println(i + ")" + s.getFirstName() + " " + s.getLastName());
                            i++;
                        }
                        System.out.print("enter the number of student who want to insert to the course ro 0 to Continue: ");
                        do {
                            indexOfStudent = InsertCheckValues.correctInt();
                        } while (indexOfStudent > studentList.size());
                        if (indexOfStudent != 0) {
                            //add student to course
                            // listOfStudentToInsert.add(studentList.get(indexOfStudent));
                            if (courseList.get(indexOfCourse - 1).getStudent().contains(studentList.get(indexOfStudent - 1))) {
                                System.out.println(" The student is allready exist in the course");
                            } else {
                                courseList.get(indexOfCourse - 1).getStudent().add(studentList.get(indexOfStudent - 1));
                                studentList.get(indexOfStudent - 1).getCourseListOfStudent().add(courseList.get(indexOfCourse - 1));
                                
                                //insert to table course_students
                                data= "'"+indexOfCourse+"','"+indexOfStudent+"'";  
                                sql = "INSERT INTO `individualprojectpartb`.`course_student` (`course_id`,`student_id`) VALUES (" + data + ");";
                                db.setStatementNonStatic();
                                Statement st = db.getStatement();
                                try {
                                    st.executeUpdate(sql);
                                    
                                } catch (SQLException ex) {
                                    Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

                                }

                                for (Assignment assig : courseList.get(indexOfCourse - 1).getAssignment()) {
                                    System.out.println("Please give me the mark of student for the assignment" + assig.getTitle() + ": ");
                                    mark = InsertCheckValues.correctDouble();
//                        currentAssignment = studentList.get(indexOfCourse - 1).getAssignmentListOfStudent().size() - 1;
//                        studentList.get(indexOfCourse - 1).getAssignmentListOfStudent().get(currentAssignment).setTotalMark(mark);
                                    assig.setTotalMark(mark);
                                    courseList.get(indexOfCourse - 1).getStudent().add(studentList.get(indexOfStudent - 1));
                                studentList.get(indexOfStudent - 1).getCourseListOfStudent().add(courseList.get(indexOfCourse - 1));
                                
                                //insert to table course_students
                                data= "'"+indexOfStudent+"','"+indexOfCourse+"','"+assig.getTitle()+"','"+assig.getTotalMark()+"'";  
                                sql = "INSERT INTO `individualprojectpartb`.`student_courses_assignments` (`student_id`,`course_id`,`assignment_title`,`totalMark`) VALUES (" + data + ");";
                                db.setStatementNonStatic();
                                st = db.getStatement();
                                try {
                                    st.executeUpdate(sql);
                                    
                                } catch (SQLException ex) {
                                    Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

                                }
                                }
                                studentList.get(indexOfStudent - 1).getAssignmentListOfStudent().addAll(courseList.get(indexOfCourse - 1).getAssignment());
                                //add assignments of course to student 

                            }

                        }
                    } while (indexOfStudent != 0);
                }

            }
        } while (indexOfCourse != 0);

    }

    public static void insertTrainerToCourse(List<Course> courseList, List<Trainer> trainerList,Database db) {
        int i = 1;
        int j = 1;
        Scanner sc = new Scanner(System.in);
        int indexOfTrainer;
        int indexOfCourse;
        String data;
        String sql;
        //do while for course
        do {
            j = 1;
            for (Course c : courseList) {
                System.out.println(j + ")" + c.getTitle());
                j++;
            }
            System.out.print("enter the number of Course who want to insert trainer oR 0 to Continue: ");
            do {
                indexOfCourse = InsertCheckValues.correctInt();
            } while (indexOfCourse > courseList.size());

            //do while for to students to courses
            if (indexOfCourse != 0) {
                if (indexOfCourse <= courseList.size()) {
                    do {
                        i = 1;
                        for (Trainer t : trainerList) {

                            System.out.println(i + ")" + t.getFirstName() + " " + t.getLastName());
                            i++;
                        }
                        System.out.print("enter the number of trainer who want to insert to the course ro 0 to Continue: ");
                        do {
                            indexOfTrainer = InsertCheckValues.correctInt();
                        } while (indexOfTrainer > trainerList.size());
                        if (indexOfTrainer != 0) {
                            if (courseList.get(indexOfCourse - 1).getTrainer().contains(trainerList.get(indexOfTrainer - 1))) {
                                System.out.println("The Trainer is allready exist");
                            } else {
                                courseList.get(indexOfCourse - 1).getTrainer().add(trainerList.get(indexOfTrainer - 1));
                                data= "'"+indexOfCourse+"','"+indexOfTrainer+"'";  
                                sql = "INSERT INTO `individualprojectpartb`.`course_trainer` (`course_id`,`trainer_id`) VALUES (" + data + ");";
                                db.setStatementNonStatic();
                                Statement st = db.getStatement();
                                try {
                                    st.executeUpdate(sql);
                                    
                                } catch (SQLException ex) {
                                    Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

                                }
                            }
                        }

//                    for (Student s:courseList.get(indexOfCourse - 1).getStudent()){
//                        System.out.println(s);
//                    }
                    } while (indexOfTrainer != 0);
                }
            }
        } while (indexOfCourse != 0);

    }

    public static void insertAssignmentToCourse(List<Course> courseList, List<Assignment> assignmentList,Database db) {
        int i = 1;
        int j = 1;
        Scanner sc = new Scanner(System.in);
        int indexOfAssignment;
        int indexOfCourse;
        String data;
        String sql;
         //do while for course
        do {
            j = 1;
            for (Course c : courseList) {
                System.out.println(j + ")" + c.getTitle());
                j++;
            }
            System.out.print("enter the number of Course who want to insert assignment oR 0 to Continue: ");
            do {
                indexOfCourse = InsertCheckValues.correctInt();
            } while (indexOfCourse > courseList.size());

            //do while for to students to courses
            if (indexOfCourse != 0) {
                if (indexOfCourse <= courseList.size()) {
                    do {
                        i = 1;
                        for (Assignment a : assignmentList) {

                            System.out.println(i + ")" + a.getTitle());
                            i++;
                        }
                        System.out.print("enter the number of assignment who want to insert to the course ro 0 to Continue: ");
                        do {
                            indexOfAssignment = InsertCheckValues.correctInt();
                        } while (indexOfAssignment > assignmentList.size());
                        if (indexOfAssignment != 0) {
                            if (courseList.get(indexOfCourse - 1).getAssignment().contains(assignmentList.get(indexOfAssignment - 1))) {
                                System.out.println("The assignment is already exist");
                            } else {
                                courseList.get(indexOfCourse - 1).getAssignment().add(assignmentList.get(indexOfAssignment - 1));
                                data= "'"+indexOfCourse+"','"+indexOfAssignment+"'";  
                                sql = "INSERT INTO `individualprojectpartb`.`course_assignment` (`course_id`,`assignment_id`) VALUES (" + data + ");";
                                db.setStatementNonStatic();
                                Statement st = db.getStatement();
                                try {
                                    st.executeUpdate(sql);
                                    
                                } catch (SQLException ex) {
                                    Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);

                                }
                            }
                        }

//                    for (Student s:courseList.get(indexOfCourse - 1).getStudent()){
//                        System.out.println(s);
//                    }
                    } while (indexOfAssignment != 0);
                }
            }
        } while (indexOfCourse != 0);

    }

//    public static void insertAssignmentToStudent(List<Student> studentList, List<Assignment> assignmentList) {
//        int i = 1;
//        int j = 1;
//        Scanner sc = new Scanner(System.in);
//        int indexOfAssignment;
//        int indexOfCourse;
//        double mark;
//        int currentAssignment;
//
//        //do while for course
//        do {
//            j = 1;
//            for (Student s : studentList) {
//                System.out.println(j + ")" + s.getFirstName() + " " + s.getLastName());
//                j++;
//            }
//            System.out.print("enter the number of Student who want to insert assignment oR 0 to EXIT: ");
//            do {
//                indexOfCourse = InsertCheckValues.correctInt();
//            } while (indexOfCourse > studentList.size());
//
//            //do while for to students to courses
//            if (indexOfCourse != 0) {
//                if (indexOfCourse <= studentList.size()) {
//                    do {
//                        i = 1;
//                        for (Assignment a : assignmentList) {
//
//                            System.out.println(i + ")" + a.getTitle());
//                            i++;
//                        }
//                        System.out.print("enter the number of assignment who want to insert to the course ro 0 to EXIT: ");
//                        do {
//                            indexOfAssignment = InsertCheckValues.correctInt();
//                        } while (indexOfAssignment > assignmentList.size());
//                        if (indexOfAssignment != 0) {
//                            if(studentList.get(indexOfCourse - 1).getAssignmentListOfStudent().contains(assignmentList.get(indexOfAssignment - 1)) ){
//                                System.out.println("The assignmen is already exist*********");
//                            }
//                            else {studentList.get(indexOfCourse - 1).getAssignmentListOfStudent().add(assignmentList.get(indexOfAssignment - 1));}
//                        }
//                        System.out.println("Please give me the mark of student: ");
//                        mark = sc.nextDouble();
//                        currentAssignment = studentList.get(indexOfCourse - 1).getAssignmentListOfStudent().size() - 1;
//                        studentList.get(indexOfCourse - 1).getAssignmentListOfStudent().get(currentAssignment).setTotalMark(mark);
//
////                    for (Student s:courseList.get(indexOfCourse - 1).getStudent()){
////                        System.out.println(s);
////                    }
//                    } while (indexOfAssignment != 0);
//                }
//            }
//        } while (indexOfCourse != 0);
//
//    }
}
