package com.jdbc.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Student;

public class UpdateStudentDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class)
        .buildSessionFactory();
    
    Session session;
    try {
      session = factory.getCurrentSession();
      session.beginTransaction();
      
      int id = 1;
      
      Student student = session.get(Student.class, id);

      System.out.println(student);
      
      // update student value (just set needed)
      student.setFirstName("Updated Student#1");
      
      session.getTransaction().commit();
      
      session = factory.getCurrentSession();
      session.beginTransaction();
      
      System.out.println("Updating email for all students");
      session.createQuery("update Student s set s.email='foo@gmail.com'").executeUpdate();
      
      session.getTransaction().commit();
      
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {
      factory.close();
    }
  }

}
