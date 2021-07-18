package service;

import java.util.List;

import dao.CustomerDao;
import models.Customer;

public class CustomerService {
    private CustomerDao customerDao = new CustomerDao();
    public void saveCustomer(Customer cutomerObj) {
        customerDao.saveCustomers(cutomerObj);
    }
    public List<Customer> getAllCustomers()
    {
        return customerDao.getAllCustomers();
    }
}
