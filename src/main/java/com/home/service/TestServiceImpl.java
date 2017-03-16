package com.home.service;

import com.home.data.CustomerDAO;
import com.home.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {
    private static final Logger LOG = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    CustomerDAO customerDAO;

    @Override
    public Customer getData()
    {

        return new Customer();
    }

    @Override
    public void saveData(Customer customer)
    {
        customerDAO.save(customer);
    }
}
