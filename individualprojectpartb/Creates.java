package mypackage;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chatz
 */
public class Creates {

    public static int useSchema(Database db){
        int result = 0;
    
    String sql2="USE individualprojectpartb;";
    db.setStatementNonStatic();
        Statement st = db.getStatement();
        try {
           
            result = st.executeUpdate(sql2);
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
        
    }

    public static int createTables(Database db) {
        int result = 0;
        String sql_students = "CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`students` ("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `firstName` VARCHAR(50) NULL,"
                + "  `lastName` VARCHAR(50) NULL,"
                + "  `tuitionFees` INT NULL,"
                + "  `dateOfBirth` DATE NULL,"
                + "  PRIMARY KEY (`id`));";
                
                String sql_courses= "CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`courses` ("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `title` VARCHAR(50) NOT NULL,"
                + "  `type` VARCHAR(50) NOT NULL,"
                + "  `stream` VARCHAR(50) NOT NULL,"
                + "  `start_date` DATE NOT NULL,"
                + "  `end_date` DATE NOT NULL,"
                + "  PRIMARY KEY (`id`));";
                
                String sql_trainers= "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`trainers` ("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `firstName` VARCHAR(50) NOT NULL,"
                + "  `lastName` VARCHAR(50) NOT NULL,"
                + "  `subject` VARCHAR(50) NOT NULL,"
                + "  PRIMARY KEY (`id`));";
                
               String sql_Assiognments= "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`Assignments` ("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `title` VARCHAR(50) NOT NULL,"
                + "  `description` VARCHAR(50) NOT NULL,"
                + "  `subDateTime` DATE NOT NULL,"
                + "  `totalMark` DECIMAL(5,2) NOT NULL,"
               
                + "  PRIMARY KEY (`id`));";
                
                String sql_course_assignment= "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`course_assignment`("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `course_id` INT NOT NULL,"
                + "  `assignment_id` INT NOT NULL,"
                + "  PRIMARY KEY(`id`),"
                + "  CONSTRAINT fk_assignment_id__assignments_id FOREIGN KEY (`assignment_id`) REFERENCES `assignments`(`id`),"
                + "  CONSTRAINT fk_course_id__courses_id FOREIGN KEY (`course_id`) REFERENCES `courses`(`id`));";
                
                String sql_course_student= "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`course_student`("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `course_id` INT NOT NULL,"
                + "  `student_id` INT NOT NULL,"
                + "  PRIMARY KEY(`id`),"
                + "  CONSTRAINT fk_student_id__students_id FOREIGN KEY (`student_id`) REFERENCES `students`(`id`),"
                + "  CONSTRAINT fk_course_id__courses1_id FOREIGN KEY (`course_id`) REFERENCES `courses`(`id`)"
                + "  );";
                
                String sql_course_trainer= "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`course_trainer`("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `course_id` INT NOT NULL,"
                + "  `trainer_id` INT NOT NULL,"
                + "  PRIMARY KEY(`id`),"
                + "  CONSTRAINT fk_trainer_id__trainers_id FOREIGN KEY (`trainer_id`) REFERENCES `trainers`(`id`),"
                + "  CONSTRAINT fk_course_id__courses2_id FOREIGN KEY (`course_id`) REFERENCES `courses`(`id`)"
                + "  );";
                String sql_student_courses_assignments= "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`student_courses_assignments` ("
                + "  `id` INT NOT NULL AUTO_INCREMENT,"
                + "  `student_id` INT NOT NULL,"
                + "  `course_id` INT NOT NULL,"
                + "  `assignment_title` VARCHAR(50) NOT NULL,"
                + "  `totalMark` DECIMAL(5,2) NOT NULL,"
                + "  PRIMARY KEY (`id`),"
                + "  INDEX `fk_student_id__students_id_idx` (`student_id` ASC) VISIBLE,"
                + "  INDEX `fk_course_id__courses_id_idx` (`course_id` ASC) VISIBLE,"
                + "  CONSTRAINT `fk2_student_id__students_id`"
                + "    FOREIGN KEY (`student_id`)"
                + "    REFERENCES `individualprojectpartb`.`students` (`id`)"
                + "    ON DELETE NO ACTION"
                + "    ON UPDATE NO ACTION,"
                + "  CONSTRAINT `fk2_course_id__courses_id`"
                + "    FOREIGN KEY (`course_id`)"
                + "    REFERENCES `individualprojectpartb`.`courses` (`id`)"
                + "    ON DELETE NO ACTION"
                + "    ON UPDATE NO ACTION);";
        db.setStatementNonStatic();
        Statement st = db.getStatement();
        try {
            result = st.executeUpdate(sql_students);
            result = st.executeUpdate(sql_courses);
            result = st.executeUpdate(sql_trainers);
            result = st.executeUpdate(sql_Assiognments);
            result = st.executeUpdate(sql_course_assignment);
            result = st.executeUpdate(sql_course_student);
            result = st.executeUpdate(sql_course_trainer);
            result = st.executeUpdate(sql_student_courses_assignments);
            
            
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }
}
