package com.jdbc.hibernate.demo.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Employee;

public class UpdateEmployeeDemo {

  public static void main(String[] args) {
    
    // create the factory
    SessionFactory factory = 
        new Configuration()
        .configure("hibernate.employee.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();
    
    // create a session
    Session session = factory.getCurrentSession();
    
    // begin transaction
    session.beginTransaction();
    
    // get employee from database and update
    int id = 3;
    Employee refEmployee = session.get(Employee.class, id);
    refEmployee.setFirstName("Updated employee #1");
    
    // commit transaction
    session.getTransaction().commit();
   
    // get another session and begin another transaction
    session = factory.getCurrentSession();
    session.beginTransaction();
    
    // update employees using HQL
    session.createQuery("update Employee e set e.company='Best'").executeUpdate();
    
    // commit changes
    session.getTransaction().commit();
    
    // close factory
    factory.close();
    
    
  }
  
}
