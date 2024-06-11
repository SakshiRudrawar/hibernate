package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.model.Subject;
import com.model.Department;
import com.model.Gift;
import com.model.Laptop;
import com.util.HBUtlis;

public class App {
    public static void main(String[] args) 
    {
//        Session session = HBUtlis.sf.openSession();
//        Transaction tx = session.beginTransaction();

        
//        Student s = new Student();
//        s.setSname("PQR");
//        s.setScity("kolhapur");
//        s.setSpercentage(68.32);
//        session.save(s);

        
        
//        Laptop l = new Laptop();
//        l.setLname("asus");
//        l.setLprice(17000);
//        session.save(l);
//        
        
        
//        Student s = session.get(Student.class, 6);
//        Laptop l = session.get(Laptop.class, 4);
//        s.setLaptop(l);
//        l.setStudent(s);
        
        
//        Student s = session.get(Student.class, 4);
//        System.out.println(s);
//        System.out.println(s.getLaptop());
        
    
//        Gift g = new Gift();
//        g.setGname("mouse");
//        g.setGtype("accessories");
//        session.save(g);
        
        
//         int a[] = {12,13,14,15};
//         
//         for(int i=0; i<a.length; i++)
//         {
//        	 Student s = session.get(Student.class, 6);
//         	 Gift g = session.get(Gift.class, a[i]);
//         	 g.setStudent(s); 
//         }
        
        
        
//        Gift g = session.get(Gift.class, 10);
//        System.out.println(g);
//        System.out.println(g.getStudent());
//        

//        
//         Student s = session.get(Student.class, 6);
//         System.out.println(s);
//         
//         for(Gift g : s.getGifts())
//             System.out.println(g);

        
        
//        	Gift g = session.get(Gift.class, 8);
//        	System.out.println(g);
//        	System.out.println(g.getStudent().getLaptop());
        
           		

//        Department d = new Department();
//        d.setDid(3);
//        d.setDname("Medical");
//        session.save(d);
        
        
//        
//		    Department d = session.get(Department.class, 3);
//		   	Student s = session.get(Student.class, 5);
//		   	s.setDepartment(d);
        
        
//        
//        String sub [] = {"english" , "maths" , "physics" , "biology" , "account" , "business analyst" , 
//        		"java" , "os" , "DBMS" , "hemathology" , "anatomy" , "dermatology" , "statictics" , 
//        		"sp" , "human resource" , "computer fundamental" , "data structure" , "environmental study" , "forensic science"};    
//        
//        
//        for(int i=0; i<sub.length;i++)
//        {
//        	Subject s = new Subject();
//        	s.setSname(sub[i]);
//        	session.save(s);
//        }
        
        
        
//        int a[] = {1,4,5,11,12,13,20};
//        
//        for(int i=0; i<a.length;i++)
//        {
//        	Department d = session.get(Department.class, 3);
//        	Subject s = session.get(Subject.class, a[i]);
//        	d.getSubjects().add(s);
//        }
        
        
        
        // display the whole details of student
        
//        Student s = session.get(Student.class, 6);
//        System.out.println("Name of Student:" +s.getSname());
//        System.out.println("Name of Department:" +s.getDepartment().getDname());
//        System.out.println("Name of Laptop:" +s.getLaptop().getLname());
//        System.out.print("Achievements:  ");
//        
//        for(int i=0; i<s.getGifts().size();i++)
//        {
//        	 System.out.print(s.getGifts().get(i).getGname());
//        	 if(i<s.getGifts().size()-1)
//        		 System.out.print(",");
//        }
//        
//        System.out.println("\nSubjects :");
//        
//        for(int i=0; i<s.getDepartment().getSubjects().size();i++)
//        {
//        	 System.out.print(s.getDepartment().getSubjects().get(i).getSname());
//        	 if(i<s.getDepartment().getSubjects().size()-1)
//        		 System.out.print(",");
//        }
        
         // ----------FETCGING TECHNIQUE---------
        
        
        // ------------------suppose we are mention fetchtype is lazy to jo chahiye usko ek ek karke cl karna hoga-----------------------
        
//        Student s = session.get(Student.class, 3);
//        System.out.println(s);
//        System.out.println(s.getLaptop());
//        System.out.println(s.getDepartment());
//        
        // ------------------suppose we mention fetchtype is eager then student call karne se sab ka data aayega------------------
        
        
//        Student s = session.get(Student.class, 3);
//        System.out.println(s);

        
        
        
        //----------CATCHING TECHNIQUE--------
        
        // first level catch
        
//        Student s1 = session.get(Student.class, 1);
//        System.out.println(s1);
//        Student s2 =session.get(Student.class, 1);
//        System.out.println(s2);
//        
		    

        // second level 

    	
    	Session session1 = HBUtlis.sf.openSession();
        Transaction tx1 = session1.beginTransaction();
        
        Session session2 = HBUtlis.sf.openSession();
        Transaction tx2 = session2.beginTransaction();
        
        Student s1 = session1.get(Student.class, 1);
        System.out.println(s1);
        
        Student s2 = session2.get(Student.class, 1);
        System.out.println(s2);
        
        
        
        
        tx1.commit();
        session1.close();
        
        tx2.commit();
        session2.close();
    }
}

















