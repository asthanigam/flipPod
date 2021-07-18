package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import models.Order;

public class OrderDao {
    private static HashMap<Integer,Order> orders = new HashMap<Integer,Order>();
    private static int index = 0;

    public void saveOrder(Order orderobj) {
        orders.put(index++, orderobj); 
        
    }

    public List<Order> getAllOrders() {
        return  new ArrayList<Order>(orders.values());
    }

}
