package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.*;

public class FlipPodService {
    List<Customer>              customers;
    List<Order>                 orders;
    List<Pod>                   pods;
    List<Locker>                lockers;
    List<Order>                 ordersQueue;
    private Map<String, String> orderSheet;
    private CustomerService     customerService = new CustomerService();
    private OrderService        orderService    = new OrderService();
    private LockerService       lockerService   = new LockerService();
    private PodService          podService      = new PodService();

    public FlipPodService() {
        this.customers = customerService.getAllCustomers();
        this.orders = orderService.getAllOrders();
        this.lockers = lockerService.getAllLockers();
        this.pods = podService.getAllPods();
        this.orderSheet = new HashMap<>();
        this.ordersQueue = new ArrayList<>();
    }

    public void allocateOrder() {
        if (orders.size() == 0) {
            System.out.println("There are no orders to be allocated");
            return;
        }
        else {
            for (int i = 0; i < orders.size(); i++) {
                checkPodAvailable();
                checkLockerAvailable();
            }

        }
    }

    private void showOrderSheet(Locker locker, Order order) {
        System.out.print(
                "Locker id" + locker.getId()
                        + " of pod "
                        + locker.getPodId()
                        + "with customer id"
                        + order.getCustomerId()
                        + "and order id "
                        + order.getId());
        ;

    }

    private void assignLockerAndPod(Locker locker, Order order) {
        orderSheet.put(locker.getId(), order.getId());
        showOrderSheet(locker, order);
        lockers.remove(0);
        orders.remove(0);

    }

    private void checkLockerAvailable() {
        if (lockers.size() == 0) {
            System.out.println("No available locker");

        }
        else {
            String orderSize = orders.get(0).getSize();
            for (int i = 0; i < lockers.size(); i++) {
                if (lockers.get(i).getSize().equals(orderSize)) {
                    assignLockerAndPod(lockers.get(i), orders.get(0));
                    break;
                }
                else if (lockers.get(i).getSize().equals("l") && orderSize.contentEquals("s")) {
                    assignLockerAndPodAndAdjustSize(lockers.get(0), orders.get(0));
                    break;
                }
                else {
                    addOrderToQueue(orders.get(0));
                }
            }
        }
    }

    private void addOrderToQueue(Order order) {
        // still not removed from the orders list so that it should be executed
        // first
        ordersQueue.add(order);
        System.out.print(" Order with order id" + order.getId() + "added to the queue");

    }

    private void assignLockerAndPodAndAdjustSize(Locker locker, Order order) {
        orderSheet.put(locker.getId(), order.getId());
        showOrderSheet(locker, order);
        lockers.get(0).setSize("s");
        ;
        orders.remove(0);
    }

    private void checkPodAvailable() {
        if (pods.size() == 0) {
            System.out.println("No pods available");
            return;
        }
        for (int i = 0; i < pods.size(); i++) {
            String podId = pods.get(i).getId();
            for (int j = 0; i < lockers.size(); j++) {
                if (lockers.get(j).getPodId().equals(podId)) {
                    System.out.println("Pod Available");
                }
                else {
                    pods.remove(i);
                }
            }
        }
    }

}
