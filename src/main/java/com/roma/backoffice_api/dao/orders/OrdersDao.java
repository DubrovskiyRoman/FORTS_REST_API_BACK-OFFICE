package com.roma.backoffice_api.dao.orders;

import com.roma.backoffice_api.domain_model.Orders;
import com.roma.backoffice_api.domain_model.OrdersDeals;

import java.util.List;

public interface OrdersDao {
    List<Orders> findAllActualOrdersRepo();

    List<Orders> findAllOrdersByClientCodeDao(String clientCode);


}
