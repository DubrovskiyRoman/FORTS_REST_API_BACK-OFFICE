package com.roma.backoffice_api.dao.OrdersDeals;

import com.roma.backoffice_api.domain_model.OrdersDeals;

import java.util.List;

public interface OrdersDealsDao {
    List<OrdersDeals> findOrdersWithDealsDao();
}
