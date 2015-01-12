package com.stl.afs.employee.service.internal;

import com.stl.afs.customer.domain.entity.Customer;
import com.stl.afs.customer.service.ICustomerSetupService;
import com.stl.afs.employee.dao.EmployeeSetupDao;
import com.stl.afs.employee.domain.entity.Employee;
import com.stl.afs.employee.service.IEmployeeSetupService;

import java.util.List;

/**
 * Created by ARNAB on 1/11/2015.
 */
class EmployeeSetupService implements IEmployeeSetupService {
    private EmployeeSetupDao employeeSetupDao;
    private ICustomerSetupService customerSetupService;

    @Override
    public List<Employee> getAllEmployee() {
        //List<Customer> customerList = customerSetupService.getAllCustomer();
        return employeeSetupDao.getAllEmployee();
    }

    public void test(){
        List<Customer> customerList = customerSetupService.getAllCustomer();
    }

    public void setEmployeeSetupDao(EmployeeSetupDao employeeSetupDao) {
        this.employeeSetupDao = employeeSetupDao;
    }

    public void setCustomerSetupService(ICustomerSetupService customerSetupService) {
        this.customerSetupService = customerSetupService;
    }
}
