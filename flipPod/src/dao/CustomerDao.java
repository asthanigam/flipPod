package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Customer;

public class CustomerDao {
    private static HashMap<Integer,Customer> customers = new HashMap<Integer,Customer>();
    private static int index = 0;

    public void saveCustomers(Customer cutomerObj) {
        customers.put(index++, cutomerObj); 
    }

    public List<Customer> getAllCustomers() {
        return  new ArrayList<Customer>(customers.values());
    }

}
