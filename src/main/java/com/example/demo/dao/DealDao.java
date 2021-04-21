package com.example.demo.dao;

import com.example.demo.hibernate.HibernateSessionFactory;
import com.example.demo.model.Deal;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DealDao {

    public void save(Deal deal) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(deal);
        tx1.commit();
        session.close();
    }

}
