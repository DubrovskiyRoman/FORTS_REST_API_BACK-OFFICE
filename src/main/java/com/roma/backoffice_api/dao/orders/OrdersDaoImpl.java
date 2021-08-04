package com.roma.backoffice_api.dao.orders;

import com.roma.backoffice_api.domain_model.Orders;
import com.roma.backoffice_api.domain_model.OrdersDeals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersDaoImpl implements OrdersDao {

    @Autowired
    OrdersRepo ordersRepo;

    @Override
    public List<Orders> findAllActualOrdersRepo() {
        return ordersRepo.findAllActualOrdersRepo();
    }

    @Override
    public List<Orders> findAllOrdersByClientCodeDao(String clientCode) {
        return ordersRepo.findAllOrdersByClientCodeRepo(clientCode);
    }


}
