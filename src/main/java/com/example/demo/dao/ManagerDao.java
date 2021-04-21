package com.example.demo.dao;

import com.example.demo.hibernate.HibernateSessionFactory;
import com.example.demo.model.Manager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManagerDao {

    public void save(Manager manager) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(manager);
        tx1.commit();
        session.close();
    }

}
