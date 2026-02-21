package org.example;

import org.example.dao.StudentDAO;
import org.example.entity.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Create new students
        Student student1 = new Student();
        student1.setName("Amitab Bacchan");
        student1.setEmail("amitab.sharma@example.com");

        Student student2 = new Student();
        student2.setName("Priyanka Chopra");
        student2.setEmail("priyanka.chopra@example.com");

        // Save students
        studentDAO.saveStudent(student1);
        studentDAO.saveStudent(student2);
    }
}