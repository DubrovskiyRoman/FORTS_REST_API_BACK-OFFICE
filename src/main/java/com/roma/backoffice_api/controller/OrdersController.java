package com.roma.backoffice_api.controller;

import com.roma.backoffice_api.dao.OrdersDeals.OrdersDealsDao;

import com.roma.backoffice_api.dao.orders.OrdersDao;
import com.roma.backoffice_api.domain_model.Orders;
import com.roma.backoffice_api.domain_model.OrdersDeals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/forts/back-office/orders")

public class OrdersController {
    @Autowired
    OrdersDao ordersDao;

    @Autowired
    OrdersDealsDao ordersDealsDao;

    // Information for actual orders

    @GetMapping(value = "/actual")
    public ResponseEntity<List<Orders>> findAllActualOrders(){
        List<Orders> orders = ordersDao.findAllActualOrdersRepo();
        return orders !=null && !orders.isEmpty()
                ? new ResponseEntity<>(orders, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Information about orders for client's orders

    @GetMapping(value = "/client-code={clientCode}")
    public ResponseEntity<List<Orders>> findAllOrdersByClientCode(@PathVariable(name="clientCode") String clientCode){
        List<Orders> orders = ordersDao.findAllOrdersByClientCodeDao(clientCode);
        return orders !=null && !orders.isEmpty()
                ? new ResponseEntity<>(orders, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Information about orders with deals

    @GetMapping(value = "/orders-with-deals")
    public ResponseEntity<List<OrdersDeals>> findAllOrdersByClientCode(){
        List<OrdersDeals> ordersDeals = ordersDealsDao.findOrdersWithDealsDao();
        return ordersDeals !=null && !ordersDeals.isEmpty()
                ? new ResponseEntity<>(ordersDeals, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
