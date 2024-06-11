package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Employee;

public class App {
    public static void main(String[] args) {
        // Load the configuration and build the SessionFactory
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();

        // Open a session and start a transaction
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Create an instance of Employee and save it
        Employee e = new Employee();
        e.setEname("sachin kadam");
        e.setEcompany("tcs");
        e.setEdesignation("java Developer");
        e.setEsalary(70000.00);
        
        Address a = new Address();
        a.setLine1("ganesh apartment");
        a.setLine2("ganesh nagar");
        a.setCity("pune");
        a.setState("MH");
        e.setAddress(a);
        

        session.save(e);

        // Commit the transaction and close the session
        tx.commit();
        session.close();

        // Close the SessionFactory
        sf.close();
    }
}
