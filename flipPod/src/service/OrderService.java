package service;

import java.util.List;

import dao.OrderDao;
import models.Order;

public class OrderService {
    private OrderDao orderDao = new OrderDao();
    public void saveOrder(Order orderobj) {
        orderDao.saveOrder(orderobj);
    }
    public List<Order> getAllOrders()
    {
        return orderDao.getAllOrders();
    }
    

}
