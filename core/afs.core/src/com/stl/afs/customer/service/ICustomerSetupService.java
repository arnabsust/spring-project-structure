package com.stl.afs.customer.service;

import com.stl.afs.customer.domain.entity.Customer;

import java.util.List;

/**
 * Created by ARNAB on 1/10/2015.
 */
public interface ICustomerSetupService {
    public String getCustomerName(Integer customerID);

    public List<Customer> getAllCustomer();
}
