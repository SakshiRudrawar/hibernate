package com.util;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.model.Department;
import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.model.Subject;

public class HBUtlis {

    public static SessionFactory sf = new Configuration()
            .addProperties(myProperties())
            .addAnnotatedClass(Student.class)
            .addAnnotatedClass(Laptop.class)
            .addAnnotatedClass(Gift.class)
            .addAnnotatedClass(Department.class)
            .addAnnotatedClass(Subject.class)
            .buildSessionFactory();

    private static Properties myProperties() {
        Properties p = new Properties();
        p.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        p.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/hb");
        p.put("hibernate.connection.username", "root");
        p.put("hibernate.connection.password", "1234");

        p.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        p.put("hibernate.hbm2ddl.auto", "update");
        p.put("hibernate.show_sql", "true");
        p.put("hibernate.format_sql", "true");
        
        
        p.put("hibernate.cache.use_second_level_cache", "true");
//        p.put("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");
        
        p.put("hibernate.cache.region.factory_class" , "org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");
        return p;
    }
}











