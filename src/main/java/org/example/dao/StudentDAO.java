package org.example.dao;

import org.example.entity.Student;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {

    public void saveStudent(Student student){
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            System.out.println("Cache Mode: "+session.getCacheMode());
            System.out.println(session.getCacheStoreMode());
           transaction = session.beginTransaction();
           session.save(student);
        } catch(Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Student getStudentById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Student.class, id);
        }
    }

}