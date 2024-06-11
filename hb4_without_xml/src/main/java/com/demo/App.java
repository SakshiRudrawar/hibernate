package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;
import com.util.HBUtils;

public class App {

    private static Projection Projection;

	public static void main(String[] args) {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
        
        // -------------------------------------------------display employee by  company in-----------------------------------------------

//        List<String> companies = new ArrayList<>();
//        companies.add("tcs");
//        companies.add("wipro");
//        companies.add("cts");
//
//        List<Employee> list = session.createCriteria(Employee.class)
//                                     .add(Restrictions.in("ecompany", companies))
//                                     .list();
//
//        for (Employee e : list) {
//            System.out.println(e);
//        }
        
        
        
        
        // ---------------------------------display emp order by name------------------------------------------------
        
//        List<Employee> list =session.createCriteria(Employee.class)
//        		.addOrder(Order.asc("ename"))
//        		.list();
//        
//        for(Employee e : list)
//        	System.out.println(e);
        
        
        
        
        // ------------------------------display the emp name only------------------------------
      
//	List<String> list = session.createCriteria(Employee.class)
//    		   .setProjection(Projections.property("ename"))
//    		   .list();
//	
//	for(String e : list)
//		System.out.println(e);

        
        // ---------------------------------find the highest salary of employee-------------------------------
        
        
        
//        Employee e = (Employee) session.createCriteria(Employee.class)
//        		.add(Restrictions.eq("esalary" , session.createCriteria(Employee.class)
//        				.setProjection( Projections.max("esalary"))
//        				.uniqueResult()))
//        						.uniqueResult();
//        
//        System.out.println(e);
//        
//  
        
        
        // find the secound highest salary of emp
        
        Employee e = (Employee) session.createCriteria(Employee.class)
        		.add(Restrictions.eq("esalary", session.createCriteria(Employee.class)
        				.setProjection(Projections.max("esalary "))
        				
        				 .setProjection(Projections.max("esalary"))
        				 .uniqueResult()))
        		
        		.uniqueResult();
        
        System.out.println(e);
        		
        
        
        
        
        
        
        
        
        tx.commit();
        session.close();
    }

		
	
}










