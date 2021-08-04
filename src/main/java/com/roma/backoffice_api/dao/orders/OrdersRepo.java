package com.roma.backoffice_api.dao.orders;

import com.roma.backoffice_api.domain_model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersRepo extends JpaRepository<Orders, Long> {
    @Query(value = "SELECT * " +
            "       FROM orders o " +
            "       WHERE o.download_date=CURRENT_DATE;  ", nativeQuery = true)
    List<Orders> findAllActualOrdersRepo();

    @Query(value = "SELECT * " +
            "       FROM orders o " +
            "       WHERE o.order_client_code=:order_client_code AND o.download_date=CURRENT_DATE; ", nativeQuery = true)
    List<Orders> findAllOrdersByClientCodeRepo(@Param("order_client_code") String clientCode);


}
