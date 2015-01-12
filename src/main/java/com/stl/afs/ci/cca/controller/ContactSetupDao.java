package com.stl.afs.ci.cca.controller;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ARNAB on 1/8/2015.
 */
public class ContactSetupDao {
    public ContactSetupDao() {
        System.out.println("-------DAO-------");
    }

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public void showDepedency(){
        Query query = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM customers");
        int i = 0;
        for (Object o : query.list()) {
            i++;
        }
        System.out.println(i);
    }

}
