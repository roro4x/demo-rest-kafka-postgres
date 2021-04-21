package com.example.demo.dao;

import com.example.demo.hibernate.HibernateSessionFactory;
import com.example.demo.model.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDao {

    public void save(Client client) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(client);
        tx1.commit();
        session.close();
    }

}
