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

    public static int createSchema(Database db){
        int result = 0;
    String sql="CREATE SCHEMA IF NOT EXISTS individualprojectpartb;";
    db.setStatementNonStatic();
        Statement st = db.getStatement();
        try {
            result = st.executeUpdate(sql);
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }

    public static int createTables(Database db) {
        int result = 0;
        String sql = "CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`students` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `firstName` VARCHAR(50) NULL,\n"
                + "  `lastName` VARCHAR(50) NULL,\n"
                + "  `dateOfBirth` DATE NULL,\n"
                + "  `tuitionFees` INT NULL,\n"
                + "  PRIMARY KEY (`id`));\n"
                + "\n"
                + "CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`courses` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `title` VARCHAR(50) NOT NULL,\n"
                + "  `stream` VARCHAR(50) NOT NULL,\n"
                + "  `start_date` DATE NOT NULL,\n"
                + "  `end_date` DATE NOT NULL,\n"
                + "  PRIMARY KEY (`id`));\n"
                + "  \n"
                + "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`trainers` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `firstName` VARCHAR(50) NOT NULL,\n"
                + "  `lastName` VARCHAR(50) NOT NULL,\n"
                + "  `subject` VARCHAR(50) NOT NULL,\n"
                + "  PRIMARY KEY (`id`));\n"
                + "  \n"
                + "  \n"
                + "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`Assignments` (\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `title` VARCHAR(50) NOT NULL,\n"
                + "  `description` VARCHAR(50) NOT NULL,\n"
                + "  `subDateTime` DATE NOT NULL,\n"
                + "  `totalMark` DECIMAL(5,2) NOT NULL,\n"
                + "  UNIQUE INDEX `title_UNIQUE` (`title` ASC) VISIBLE,\n"
                + "  PRIMARY KEY (`id`));\n"
                + "  \n"
                + "  \n"
                + "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`course_assignment`(\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `course_id` INT NOT NULL,\n"
                + "  `assignment_id` INT NOT NULL,\n"
                + "  PRIMARY KEY(`id`),\n"
                + "  CONSTRAINT fk_assignment_id__assignments_id FOREIGN KEY (`assignment_id`) REFERENCES `assignments`(`id`),\n"
                + "  CONSTRAINT fk_course_id__courses_id FOREIGN KEY (`course_id`) REFERENCES `courses`(`id`)\n"
                + "  );\n"
                + "  \n"
                + "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`course_student`(\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `course_id` INT NOT NULL,\n"
                + "  `student_id` INT NOT NULL,\n"
                + "  PRIMARY KEY(`id`),\n"
                + "  CONSTRAINT fk_student_id__students_id FOREIGN KEY (`student_id`) REFERENCES `students`(`id`),\n"
                + "  CONSTRAINT fk_course_id__courses1_id FOREIGN KEY (`course_id`) REFERENCES `courses`(`id`)\n"
                + "  );\n"
                + "  \n"
                + "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`course_trainer`(\n"
                + "  `id` INT NOT NULL AUTO_INCREMENT,\n"
                + "  `course_id` INT NOT NULL,\n"
                + "  `trainer_id` INT NOT NULL,\n"
                + "  PRIMARY KEY(`id`),\n"
                + "  CONSTRAINT fk_trainer_id__trainers_id FOREIGN KEY (`trainer_id`) REFERENCES `trainers`(`id`),\n"
                + "  CONSTRAINT fk_course_id__courses2_id FOREIGN KEY (`course_id`) REFERENCES `courses`(`id`)\n"
                + "  );\n"
                + "  CREATE TABLE IF NOT EXISTS `individualprojectpartb`.`student_courses_assginments` (\n"
                + "  `id` INT NOT NULL,\n"
                + "  `student_id` INT NOT NULL,\n"
                + "  `course_id` INT NOT NULL,\n"
                + "  `assignment_title` VARCHAR(50) NOT NULL,\n"
                + "  `totalMark` DECIMAL(5,2) NOT NULL,\n"
                + "  PRIMARY KEY (`id`),\n"
                + "  INDEX `fk_student_id__students_id_idx` (`student_id` ASC) VISIBLE,\n"
                + "  INDEX `fk_course_id__courses_id_idx` (`course_id` ASC) VISIBLE,\n"
                + "  CONSTRAINT `fk2_student_id__students_id`\n"
                + "    FOREIGN KEY (`student_id`)\n"
                + "    REFERENCES `individualprojectpartb`.`students` (`id`)\n"
                + "    ON DELETE NO ACTION\n"
                + "    ON UPDATE NO ACTION,\n"
                + "  CONSTRAINT `fk2_course_id__courses_id`\n"
                + "    FOREIGN KEY (`course_id`)\n"
                + "    REFERENCES `individualprojectpartb`.`courses` (`id`)\n"
                + "    ON DELETE NO ACTION\n"
                + "    ON UPDATE NO ACTION);";
        db.setStatementNonStatic();
        Statement st = db.getStatement();
        try {
            result = st.executeUpdate(sql);
            return result;

        } catch (SQLException ex) {
            Logger.getLogger(InsertToDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return result;
        }
    }
}
