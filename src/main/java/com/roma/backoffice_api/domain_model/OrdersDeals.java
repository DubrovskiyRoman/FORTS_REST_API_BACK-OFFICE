package com.roma.backoffice_api.domain_model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OrdersDeals {
    @Id
    //private long id;
    private String instrCode;
    private String orderClientCode;
    private String orderId;
    private long dealNum;
    private BigDecimal dealPrice;
    private Long dealQnt;
    private Date dealsDate;

    public String getInstrCode() {
        return instrCode;
    }

    public void setInstrCode(String instrCode) {
        this.instrCode = instrCode;
    }

    public String getOrderClientCode() {
        return orderClientCode;
    }

    public void setOrderClientCode(String orderClientCode) {
        this.orderClientCode = orderClientCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public long getDealNum() {
        return dealNum;
    }

    public void setDealNum(long dealNum) {
        this.dealNum = dealNum;
    }

    public BigDecimal getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(BigDecimal dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Long getDealQnt() {
        return dealQnt;
    }

    public void setDealQnt(Long dealQnt) {
        this.dealQnt = dealQnt;
    }

    public Date getDealsDate() {
        return dealsDate;
    }

    public void setDealsDate(Date dealsDate) {
        this.dealsDate = dealsDate;
    }

    @Override
    public String toString() {
        return "OrdersDeals{" +
                "instrCode='" + instrCode + '\'' +
                ", orderClientCode='" + orderClientCode + '\'' +
                ", orderId='" + orderId + '\'' +
                ", dealNum=" + dealNum +
                ", dealPrice=" + dealPrice +
                ", dealQnt=" + dealQnt +
                ", dealsDate=" + dealsDate +
                '}';
    }
}
