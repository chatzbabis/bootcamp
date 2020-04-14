/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chatz
 */
public class PrintResults {

    public static void printAllStudents(Database db) {
        System.out.println("*******Students*******");
//        for (Student s : studentList) {
//
//            System.out.println(s);
//        }
        ResultSet resultSet = db.getResultSet("Select * from `individualprojectpartb`.`students`");
        try {
            while (resultSet.next()) {
                System.out.println("Student's Id: " + resultSet.getString(1)
                        + ", First Name: " + resultSet.getString(2)
                        + ", Last Name: " + resultSet.getString(3)
                        + ", Birth Date: " + resultSet.getString(4)
                        + ", Tiution Fees:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void printAllTrainers(Database db) {
        System.out.println("*********Trainers*****");
//                for (Trainer t : trainerList) {
//
//                    System.out.println(t);
//    
//    }

        ResultSet resultSet = db.getResultSet("Select * from `individualprojectpartb`.`trainers`");
        try {
            while (resultSet.next()) {
                System.out.println("Trainer's Id: " + resultSet.getString(1)
                        + ", First Name: " + resultSet.getString(2)
                        + ", Last Name: " + resultSet.getString(3)
                        + ", Subject: " + resultSet.getString(4));

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printAllAssignments(Database db) {
        System.out.println("*********Assignments*****");
//                for (Assignment assig : assignmentList) {
//
//                    System.out.println(assig);
//
//                }

        ResultSet resultSet = db.getResultSet("Select * from `individualprojectpartb`.`assignments`");
        try {
            while (resultSet.next()) {
                System.out.println("Assignments's Id: " + resultSet.getString(1)
                        + ", Title: " + resultSet.getString(2)
                        + ", Description: " + resultSet.getString(3)
                        + ", SubDateTime: " + resultSet.getString(4)
                        + ", total mark: " + resultSet.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printAllCourses(Database db) {
        System.out.println("*********Courses*****");
//                for (Course c : courseList) {
//
//                    System.out.println(c.getTitle());
//                }

        ResultSet resultSet = db.getResultSet("Select * from `individualprojectpartb`.`Courses`");
        try {
            while (resultSet.next()) {
                System.out.println("Course's Id: " + resultSet.getString(1)
                        + ", Title: " + resultSet.getString(2)
                        + ", Stream: " + resultSet.getString(3)
                        + ", Start Date: " + resultSet.getString(4)
                        + ", End Date: " + resultSet.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void printAllStudentsPerCourses(List<Course> courseList,Database db) {
        System.out.println("**********Students Per Course******** ");
        int courseId=inputForSelects.whichCourse(db);

        ResultSet resultSet = db.getResultSet("select courses.title,students.id,firstName,lastName,dateOfBirth,tuitionFees from `individualprojectpartb`.`students`"
                + "  join `course_student` on `course_student`.`student_id`=`students`.`id`"
                + "  join `courses` on `courses`.`id`=`course_student`.`course_id`"
                + "where courses.id="+courseId+";");
        try {
            while (resultSet.next()) {
                System.out.println("Course: " + resultSet.getString(1)
                        + ", Student's id: " + resultSet.getString(2)
                        + ", First name : " + resultSet.getString(3)
                        + ", Last Name: " + resultSet.getString(4)
                        + ", Birth Date: " + resultSet.getString(5)
                        + ", Tuition fees: " + resultSet.getString(6));

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printAllTrainersPerCourse(List<Course>courseList,Database db) {
        System.out.println("**************Trainers Per Course*******");
//        for (Course c : courseList) {
//
//            System.out.println("the " + c.getTitle() + " course has these students:");
//            System.out.println(c.getTrainer());
//        }
int courseId=inputForSelects.whichCourse(db);
        
        ResultSet resultSet = db.getResultSet("select courses.title,trainers.id,firstName,lastName,subject from `trainers`"
                + "	  join `course_trainer` on `course_trainer`.`trainer_id`=`trainers`.`id`"
                + "	  join `courses` on `courses`.`id`=`course_trainer`.`course_id`"
                + "where courses.id="+courseId+";");

        try {
            while (resultSet.next()) {
                System.out.println("Course 's Title: " + resultSet.getString(1)
                        + "Trainer's Id: " + resultSet.getString(2)
                        + ", First Name: " + resultSet.getString(3)
                        + ", Last Name: " + resultSet.getString(4)
                        + ", Subject: " + resultSet.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void printAllAssignmentsPerCourse(List<Course>courseList,Database db) {
        System.out.println("**********Assignments Per Course******** ");
        int courseId=inputForSelects.whichCourse(db);
        ResultSet resultSet = db.getResultSet(" select courses.title, assignments.id,assignments.title,description,subDateTime,totalMark from `assignments`"
                + "  join `course_assignment` on `course_assignment`.`assignment_id`=`assignments`.`id`"
                + "  join `courses` on `courses`.`id`=`course_assignment`.`course_id`"
                + "where courses.id="+courseId+";");
                
        
        try {
            while (resultSet.next()) {
                System.out.println("Course's Title: " + resultSet.getString(1)
                        + "Assignments's Id: " + resultSet.getString(2)
                        + ", Title: " + resultSet.getString(3)
                        + ", Description: " + resultSet.getString(4)
                        + ", SubDateTime: " + resultSet.getString(5)
                        + ", total mark: " + resultSet.getString(6));
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printAllAssignmentsPerStudent(List<Student>studentList,Database db) {
        System.out.println("**********Assignments Per Student******** ");
        
        int studentId=inputForSelects.whichStudent(studentList,db);
        int courseId=inputForSelects.whichCourseOfStudent(studentList,studentId,db);
//        for (Student s : studentList) {
//studentList.get(studentId).getCourseListOfStudent()
//            System.out.println("the" + s.getFirstName() + " " + s.getLastName() + " has these Assignment:");
//            System.out.println(s.getAssignmentListOfStudent());
//
//        }

        ResultSet resultSet = db.getResultSet("SELECT students.firstName,students.lastName,courses.title, student_courses_assignments.assignment_title,student_courses_assignments.totalMark \n"
                + "fROM individualprojectpartb.student_courses_assignments\n"
                + "join students on students.id=student_courses_assignments.student_id\n"
                + "join courses on courses.id=student_courses_assignments.course_id\n"
                + "where students.id="+studentId+" and courses.id="+courseId+";");
        try {
            
            while (resultSet.next()) {
                System.out.println("first Name: " + resultSet.getString(1)
                        + ", Last Name: " + resultSet.getString(2)
                        + ", course's title: " + resultSet.getString(3)
                        + ", assignment's title: " + resultSet.getString(4)
                        + ", total mark: " + resultSet.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void printAllStudentWithMoreThanOneCourse(Database db) {
        System.out.println("**********Students that belong to more than one Courses**********");
//        for (Student s : studentList) {
//
//            if (s.getCourseListOfStudent().size() > 1) {
//                System.out.println(s.getFirstName() + " " + s.getLastName());
//            }
//
//        }

        ResultSet resultSet = db.getResultSet("select * from students"
                + "  join `course_student`on course_student.student_id=students.id"
                + "  group by student_id"
                + "  having count(course_id)>1;");
        try {
            while (resultSet.next()) {
                System.out.println("Student's Id: " + resultSet.getString(1)
                        + ", First Name: " + resultSet.getString(2)
                        + ", Last Name: " + resultSet.getString(3)
                        + ", Birth Date: " + resultSet.getString(4)
                        + ", Tiution Fees:" + resultSet.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrintResults.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void listWithStudentsWithNotSubmitAssignment(List<Student> studentList) {
        boolean flag;
        System.out.print("Enter the Ending Date ");
        LocalDate newDate;
        newDate = AddingData.dateInput("(like: 25/11/2017): ");

        DayOfWeek myDayOfWeek = newDate.getDayOfWeek();
        System.out.println("DayOfWeek: " + myDayOfWeek);
        LocalDate firstDateOfWeek = newDate;
        while (firstDateOfWeek.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDateOfWeek = firstDateOfWeek.minusDays(1);
        }

        LocalDate lastDateOfWeek = firstDateOfWeek.plusDays(4);
        //System.out.println("lastDayOfWeek: " + lastDateOfWeek);
        System.out.println("th students who need to submit one or more assignments after " + firstDateOfWeek + " and before " + lastDateOfWeek + " are: ");
        for (Student s : studentList) {
            flag = false;
            for (Assignment assig : s.getAssignmentListOfStudent()) {
                if (assig.getSubDateTime().isBefore(lastDateOfWeek.plusDays(1)) && assig.getSubDateTime().isAfter(firstDateOfWeek.minusDays(1))) {
                    flag = true;
//                    System.out.println(s.getFirstName()+ " "+s.getLastName());
                }
            }
            if (flag == true) {
                System.out.println(s.getFirstName() + " " + s.getLastName());
            }
        }
    }
}
