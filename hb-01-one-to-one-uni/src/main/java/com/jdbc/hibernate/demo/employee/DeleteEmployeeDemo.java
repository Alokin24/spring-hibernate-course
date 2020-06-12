package com.jdbc.hibernate.demo.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.entity.Employee;

public class DeleteEmployeeDemo {

  public static void main(String[] args) {
    
    // create factory
    SessionFactory sessionFactory =
        new Configuration()
        .configure("hibernate.employee.cfg.xml")
        .addAnnotatedClass(Employee.class)
        .buildSessionFactory();
    
    // get session
    Session session = sessionFactory.getCurrentSession();
    
    // begin transaction
    session.beginTransaction();
    
    // delete Employee using .delete()
    int id = 6;
    Employee refEmployee = session.get(Employee.class, id);
    
    if (refEmployee != null)
      session.delete(refEmployee);
    
    // commit transaction
    session.getTransaction().commit();
    
    // get session & commit transaction
    session = sessionFactory.getCurrentSession();
    session.beginTransaction();
    
    // delete Employee using HQL
    session.createQuery("delete Employee e where e.firstName='Nikola'").executeUpdate();
    
    // commit transaction
    session.getTransaction().commit();
    
    // close factory
    sessionFactory.close();
  }
}
