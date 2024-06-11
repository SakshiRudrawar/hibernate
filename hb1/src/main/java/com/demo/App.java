
package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con =new Configuration().configure(); 
    	SessionFactory sf = con.buildSessionFactory(); // for connection
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	Student s =new Student();
    	s.setSname("abc");
    	s.setScity("pune");
    	s.setSpercentage(81.22);
    	
    	session.save(s);
    	
    	tx.commit();
    	session.close();
    	
    	
        
    }
}
