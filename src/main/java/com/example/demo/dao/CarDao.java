package com.example.demo.dao;

import com.example.demo.hibernate.HibernateSessionFactory;
import com.example.demo.model.Car;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CarDao {

    public void save(Car car) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(car);
        tx1.commit();
        session.close();
    }

}
