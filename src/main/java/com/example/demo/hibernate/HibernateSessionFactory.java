package com.example.demo.hibernate;

import com.example.demo.model.Car;
import com.example.demo.model.Client;
import com.example.demo.model.Deal;
import com.example.demo.model.Manager;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;


public class HibernateSessionFactory {

    @Autowired
    private static SessionFactory sessionFactory;

    private HibernateSessionFactory() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Car.class);
                configuration.addAnnotatedClass(Deal.class);
                configuration.addAnnotatedClass(Manager.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Exception!" + e);
            }
        }
        return sessionFactory;
    }
}
