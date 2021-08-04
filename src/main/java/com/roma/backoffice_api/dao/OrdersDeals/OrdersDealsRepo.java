package com.roma.backoffice_api.dao.OrdersDeals;

import com.roma.backoffice_api.domain_model.OrdersDeals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersDealsRepo extends JpaRepository<OrdersDeals, Long> {
    @Query(value = "SELECT i.instr_code," +
            "              o.order_client_code, o.order_id, " +
            "\t            d.deal_num, d.deal_price, d.deal_qnt, d.deals_date " +
            "         FROM Instruments i " +
            "         JOIN Orders o " +
            "           ON i.instr_id=o.order_isin" +
            "    LEFT JOIN deals d" +
            "           ON ((d.order_id_buy=CAST(o.order_id AS BIGINT)) " +
            "\t         OR (d.order_id_sell=CAST(o.order_id AS BIGINT))) " +
            "        WHERE o.download_date=CURRENT_DATE AND i.download_date=CURRENT_DATE ;   ", nativeQuery = true)
    List<OrdersDeals> findOrdersWithDealsRepo();


}
