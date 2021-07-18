package controller;

import models.*;
import service.CustomerService;
import service.FlipPodService;
import service.LockerService;
import service.OrderService;
import service.PodService;

public class Driver {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();
        PodService podService = new PodService();
        LockerService lockerService = new LockerService();
//        Scanner ob = new Scanner(System.in);
//        customerService.saveCustomer(new Customer(ob.next,ob.next));
        customerService.saveCustomer(new Customer("c1","abc"));
        podService.savePod(new Pod("p1"));
//        l --> large s --> small
        lockerService.saveLocker(new Locker("l1","p1","l"));
        orderService.saveOrder(new Order("o1","c1","l"));
        
        
        FlipPodService flipPodService = new FlipPodService();
        flipPodService.allocateOrder();
    }

}
