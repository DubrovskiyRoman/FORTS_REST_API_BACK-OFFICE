package com.roma.backoffice_api.dao.OrdersDeals;

import com.roma.backoffice_api.domain_model.OrdersDeals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersDealsDaoImpl implements OrdersDealsDao {
    @Autowired
    OrdersDealsRepo ordersDealsRepo;
    @Override
    public List<OrdersDeals> findOrdersWithDealsDao() {
        return ordersDealsRepo.findOrdersWithDealsRepo() ;
    }
}
