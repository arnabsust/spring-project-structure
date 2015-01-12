package com.stl.afs.employee.dao;

import com.stl.afs.employee.domain.entity.Employee;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ARNAB on 1/11/2015.
 */
public class EmployeeSetupDao {
    private SessionFactory sessionFactory;

    @Transactional(readOnly = true)
    public List<Employee> getAllEmployee() {
        Query query = sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM employees").addEntity(Employee.class);
        return query.list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
