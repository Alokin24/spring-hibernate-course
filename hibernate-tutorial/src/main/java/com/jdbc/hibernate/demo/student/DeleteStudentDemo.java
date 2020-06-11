package com.jdbc.hibernate.demo.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Student;

public class DeleteStudentDemo {
  
  public static void main(String[] args) throws Exception {
    
    // create session factory
    SessionFactory factory = new Configuration()
        .configure("hibernate.student.cfg.xml")
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
    
    // get session from factory
    Session session = factory.getCurrentSession();
    
    // begin transaction
    session.beginTransaction();
    
    // delete
    
    /* Delete demo #1
    int id = 2;
    Student refStudent = session.get(Student.class, id);
    session.delete(refStudent);
    */
    
    // Delete demo #2
    
    session.createQuery("delete from Student s where s.id=5").executeUpdate();
    
    
    // commit transaction
    session.getTransaction().commit();
    
    // close factory
    factory.close();
  }

}
