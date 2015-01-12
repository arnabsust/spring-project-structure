package com.stl.afs.customer.dao;

import com.stl.afs.customer.domain.entity.Customer;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ARNAB on 1/10/2015.
 */
public class CustomerSetupDao {
    private SessionFactory sessionFactory;

    public String getCustomerName(Integer customerID) {
        return "Hasib Hasan Tarafder";
    }

    @Transactional(readOnly = true)
    public List<Customer> getAllCustomer() {
        Query query = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM customers").addEntity(Customer.class);
        return query.list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
