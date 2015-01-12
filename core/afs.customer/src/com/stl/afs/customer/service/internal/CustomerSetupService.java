package com.stl.afs.customer.service.internal;

import com.stl.afs.customer.dao.CustomerSetupDao;
import com.stl.afs.customer.domain.entity.Customer;
import com.stl.afs.customer.service.ICustomerSetupService;
import com.stl.afs.employee.domain.entity.Employee;
import com.stl.afs.employee.service.IEmployeeSetupService;

import java.util.List;

/**
 * Created by ARNAB on 1/10/2015.
 */
class CustomerSetupService implements ICustomerSetupService {
    private CustomerSetupDao customerSetupDao;
    private IEmployeeSetupService employeeSetupService;

    @Override
    public String getCustomerName(Integer customerID) {
        return customerSetupDao.getCustomerName(customerID);
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Employee> employeeList = employeeSetupService.getAllEmployee();
        return customerSetupDao.getAllCustomer();
    }

    public void setCustomerSetupDao(CustomerSetupDao customerSetupDao) {
        this.customerSetupDao = customerSetupDao;
    }

    public void setEmployeeSetupService(IEmployeeSetupService employeeSetupService) {
        this.employeeSetupService = employeeSetupService;
    }
}
