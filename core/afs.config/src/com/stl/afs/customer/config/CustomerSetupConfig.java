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

/**
 * Created by ARNAB on 1/12/2015.
 */
@Configuration
@Import({DataSourceConfig.class})
public class CustomerSetupConfig {
    @Autowired private DataSourceConfig dataSourceConfig;

    @Bean(name="customerSetupService")
    public ICustomerSetupService customerSetupService(){
        CustomerSetupService customerSetupService = new CustomerSetupService();
        customerSetupService.setCustomerSetupDao(customerSetupDao());
        return customerSetupService;
    }

    @Bean(name="customerSetupDao")
    public CustomerSetupDao customerSetupDao(){
        //CustomerSetupDao customerSetupDao = new CustomerSetupDao(dataSourceConfig.sessionFactory());
        //customerSetupDao.setSessionFactory(dataSourceConfig.sessionFactory());
        return new CustomerSetupDao();
    }
}
