package com.stl.afs.customer.config;

import com.stl.afs.customer.dao.CustomerSetupDao;
import com.stl.afs.customer.service.ICustomerSetupService;
import com.stl.afs.customer.service.internal.CustomerSetupService;
import com.stl.afs.datasource.config.DataSourceConfig;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

/**
 * Created by ARNAB on 1/12/2015.
 */
@Configuration
@Lazy
public class CustomerSetupConfig {

    @Bean(name="customerSetupDao")
    public CustomerSetupDao customerSetupDao(){
        return new CustomerSetupDao();
    }

    @Bean(name="customerSetupService")
    public ICustomerSetupService customerSetupService(){
//        CustomerSetupService customerSetupService = new CustomerSetupService();
//        customerSetupService.setCustomerSetupDao(customerSetupDao());
        return new CustomerSetupService();
    }

}
