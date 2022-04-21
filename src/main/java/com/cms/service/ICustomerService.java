package com.cms.service;

import com.cms.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
